package org.example.JUnit.Lektion10_15_11_23;

public class LoginPage {

    Database database;

    public LoginPage (Database database){
        this.database= database;
    }

    public String login(String username, String password){
        if (database.login(username, password)){
            return "Inloggad!";
        } else {
            return "Inloggingen misslyckades";
        }
    }

}
