/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.roke.plagiarismchecker.utils;

import com.roke.plagiarismchecker.model.entities.Parrafo;
import java.util.Comparator;

/**
 *
 * @author Jhordie
 */
public class ComparadorParrafos implements Comparator<Parrafo> {
    @Override
    public int compare(Parrafo p1, Parrafo p2) {
        // Lógica para comparar párrafos
        //return p1.getContenido().compareTo(p2.getContenido());
        return 1;
    }
}