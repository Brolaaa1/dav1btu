package com.example.midtermbtueasy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewNumber = findViewById(R.id.textViewNumber);
        Button buttonClick = findViewById(R.id.buttonClick);

        Intent intent = getIntent();
        int number = intent.getIntExtra("number", 0);

        textViewNumber.setText("Click button to decrease number\n" + number);

        buttonClick.setOnClickListener(v -> {
            number--;
            textViewNumber.setText("Click button to decrease number\n" + number);
        });
    }
}