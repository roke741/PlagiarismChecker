package com.roke.plagiarismchecker.view.ui;

import javax.swing.*;
import java.awt.*;

public class LoadFileDialog {
    private JDialog dialog;
    private JLabel gifLabel;

    private SwingWorker<Void, Void> worker;

    public LoadFileDialog() {
        dialog = new JDialog((JFrame) null, "Cargando...", true);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        gifLabel = new JLabel(new ImageIcon("C:/Users/Jhordie/Documents/NetBeansProjects/PlagiarismChecker/src/main/resources/icons/load_file_6.gif"));
        dialog.getContentPane().add(gifLabel, BorderLayout.CENTER);

        dialog.pack();
        dialog.setLocationRelativeTo(null);
    }

    public void show() {
        dialog.setVisible(true);
    }

    public void hide() {
        dialog.setVisible(false);
        //dialog.dispose();
    }
    public void executeTask() {
        worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() {
                return null;
            }
            @Override
            protected void done() {
                dialog.dispose();
            }
        };
        worker.execute();
    }
}
