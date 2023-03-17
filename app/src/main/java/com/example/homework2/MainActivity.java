package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView numberText;

    private Button plusButton;
    private Button minusButton;
    private Button resetButton;

    private Button aboutUsButton;
    private Button exitButton;

    private int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        setButtonListeners();
    }

    private void init() {
        numberText = findViewById(R.id.textNum);

        plusButton = findViewById(R.id.plusButton);
        minusButton = findViewById(R.id.minusButton);
        resetButton = findViewById(R.id.resetButton);

        aboutUsButton = findViewById(R.id.aboutUsButton);
        exitButton = findViewById(R.id.exitButton);
    }

    private void setButtonListeners() {
        plusButton.setOnClickListener(view -> {
            num++;
            String text = String.valueOf(num);
            numberText.setText(text);
        });

        minusButton.setOnClickListener(view -> {
            num--;
            String text = String.valueOf(num);
            numberText.setText(text);
        });

        resetButton.setOnClickListener(view -> {
            num = 0;
            String text = String.valueOf(num);
            numberText.setText(text);
        });

        aboutUsButton.setOnClickListener(view -> {
            Intent secondMainIntent = new Intent(this, MainActivity2.class);
            startActivity(secondMainIntent);
        });

        exitButton.setOnClickListener(view -> {
            finish();
        });
    }
}