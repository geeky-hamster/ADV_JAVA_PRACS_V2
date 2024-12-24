package com.pracs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MumbaiDelhi {
    public static void main( String[] args ) {
        try {
            String url = "jdbc:postgresql://localhost:5432/hinduja_24_25_TY";
            String user = "postgres";
            String password = " ";

            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            String query = "SELECT temp, humidity, city FROM weather \n" +
                    "WHERE city IN('Mumbai', 'Delhi') \n" +
                    "GROUP BY city, temp, humidity \n" +
                    "ORDER BY humidity";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                float temp = rs.getFloat("temp");
                float humidity = rs.getFloat("humidity");
                String city = rs.getString("city");
                System.out.println(
                        "Temperature: " + temp + "C" + "\t Humidity: " + humidity + "%" + "\t City: " + city
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}