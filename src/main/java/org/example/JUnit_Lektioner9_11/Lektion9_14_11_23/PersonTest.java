package org.example.JUnit_Lektioner9_11.Lektion9_14_11_23;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class PersonTest {

    @Test
    public void fullNameTest(){

        Person person= new Person();

        String actualResult= person.getFullName("Fatih", "Yildiz");

        assertEquals("Fatih Yildiz", actualResult);
    }

    @Test
    public void stringLengthNull(){

        assertThrows(IllegalArgumentException.class, () -> Person.StringLength(null));
    }
}
