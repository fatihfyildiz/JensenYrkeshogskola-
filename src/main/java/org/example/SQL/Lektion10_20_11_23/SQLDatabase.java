package org.example.SQL.Lektion10_20_11_23;

import java.sql.*;

public class SQLDatabase {

    public static void main(String[] args) {
        createDatabase();

        // insertData("Fatih Yildiz", "Fatih@gmail.com");

        // insertData("Lisa","lisa@gmail.com");

        addNew(9,"Ursula","ursula@gmail.com");

        getData();
    }

    public static void createDatabase(){

        try {
            // Create a new database
            Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
            Statement stmt = conn.createStatement();

            // Create a new table
            String sql = "CREATE TABLE IF NOT EXISTS users (" +
                    "id INTEGER PRIMARY KEY," +
                    "name TEXT NOT NULL," +
                    "email TEXT NOT NULL UNIQUE)";
            stmt.execute(sql);
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertData(String name, String email){

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
            String sql = "INSERT INTO users(name, email) VALUES(?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.executeUpdate();

            pstmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getData(){

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
            Statement stmt = conn.createStatement();
            String sql = "SELECT id, name, email FROM users";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addNew(int no, String name, String email){
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.db");
            String sql = "INSERT INTO users(id, name, email) VALUES(?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, no);
            pstmt.setString(2, name);
            pstmt.setString(3, email);
            pstmt.executeUpdate();

            pstmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
