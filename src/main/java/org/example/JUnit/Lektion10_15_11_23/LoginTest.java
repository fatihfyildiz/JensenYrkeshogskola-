package org.example.JUnit.Lektion10_15_11_23;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LoginTest {

    @Test
    public void testLogin(){
        Database databaseMock= mock(Database.class);

        when(databaseMock.login("Jakob","123")).thenReturn(true);

        LoginPage loginPage= new LoginPage(databaseMock);

        String result= loginPage.login("Jakob","123");

        assertEquals("Inloggad!", result);
    }

}
