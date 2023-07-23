package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextName = findViewById(R.id.etName);
        Button btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(v -> {
            Toast.makeText(this, editTextName.getText().toString(), Toast.LENGTH_LONG).show();
        });

    }
}