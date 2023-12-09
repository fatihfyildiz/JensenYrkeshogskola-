package org.example.JUnit_Lektioner9_11.Lektion10_15_11_23;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertTrue;

public class TextUtilityTest {

    @ParameterizedTest
    @ValueSource(strings = {"anna","apa"})
    public void testIsPalindrome(String str){
        TextUtility textUtility= new TextUtility();
        assertTrue(textUtility.isPalindrome(str));

    }

    @ParameterizedTest
    @ValueSource(strings = {"jakob","kalle"})
    public void isNotPalindrome(String str){
        TextUtility textUtility= new TextUtility();
        assertTrue(!textUtility.isPalindrome(str));

    }

}
