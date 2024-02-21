package kz.aitu.ochenverycoolzoo.data;

import kz.aitu.ochenverycoolzoo.data.interfaces.IDB;

import java.sql.*;

public class PostgresDB implements IDB {
    @Override
    public Connection getConnection() {
        String connectionUrl = "jdbc:postgresql://localhost:5432/webapp";
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "margulan21266");

            return con;
        } catch (Exception e) {
            System.out.println("failed to connect to postgres: " + e.getMessage());

            return null;
        }
    }
}