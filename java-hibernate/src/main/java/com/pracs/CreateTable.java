package com.pracs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
  public static void main(String[] args) {
    String url = "jdbc:postgresql://localhost:5433/Office";
    String username = "postgres";
    String password = " ";

    try (Connection conn = DriverManager.getConnection(url, username, password);
         Statement stmt = conn.createStatement()) {
      String sql = "CREATE TABLE Employee (" +
              "id SERIAL PRIMARY KEY, " +
              "name VARCHAR(200) NOT NULL, " +
              "dept VARCHAR(50) NOT NULL, " +
              "designation VARCHAR(100) NOT NULL, " +
              "salary FLOAT NOT NULL, " +
              "dateofjoin DATE NOT NULL)";
      stmt.execute(sql);
      System.out.println("Table created successfully!");
    } catch (SQLException e) {
      System.out.println("Error creating table: " + e.getMessage());
    }
  }
}
