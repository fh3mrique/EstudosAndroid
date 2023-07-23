package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleButton toggleButton = findViewById(R.id.toggleButton);

        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked){
                Toast.makeText(this, "Ligado", Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(this, "Desligado", Toast.LENGTH_LONG).show();
            }
        });
    }
}