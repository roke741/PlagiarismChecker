package com.roke.plagiarismchecker.dao.impl;

import com.roke.plagiarismchecker.dao.interfaces.FileDAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDAOImpl implements FileDAO{
    @Override
    public String readFileContent(File file) throws IOException {
        StringBuilder fileContent = new StringBuilder();
        try (BufferedReader lector = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                fileContent.append(linea).append("\n");
            }
        }
        return fileContent.toString();
    }

    @Override
    public boolean isFileEmpty(File file) throws IOException {
        try (BufferedReader lector = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }
}
