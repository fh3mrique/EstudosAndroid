package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SwitchMaterial componenteSwitch = findViewById(R.id.componenteSwitch);
        TextView textView = findViewById(R.id.textView);

        componenteSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked){
                textView.setText("ON");
            }
            else{
                textView.setText("OFF");
            }
        });
    }
}