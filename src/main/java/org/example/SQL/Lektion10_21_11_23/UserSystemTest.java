package org.example.SQL.Lektion10_21_11_23;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserSystemTest {

    @Test
    public void TestLogin(){
    UserSystem.CreateDatabase();
    UserSystem.register("Test1","Test");

    assertFalse(UserSystem.login("Test1","sgfggfg"));

    assertTrue(UserSystem.login("Test1","Test"));

    }

}
