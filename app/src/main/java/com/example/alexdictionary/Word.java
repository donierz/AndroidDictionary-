package com.example.alexdictionary;

import java.util.ArrayList;
import java.util.Dictionary;


public class Word extends MainActivity2 {

    ArrayList<String> DictionarySearch = new ArrayList<String>();
    ArrayList<Word> DictionaryContent = new ArrayList<Word>();

    private int frequency;
    private String meaning;
    private String word;

    public Word(){

        word = "apple";
        frequency = 1;
        meaning = "fruit";

    }

    public Word(String newWord, int frequency, String meaning){

        word = newWord;
        this.frequency = frequency;
        this.meaning = meaning;
    }


    public int getFrequency(String word){
        return frequency;
    }

    public String getMeaning(String word){
        return meaning;
    }

    public void setFrequency(int newFrequency){
        frequency = newFrequency;
    }

    public void setMeaning(String newMeaning){
        meaning = newMeaning;
    }
}
