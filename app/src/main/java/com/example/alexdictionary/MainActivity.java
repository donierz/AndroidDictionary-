package com.example.alexdictionary;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;


public class MainActivity extends AppCompatActivity{

    HashMap<String, Integer> wordFreqTable = new HashMap<>();
    HashMap<String, String> wordMeaningTable = new HashMap<>();

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

    /*

    public void find(View view){

        // implement Toaster if the user tries to find an empty word

        String wordFind = Word.getText().toString();
        Intent findWord = new Intent(getBaseContext(), MainActivity2.class);
        findWord.putExtra("EXTRA_SESSION_ID", wordFind);
        startActivity(findWord);

    }

    public void removeWord(View view){



    }

     */




}