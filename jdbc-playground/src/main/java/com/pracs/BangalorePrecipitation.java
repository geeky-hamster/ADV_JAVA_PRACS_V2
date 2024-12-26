package com.pracs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BangalorePrecipitation {
    public static void main(String[] args) {
        try {
            String url = "jdbc:postgresql://localhost:5432/hinduja_24_25_TY";
            String user = "postgres";
            String password = "";

            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            String query = "SELECT temp, precipitation FROM weather WHERE city = 'Bangalore' ORDER BY precipitation DESC";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Temperatures for Bangalore in order of precipitation (from highest to lowest):");

            while (rs.next()) {
                float temp = rs.getFloat("temp");
                float precipitation = rs.getFloat("precipitation");

                System.out.println("Temperature: " + temp + "°C\t Precipitation: " + precipitation);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}