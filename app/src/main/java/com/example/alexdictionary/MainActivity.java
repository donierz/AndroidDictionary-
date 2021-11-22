package com.example.alexdictionary;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity{


    private EditText Word;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        Word = findViewById(R.id.editText); // grabs input view and assign it to variable display
        final DictionaryAlgorithm dic = new DictionaryAlgorithm();
        final Word wd = new Word();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void newWord(View view){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);



    }

    public void find(View view){

        String wordFind = Word.getText().toString();

    }

    public void removeWord(View view){


        DictionaryContent.remove(removeObject);

    }

}