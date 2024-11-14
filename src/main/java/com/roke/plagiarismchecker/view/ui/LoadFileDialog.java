package com.roke.plagiarismchecker.view.ui;

import javax.swing.*;
import java.awt.*;

public class LoadFileDialog {
    private LoadDialog frame;
    private JLabel gifLabel;

    public LoadFileDialog() {
        frame = new LoadDialog();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        gifLabel = new JLabel(new ImageIcon("resource/imgs/tu_gif.gif"));
        frame.getContentPane().add(gifLabel, BorderLayout.CENTER);

        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    public void show() {
        frame.setVisible(true);
    }

    public void hide() {
        frame.dispose();
    }
}
