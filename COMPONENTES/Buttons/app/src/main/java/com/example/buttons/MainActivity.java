package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean botaoFoiCliclado = false;
    private String originalButtonText = "Clique aqui";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tv);
        Button btnAdd = findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (botaoFoiCliclado){
                    tv.setVisibility(View.GONE);
                    btnAdd.setText("Clicou");
                }
                else {
                    tv.setVisibility(View.VISIBLE);
                    btnAdd.setText(originalButtonText);
                }

                botaoFoiCliclado = !botaoFoiCliclado;
            }
        });
    }
}