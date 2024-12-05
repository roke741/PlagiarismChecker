package com.roke.plagiarismchecker.dao.controllers;

import com.roke.plagiarismchecker.dao.impl.FuenteDAOImpl;

import java.sql.SQLException;

public class FuenteController {
    private FuenteDAOImpl daoFuente;

    public FuenteController(){
        daoFuente = new FuenteDAOImpl();
    }

    public String[] cargarFuentes() {
        try {
            return daoFuente.listarFuentes();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new String[0];
    }
}
