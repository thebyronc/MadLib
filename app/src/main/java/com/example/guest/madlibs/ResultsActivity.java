package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ResultsActivity extends AppCompatActivity {
    @Bind(R.id.textResultOne) TextView mTextResultOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        ButterKnife.bind(this);
        Intent intent = getIntent();

        String wordOne = intent.getStringExtra("id0");
        String wordTwo = intent.getStringExtra("id1");

        mTextResultOne.setText("Example Word One: Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:Example Word One:" + wordOne + " " + wordTwo);
    }
}
