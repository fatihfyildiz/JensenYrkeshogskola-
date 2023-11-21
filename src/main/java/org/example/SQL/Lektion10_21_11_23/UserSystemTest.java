package org.example.SQL.Lektion10_21_11_23;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserSystemTest {

    @Test
    public void TestLogin(){
    UserSystem.CreateDatabase();
    //UserSystem.register("Test1","Test");

    //assertFalse(UserSystem.login("Test1","sgfggfg"));

    //assertTrue(UserSystem.login("Test1","Test"));

    UserSystem.register("Trial","Error"); // This is the home-work to be done
    assertTrue(UserSystem.login("Trial","Error")); // This is the home-work to be done

    }

    @Test
    public void TestChangePassword(){
        UserSystem.changePassword("Test1","NewPass");
        assertTrue(UserSystem.login("Test1","NewPass"));
        assertFalse(UserSystem.login("Test1","Test"));

        UserSystem.changePassword("Test1","Test");
        assertTrue(UserSystem.login("Test1","Test"));

    }

    @Test
    public void TestDeleteUser(){
        //UserSystem.deleteUser("Test1");
        //assertFalse(UserSystem.login("Test1","Test"));
        UserSystem.deleteUser("Trial"); // This is the home-work to be done
        assertFalse(UserSystem.login("Trial","Error")); // This is the home-work to be done
    }
}
