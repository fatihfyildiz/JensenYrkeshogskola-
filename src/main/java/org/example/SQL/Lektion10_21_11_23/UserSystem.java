package org.example.SQL.Lektion10_21_11_23;

import java.sql.*;
import java.util.Scanner;

public class UserSystem {

        public static void main(String[] args) {
            CreateDatabase();
            while (true){
                Scanner scanner = new Scanner(System.in);
                System.out.println("(1) Login");
                System.out.println("(2) Register");
                System.out.println("(3) Change Password");
                String choice = scanner.nextLine();

                switch (choice){
                    case "1":
                        System.out.println("____Login____");
                        System.out.println("Username : ");
                        String username = scanner.nextLine();
                        System.out.println("Password : ");
                        String password = scanner.nextLine();
                        if (login(username,password)){
                            System.out.println("Logged in");
                        }else {
                            System.out.println("Login failed");
                        }

                        break;
                    case "2":
                        System.out.println("____Register____");
                        System.out.println("Username : ");
                        String username1 = scanner.nextLine();
                        System.out.println("Password : ");
                        String password1 = scanner.nextLine();
                        if (register(username1,password1)){
                            System.out.println("Registered user");
                        }else {
                            System.out.println("Registration failed");
                        }
                        break;

                    case "3":
                        System.out.println("____Change Password____");
                        System.out.println("Username : ");
                        String username2 = scanner.nextLine();
                        System.out.println("Password : ");
                        String password2 = scanner.nextLine();
                        changePassword(username2,password2);
                        break;
                }
            }

        }

        public static void CreateDatabase(){
            try {
                Connection conn = DriverManager.getConnection("jdbc:sqlite:userRepo.db");
                Statement stmt = conn.createStatement();

                String sql = "CREATE TABLE IF NOT EXISTS users (" +
                        "id INTEGER PRIMARY KEY," +
                        "username TEXT NOT NULL UNIQUE," +
                        "password TEXT NOT NULL)";
                stmt.execute(sql);
                stmt.close();
                conn.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        //Check if the username exists in the database and check if the password is correct.
        public static boolean login(String username,String password){

            try{
                Connection conn = DriverManager.getConnection("jdbc:sqlite:userRepo.db");
                String sql = "SELECT password FROM users WHERE username = ?";
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1,username);

                //Execute the query
                ResultSet rs = preparedStatement.executeQuery();

                //Get the first result i.e the user selected from the query.
                if (rs.next()){

                    //Get the password for the user with 'username'
                    String correctPassword = rs.getString("password");
                    if (correctPassword.equals(password)){
                        return true;
                    }

                    //Check if password is correct. Then return true otherwise false

                }else {
                    //There were no results in the result set, meaning that there is no user with that username
                    //Maybe return false?
                    System.out.println("No user");
                    return false;
                }

                rs.close();
                preparedStatement.close();
                conn.close();

                return false;

            }catch (Exception e){
                return false;
            }
        }

        //Save the username and password in the database.
        public static boolean register(String username,String password){

            boolean result= false;


            try {
                Connection conn = DriverManager.getConnection("jdbc:sqlite:userRepo.db");
                String sql = "INSERT INTO users(username,password) VALUES (?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1,username);
                pstmt.setString(2,password);
                pstmt.executeUpdate();

                conn.close();
                pstmt.close();

                return true;

            } catch (SQLException e) {
                return false;

            }


        }

        public static boolean changePassword(String username, String newPassword){
            try {
                Connection conn = DriverManager.getConnection("jdbc:sqlite:userRepo.db");
                String sql = "UPDATE users " +
                            "SET password = ? " +
                            "WHERE username = ?";

                PreparedStatement preparedStatement= conn.prepareStatement(sql);
                preparedStatement.setString(1,newPassword);
                preparedStatement.setString(2,username);

                preparedStatement.executeUpdate();

                return true;

            } catch (Exception e){
                return false;
            }

        }

}
