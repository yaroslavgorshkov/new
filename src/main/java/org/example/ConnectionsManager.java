package org.example;

import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionsManager {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres", "20052005");
    }
}
