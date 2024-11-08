/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.roke.plagiarismchecker;

import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.roke.plagiarismchecker.view.MainFrame;

/**
 *
 * @author Jhordie
 */
public class PlagiarismChecker {

    public static void main(String[] args) {
        FlatDarkPurpleIJTheme.setup();

        //System.out.println("Hello World!");
        MainFrame mainFrm = new MainFrame();
        mainFrm.setVisible(true);
    }
}
