package org.example.SQL;

import java.sql.*;

public class SchoolDatabase {
    public static void main(String[] args) {
        createSchoolData();
        insertSchoolData("Fatih",46,89);
        insertSchoolData("Yngve",65,71);
        insertSchoolData("Karin",32,92);
        displaySchoolData();
    }

    public static void createSchoolData(){
        try {
            // Create a school database
            Connection conn = DriverManager.getConnection("jdbc:sqlite:school.db");
            Statement stmt = conn.createStatement();

            // Create a new table
            String students = "CREATE TABLE IF NOT EXISTS users (" +
                    "id INTEGER PRIMARY KEY," +
                    "name TEXT NOT NULL," +
                    "age INTEGER," +
                    "grade INTEGER)";
            stmt.execute(students);
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void insertSchoolData(String name, int age, int grade){
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:school.db");
            String sql = "INSERT INTO users(name, age, grade) VALUES(?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setInt(3, grade);
            pstmt.executeUpdate();

            pstmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void displaySchoolData(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:school.db");
            Statement stmt = conn.createStatement();
            String sql = "SELECT name, age FROM users";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("Name: " + name + ", Age: " + age);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
