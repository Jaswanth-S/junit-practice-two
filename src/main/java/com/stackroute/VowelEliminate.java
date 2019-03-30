package com.stackroute;

public class VowelEliminate {

    public String[] checkVowelEliminate(String[] words)
    {
        String[] result= new String[words.length];
        for(int i=0;i<words.length;i++)
        {
            result[i]=""+words[i].replaceAll("[AaEeIiOoUu]", "");
        }
        return result;
    }
}
