package com.example.alexdictionary;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Hashtable;

public class MainActivity extends AppCompatActivity{

    Hashtable<String, Integer> wordFreqTable = new Hashtable<>();
    Hashtable<String, String> wordMeaningTable = new Hashtable<>();
    // then implement getter and setter


    // calling by reference in Java (look into this)
    // define hashmap as a global variable -> make global variable
    // or making it a static variable, which makes it global
    private EditText Word;
    private TextView Freq1;
    private TextView Freq2;
    private TextView Freq3;
    private TextView Meaning;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        Word = findViewById(R.id.editText); // grabs input view and assign it to variable display
        Freq1 = findViewById(R.id.Freq1);
        Freq2 = findViewById(R.id.Freq2);
        Freq3 = findViewById(R.id.Freq3);
        Meaning = findViewById(R.id.MeaningText);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void newWord(View view){
        Intent newWord = new Intent(this, MainActivity2.class);
        startActivity(newWord);

    }


    public void find(View view){
        // implement Toaster if the user tries to find an empty word
        String wordFind = Word.getText().toString();
        Intent findWord = new Intent(MainActivity.this, MainActivity2.class);
        findWord.putExtra("EXTRA_SESSION_ID", wordFind);
        startActivity(findWord);

    }

    public void removeWord(View view){



    }

}