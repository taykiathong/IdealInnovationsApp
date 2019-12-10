package com.example.year2079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class M2_2 extends AppCompatActivity {
    Button home;

    TextView abc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2_2);

        abc = findViewById(R.id.m2_2content);

        abc.setMovementMethod(new ScrollingMovementMethod());

        home=findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(M2_2.this, StartPage.class);
                startActivity(home);
            }
        });
    }
}
