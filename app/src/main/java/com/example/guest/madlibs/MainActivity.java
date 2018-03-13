package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.wordOne) EditText mWordOne;
//    @Bind(R.id.wordTwo) EditText mWordTwo;
    @Bind(R.id.submitWords) Button mSubmitWords;
    @Bind(R.id.goButton) Button mGoButton;

    ArrayList<String> nameList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        mSubmitWords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String wordOne = mWordOne.getText().toString();
                mWordOne.setText("");
                nameList.add(wordOne);
            }
        });

        mGoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResultsActivity.class);
//                String wordOne = mWordOne.getText().toString();
//                intent.putExtra("wordOne", wordOne);
//                String wordTwo = mWordTwo.getText().toString();
//                intent.putExtra("wordTwo", wordTwo);
                for(int i = 0; i < nameList.size(); i++) {
                    intent.putExtra("id"+i, nameList.get(i));
                }

                startActivity(intent);
            }
        });
    }
}
