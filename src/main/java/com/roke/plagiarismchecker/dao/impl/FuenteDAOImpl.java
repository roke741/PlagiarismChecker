package com.roke.plagiarismchecker.dao.impl;

import com.roke.plagiarismchecker.dao.interfaces.FuenteDAO;
import com.roke.plagiarismchecker.service.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FuenteDAOImpl extends DBConnection implements FuenteDAO {
    @Override
    public String[] listarFuentes() throws SQLException {
        List<String> sources = new ArrayList<>();
        try {
            Connection connection = DBConnection.getConnection();
            String query = "SELECT * FROM fuentes";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String source = resultSet.getString("texto");
                sources.add(source);
            }
            DBConnection.closeConnection(connection);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return sources.toArray(new String[0]);
    }
}
