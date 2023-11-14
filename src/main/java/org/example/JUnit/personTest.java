package org.example.JUnit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class personTest {

    @Test
    public void fullNameTest(){

        Person person= new Person();

        String actualResult= person.getFullName("Fatih", "Yildiz");

        assertEquals("Fatih Yildiz", actualResult);
    }
}
