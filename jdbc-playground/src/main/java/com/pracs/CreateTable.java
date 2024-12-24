package com.pracs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTable {
    public static void main( String[] args ) {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5433/hinduja_24_25_TY";
            String user = "postgres";
            String password = " ";

            Connection con = DriverManager.getConnection(url, user, password);

            String query = "CREATE TABLE weather (\n" +
                    "    id SERIAL PRIMARY KEY,\n" +
                    "    temp FLOAT,\n" +
                    "    city VARCHAR(50),\n" +
                    "    precipitation FLOAT,\n" +
                    "    wind INTEGER,\n" +
                    "    humidity FLOAT,\n" +
                    "    date DATE\n" +
                    ");";
            PreparedStatement pstmt = con.prepareStatement(query);

            boolean status = pstmt.execute();

            if(!status) {
                System.out.println("Weather Table Created Successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}