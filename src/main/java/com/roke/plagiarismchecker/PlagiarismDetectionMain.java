package com.roke.plagiarismchecker;

import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.roke.plagiarismchecker.view.PlagiarismDetection;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.SwingUtilities;

/**
 *
 * @author Jhordie
 */
public class PlagiarismDetectionMain {

    public static void main(String[] args) {
        FlatDarkPurpleIJTheme.setup();
        try {
            InputStream inputStream = PlagiarismDetectionMain.class.getResourceAsStream("/banner.txt");
            if (inputStream!= null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = reader.readLine())!= null) {
                    System.out.println(line);
                }
                reader.close();
            } else {
                System.out.println("No se encontró el archivo banner.txt");
            }
            SwingUtilities.invokeLater(new Runnable() {
                public void run(){
                    PlagiarismDetection mainFrm = new PlagiarismDetection();
                    mainFrm.setVisible(true);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
