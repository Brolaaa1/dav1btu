package com.example.midtermbtueasy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        textViewResult = findViewById(R.id.textViewResult);
        Button buttonOk = findViewById(R.id.buttonOk);
        Button buttonNext = findViewById(R.id.buttonNext);

        buttonOk.setOnClickListener(v -> {
            String numberStr = editTextNumber.getText().toString();
            int number = Integer.parseInt(numberStr);
            textViewResult.setText("Your number is " + number);
        });

        buttonNext.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("number", Integer.parseInt(editTextNumber.getText().toString()));
            startActivity(intent);
        });
    }
}