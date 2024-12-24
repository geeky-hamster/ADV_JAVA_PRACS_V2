package com.pracs;
import java.sql.*;

public class App {
    public static void main( String[] args ) {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5433/Office";
            String user = "postgres";
            String password = " ";

            Connection con = DriverManager.getConnection(url, user, password);

            if(con != null) {
                System.out.println("Connection Established!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
