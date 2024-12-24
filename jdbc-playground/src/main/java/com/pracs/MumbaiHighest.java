package com.pracs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MumbaiHighest {
    public static void main( String[] args ) {
        try {
            String url = "jdbc:postgresql://localhost:5432/hinduja_24_25_TY";
            String user = "postgres";
            String password = " ";

            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            String query = "SELECT MAX(temp) FROM weather WHERE \n" +
                    "city='Mumbai' AND date BETWEEN '2016-01-01' AND '2016-01-31'" ;

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println("Highest Temperature For Mumbai in January 2016 is " + rs.getFloat(1) + "°C");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}