package com.roke.plagiarismchecker.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SourcesText {

    //obtengo todas las fuentes de texto de la base de datos
    public static String[] getSourcesText(){
        try {
            Connection connection = DBConnection.getConnection();
            String query = "SELECT * FROM fuentes";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            List<String> sources = new ArrayList<>();
            while (resultSet.next()) {
                String source = resultSet.getString("texto");
                sources.add(source);
            }
            DBConnection.closeConnection(connection);
            return sources.toArray(new String[0]);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
