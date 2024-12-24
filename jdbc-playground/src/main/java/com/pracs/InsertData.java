package com.pracs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
    public static void main( String[] args ) {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5433/hinduja_24_25_TY";
            String user = "postgres";
            String password = " ";

            Connection con = DriverManager.getConnection(url, user, password);

            String query = "INSERT INTO weather (temp, city, precipitation, wind, humidity, date) VALUES\n" +
                    "(25.5, 'Mumbai', 3.0, 25, 20.0, '2016-04-18'),\n" +
                    "(34.0, 'Bangalore', 3.2, 21, 20.0, '2016-02-18'),\n" +
                    "(42.0, 'Delhi', 2.1, 25, 22.0, '2016-05-30'),\n" +
                    "(40.0, 'Delhi', 2.7, 33, 27.0, '2016-06-02'),\n" +
                    "(33.0, 'Mumbai', 3.3, 18, 26.3, '2016-01-05'),\n" +
                    "(33.9, 'Mumbai', 3.2, 18, 26.8, '2016-01-08'),\n" +
                    "(33.4, 'Bangalore', 6.0, 28, 45.0, '2016-02-15'),\n" +
                    "(23.7, 'Thiruvananthapuram', 1.1, 13, 60.0, '2016-05-01'),\n" +
                    "(21.5, 'Goa', 0.0, 15, 50.0, '2016-05-02'),\n" +
                    "(34.2, 'Delhi', 4.0, 18, 35.0, '2016-05-03'),\n" +
                    "(22.0, 'Bangalore', 0.5, 14, 40.0, '2016-02-04'),\n" +
                    "(30.5, 'Agra', 3.2, 27, 38.0, '2016-05-05'),\n" +
                    "(19.0, 'Varanasi', 2.5, 10, 47.0, '2016-05-06'),\n" +
                    "(25.0, 'Chandigarh', 1.0, 16, 32.0, '2016-05-07');";

            PreparedStatement pstmt = con.prepareStatement(query);

            int rowsInserted = pstmt.executeUpdate();

            if(rowsInserted > 0) {
                System.out.println("Rows Inserted Successfully!!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}