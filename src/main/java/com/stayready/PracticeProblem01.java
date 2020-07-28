package com.stayready;

public class PracticeProblem01
{
    public static boolean isPalidrome(String word)
    {
        StringBuilder builder = new StringBuilder(word);
        String reversedWord = builder.reverse().toString();
        return word.equals(reversedWord);
    }
}
