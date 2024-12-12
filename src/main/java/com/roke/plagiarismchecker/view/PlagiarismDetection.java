package com.roke.plagiarismchecker.view;

import com.roke.plagiarismchecker.PlagiarismChecker;
import com.roke.plagiarismchecker.ResultChecker;
import com.roke.plagiarismchecker.dao.impl.FileDAOImpl;
import com.roke.plagiarismchecker.dao.interfaces.FileDAO;
import com.roke.plagiarismchecker.utils.Log;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import static com.roke.plagiarismchecker.service.DBConnection.closeConnection;
import static com.roke.plagiarismchecker.service.DBConnection.getConnection;

import com.roke.plagiarismchecker.view.ui.LoadDialog;
import com.roke.plagiarismchecker.view.ui.LoadFileDialog;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author Jhordie
 */
public class PlagiarismDetection extends javax.swing.JFrame {
    private FileDAOImpl fileDAO = new FileDAOImpl();
    LoadFileDialog load = new LoadFileDialog();

    Connection connection;
    Statement statement;
    ResultSet resultSet;
    /**
     * Creates new form MainFrame
     */
    public PlagiarismDetection() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new com.roke.plagiarismchecker.view.ui.PanelRound();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInputUser = new javax.swing.JTextArea();
        btnUploadFile = new javax.swing.JButton();
        btnComprobarPlagio = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextPane();
        btnShowFuentes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Detector de Plagios");
        setMaximumSize(null);
        setMinimumSize(null);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 600));
        setResizable(false);

        panelRound1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 15, 10));
        panelRound1.setRoundBottomLeft(40);
        panelRound1.setRoundBottomRight(40);
        panelRound1.setRoundTopLeft(40);
        panelRound1.setRoundTopRight(40);

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 30)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/detective_42.png"))); // NOI18N
        jLabel1.setText(" DETECTOR DE PLAGIO");

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 0, 16)); // NOI18N

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese su texto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("JetBrains Mono", 1, 14))); // NOI18N
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));

        txtInputUser.setColumns(20);
        txtInputUser.setFont(new java.awt.Font("JetBrains Mono", 0, 16)); // NOI18N
        txtInputUser.setRows(5);
        txtInputUser.setBorder(null);
        jScrollPane1.setViewportView(txtInputUser);

        btnUploadFile.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        btnUploadFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/upload_24.png"))); // NOI18N
        btnUploadFile.setText(" Subir Archivo");
        btnUploadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadFileActionPerformed(evt);
            }
        });

        btnComprobarPlagio.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        btnComprobarPlagio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/preview_24.png"))); // NOI18N
        btnComprobarPlagio.setText(" Comprobar Plagio");
        btnComprobarPlagio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarPlagioActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 51, 51));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        jLabel3.setText("Verifique si su texto o doocumento no contiene plagio");

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("JetBrains Mono", 1, 14))); // NOI18N
        jScrollPane2.setToolTipText("Resultado de la verificacion");
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));

        txtResultado.setBorder(null);
        txtResultado.setFont(new java.awt.Font("JetBrains Mono", 0, 13)); // NOI18N
        jScrollPane2.setViewportView(txtResultado);

        btnShowFuentes.setText("Ver Fuentes");
        btnShowFuentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowFuentesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnUploadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnShowFuentes)
                                .addGap(129, 129, 129)
                                .addComponent(btnComprobarPlagio, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(300, 300, 300)
                        .addComponent(btnExit)
                        .addGap(14, 14, 14))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(319, 319, 319))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExit))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUploadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComprobarPlagio, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowFuentes))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("Sistema para detectar plagios en textos");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
        //System.exit(1);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnComprobarPlagioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarPlagioActionPerformed
        String textoUsuario = txtInputUser.getText();
        StyledDocument doc = txtResultado.getStyledDocument();
        if (textoUsuario.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un texto para comprobar el plagio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (textoUsuario.length() < 10) {
            JOptionPane.showMessageDialog(null, "El texto ingresado es muy corto", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        load.show();
        PlagiarismChecker checker = new PlagiarismChecker();
        Style style = doc.addStyle("style", null);
        //divir un texto en palabras y almacenarlas en un arreglo
        //String[] palabras = textoUsuario.split(" ");
        /*
        try {
            doc.insertString(doc.getLength(), "Línea 1\n", style);

            StyleConstants.setForeground(style, Color.ORANGE);
            doc.insertString(doc.getLength(), "Línea 3\n", style);

            StyleConstants.setForeground(style, Color.WHITE);
            doc.insertString(doc.getLength(), "Línea 4\n", style);

        } catch (BadLocationException e) {
            System.out.println("Error al insertar texto");
        }*/
        try {

            ResultChecker result = checker.verifyPlagiarism(textoUsuario);
            if (result != null) {
                if (result.isPlagiarized()) {
                    StyleConstants.setForeground(style, Color.ORANGE);
                    doc.insertString(doc.getLength(), "EL TEXTO INGRESADO CONTIENE PLAGIO\n" + result.toString() + "\n\n", style);
                } else {
                    doc.insertString(doc.getLength(), "EL TEXTO INGRESADO NO CONTIENE PLAGIO\n", style);
                }
            } else {
                StyleConstants.setForeground(style, Color.RED);
                doc.insertString(doc.getLength(), "ERROR AL COMPROBAR SI HAY PLAGIO\n", style);
            }

        } catch (BadLocationException e) {
            throw new RuntimeException(e);
        } finally {
            closeConnection(connection);
        }
        load.hide();

    }//GEN-LAST:event_btnComprobarPlagioActionPerformed

    private void btnUploadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        try {
            fileChooser.setDialogTitle("Selecciona un documento de texto");
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos de texto", "txt"));
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            int isSelectedFile = fileChooser.showSaveDialog(null);

            if (isSelectedFile == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                if (!file.getAbsolutePath().endsWith(".txt")) {
                    JOptionPane.showMessageDialog(null, "El archivo seleccionado no es un archivo de texto (.txt)", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                load.show();
                Log.info("Archivo seleccionado - " + file);
                try {
                    String fileContent = fileDAO.readFileContent(file);
                    load.hide();
                    if (fileDAO.isFileEmpty(file)) {
                        JOptionPane.showMessageDialog(null, "El archivo seleccionado está vacío", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Archivo cargado correctamente", "Info", JOptionPane.INFORMATION_MESSAGE);
                        txtInputUser.setText(fileContent);
                    }
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            if (isSelectedFile == JFileChooser.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "No se seleccionó ningún archivo", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            Log.info("Error al subir archivo - " + e.getMessage());
        }
    }//GEN-LAST:event_btnUploadFileActionPerformed

    private void btnShowFuentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFuentesActionPerformed
        //TableFuentes tableFuentes = new TableFuentes();
        //tableFuentes.setVisible(true);
        //abrir la ventana de fuentes sin que se cierre la ventana principal
        TableFuentes tableFuentes = new TableFuentes();
        tableFuentes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tableFuentes.setVisible(true);
    }//GEN-LAST:event_btnShowFuentesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlagiarismDetection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlagiarismDetection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlagiarismDetection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlagiarismDetection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlagiarismDetection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprobarPlagio;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnShowFuentes;
    private javax.swing.JButton btnUploadFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.roke.plagiarismchecker.view.ui.PanelRound panelRound1;
    private javax.swing.JTextArea txtInputUser;
    private javax.swing.JTextPane txtResultado;
    // End of variables declaration//GEN-END:variables
}
