package com.roke.plagiarismchecker;

import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.*;

import com.roke.plagiarismchecker.view.SplashScreen;
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
        UIManager.put( "ProgressBar.arc", 999 );

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
                    SplashScreen splash = new SplashScreen();
                    splash.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("icons/detective.png")).getImage());
                    splash.setVisible(true);
                }
            });
        } catch (Exception e) {
            System.out.println("Error al cargar el banner");
            e.printStackTrace();
        }
        
    }
}
