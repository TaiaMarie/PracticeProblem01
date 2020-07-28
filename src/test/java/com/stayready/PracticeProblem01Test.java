package com.stayready;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PracticeProblem01Test 
{   

    @Test
    public void palindromeTest()
    {   
            //given
            String word = "racecar";
            //when
            boolean expected = true;
            boolean actual = PracticeProblem01.isPalidrome(word);
            //then
            assertEquals(expected, actual);
    }
    @Test
    public void palindromeTest2()
    {
            //given
            String word = "sunset";
            //when
            boolean expected = false;
            boolean actual = PracticeProblem01.isPalidrome(word);
            //then
            assertEquals(expected, actual);
    }
    @Test
    public void palindromeTest3()
    {
            //given
            String word = "sos";
            //when
            boolean expected = true;
            boolean actual = PracticeProblem01.isPalidrome(word);
            //then
            assertEquals(expected, actual);
    }
    

}
