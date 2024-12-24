package com.pracs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BangaloreTemp {
    public static void main( String[] args ) {
        try {
            String url = "jdbc:postgresql://localhost:5432/hinduja_24_25_TY";
            String user = "postgres";
            String password = " ";

            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            String query = "SELECT temp, date FROM weather WHERE \n" +
                    "city = 'Bangalore' AND date BETWEEN '2016-02-01' AND '2016-02-29'";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Temperature Of Bangalore for February 2016: ");

            while (rs.next()) {
                float temp = rs.getFloat("temp");
                String date = rs.getDate("date").toString();

                System.out.println("Date: " + date + "\t Temperature: " + temp + "°C");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}