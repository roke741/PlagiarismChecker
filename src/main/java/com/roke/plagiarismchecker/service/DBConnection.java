package com.roke.plagiarismchecker.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    //private static final String URL = "jdbc:postgresql://localhost:5432/detector_plagio";
    private static final String URL = "jdbc:postgresql://aws-0-us-east-1.pooler.supabase.com:6543/postgres?user=postgres.eysilxypduebrzhaophj&password=.dJpm8Apx8dWTeP";
    private static final String USER = "postgres.eysilxypduebrzhaophj";
    //private static final String PASSWORD = "roke741";
    private static final String PASSWORD = ".dJpm8Apx8dWTeP";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
