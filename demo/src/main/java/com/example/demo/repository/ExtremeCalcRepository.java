package com.example.demo.repository;

import java.sql.*;
import org.springframework.stereotype.Repository;

@Repository
public class ExtremeCalcRepository {

    public void add() throws Exception {
        System.out.println("add");
    }
    public void databaseConnection() throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection conn=DriverManager.getConnection("jdbc:postgresql://localhost:5433/databaseDemo","postgres","1804");
        System.out.println("Connected to PostgreSQL database");
        if(conn != null)
        System.out.println("Database connection established");
        else
            System.out.println("Database connection failed");
    }
}
