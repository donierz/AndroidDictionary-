package com.example.alexdictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private EditText Word;
    private EditText Frequency;
    private EditText Meaning;
    int freq;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final DictionaryAlgorithm dic = new DictionaryAlgorithm();
        final Word wd = new Word();


        Word = findViewById(R.id.Word); // grabs input view and assign it to variable display
        Frequency = findViewById(R.id.Frequency);
        Meaning = findViewById(R.id.Meaning);
    }

    public void finish(View view){
        finish();
    }


    public void addWord(View view){

        if (Frequency.getText().toString() == "") { // if user does not enter in a frequency, freq automatically set to 1

            freq = 1;

        }

        else{

            freq = Integer.parseInt(Frequency.getText().toString());
        }

        Word newWord = new Word(Word.getText().toString(), freq, Meaning.getText().toString());

        DictionaryContent.add(newWord);
    }

    public void clearBTN(View view){

        Word.setText("");
        Frequency.setText(0);
        Meaning.setText("");
    }




}