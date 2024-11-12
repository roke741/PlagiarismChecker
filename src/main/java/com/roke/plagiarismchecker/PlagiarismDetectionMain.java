package com.roke.plagiarismchecker;

import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.roke.plagiarismchecker.view.PlagiarismDetection;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author Jhordie
 */
public class PlagiarismDetectionMain {

    public static void main(String[] args) {
        FlatDarkPurpleIJTheme.setup();
        UIManager.put("Button.arc", 30);
        UIManager.put( "ScrollBar.showButtons", true );
        UIManager.put( "ScrollBar.thumbArc", 30 );
        UIManager.put( "ScrollBar.thumbInsets", new Insets( 2, 2, 2, 2 ) );
        try {
            InputStream inputStream = PlagiarismDetectionMain.class.getClassLoader().getResourceAsStream("banner.txt");
            if (inputStream!= null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = reader.readLine())!= null) {
                    System.out.println(line);
                }
                reader.close();
            } else {
                System.out.println("No se pudo cargar el banner");
            }
            SwingUtilities.invokeLater(new Runnable() {
                public void run(){
                    PlagiarismDetection mainFrm = new PlagiarismDetection();
                    mainFrm.setVisible(true);
                }
            });
        } catch (Exception e) {
            System.out.println("Error al cargar el banner");
            e.printStackTrace();
        }
        
    }
}
