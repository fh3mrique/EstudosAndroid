package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox componenteCheckBox = findViewById(R.id.componenteCheckBox);
        TextView textView = findViewById(R.id.text);

        componenteCheckBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked){
                textView.setText("ON");
                textView.setBackgroundResource(R.drawable.background_color);
            }
            else {
                textView.setText("OFF");
            }
        });



    }
}