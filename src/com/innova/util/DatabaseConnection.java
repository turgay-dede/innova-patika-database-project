package com.innova.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection extends DatabaseInformation {
    private Connection connection;
    private String url = this.getUrl();
    private String userName = this.getUserName();
    private String password = this.getUserPassword();

    private static DatabaseConnection instance;

    private DatabaseConnection() {
        try {
            Class.forName(this.getForNaneData());
            System.out.println("Driver Success !!!");
            this.connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connection Success !!!");
        } catch (Exception e) {
            System.out.println("Error Connection failed !!!");
            e.printStackTrace();
        }
    }

    public static DatabaseConnection getInstance() {
        try {
            if(instance==null)
                instance=new DatabaseConnection();
            else if(instance.connection.isClosed())
                instance=new DatabaseConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public DatabaseConnection setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }

    public static void main(String[] args) {
        //DatabaseConnection databaseConnection=new DatabaseConnection();
    }
}
