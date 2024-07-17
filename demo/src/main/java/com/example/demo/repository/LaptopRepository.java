package com.example.demo.repository;

import com.example.demo.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@Repository
public class LaptopRepository {

    private int laptopid;
    private String laptopname;



    private Connection databaseConnection() throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection conn= DriverManager.getConnection("jdbc:postgresql://localhost:5433/databaseDemo","postgres","1804");
        System.out.println("Connected to PostgreSQL database");
        if(conn != null)
        { System.out.println("Database connection established");
            return conn;}
        else{
            System.out.println("Database connection failed");
            return null;
        }
    }

    public void insertInfo(int id,String name) throws Exception
    {
        laptopid=id;
        laptopname=name;
        Connection conn=databaseConnection();
        if(conn!=null)
        {
            PreparedStatement ps=conn.prepareStatement("insert into laptop values(?,?)");
            ps.setInt(1,laptopid);
            ps.setString(2,laptopname);
            boolean result=ps.execute();

            if(result)
            {
                System.out.println("Inserted Failed");
            }
            else {
                System.out.println("Insertion Successfully");
            }
        }

    }

}
