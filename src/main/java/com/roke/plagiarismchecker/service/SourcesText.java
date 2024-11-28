package com.roke.plagiarismchecker.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SourcesText {

    public static String[] getSourcesText(){
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
