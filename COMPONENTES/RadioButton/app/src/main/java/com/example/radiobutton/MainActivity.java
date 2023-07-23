package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGrupo = findViewById(R.id.radioGrupo);

        radioGrupo.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.opcao1){
                Toast.makeText(this, "Opção 1", Toast.LENGTH_SHORT).show();
            }
            else if (checkedId == R.id.opcao2){
                Toast.makeText(this, "Opção 2", Toast.LENGTH_LONG).show();
            }
            else if (checkedId == R.id.opcao3){
                Toast.makeText(this, "Opção 3", Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(this, "Opção 4", Toast.LENGTH_LONG).show();
            }
        });

    }
}