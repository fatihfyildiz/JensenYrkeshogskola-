package org.example.SQL.Lektion10_20_11_23;

import java.sql.*;

public class SchoolDatabase {
    public static void main(String[] args) {
        createSchoolData();

        insertSchoolData("Fatih", 46, 89);
        insertSchoolData("Yngve", 65, 71);
        insertSchoolData("Karin", 32, 92);

        updateAge("Karin",59);

        displaySchoolData();

        deleteStudent("Yngve"); // deleteStudent("Yngve' OR name = 'Karin")
        // Since Java reads starting/ending with ' we should use ' after Yngve and before Karin

        displaySchoolData();
    }

    public static void createSchoolData() { // Exercise 7: Create tables
        try {
            // Create a school database
            Connection conn = DriverManager.getConnection("jdbc:sqlite:school.db");
            Statement stmt = conn.createStatement();

            // Create a new table
            String students = "CREATE TABLE IF NOT EXISTS students (" +
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

    public static void insertSchoolData(String name, int age, int grade) { // Exercise 8: Insert data

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:school.db");
            String sql = "INSERT INTO students (name, age, grade) VALUES(?, ?, ?)";
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

    public static void displaySchoolData() { // Exercise 9: Retrieve and display data
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:school.db");
            Statement stmt = conn.createStatement();
            String sql = "SELECT name, age FROM students ";
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

    public static void updateAge(String name, int newAge) { // Exercise 10: Update records
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:school.db");
            String sql = "UPDATE students SET age = ? WHERE name = ?";

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setInt(1, newAge);
            pstmt.setString(2,name);
            pstmt.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

    // Exercise 10: Delete records
    // ==> follow from GitHob of lärare/teacher

    public static void deleteStudent(String name){
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:school.db");
            String sql = "DELETE FROM students WHERE name = '" + name + "'";
            System.out.println(sql);
            Statement stmnt = conn.createStatement();
            stmnt.execute(sql);

        } catch (SQLException e){
            throw new RuntimeException(e);
        }

    }

}
