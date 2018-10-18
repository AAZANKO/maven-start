package by.itacademy.dao;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@NoArgsConstructor
public class ConnectionManager {

    private static final String URL = "jdbc:postgresql://localhost:5432/it_academy";
    private static final String LOGIN = "postgres";
    private static final String PASSWORD = "admin";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, LOGIN, PASSWORD);
    }
}
