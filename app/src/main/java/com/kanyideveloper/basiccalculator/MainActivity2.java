package com.kanyideveloper.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView bigNum;
    Button add;
    Button minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bigNum = findViewById(R.id.txt_Num);
        add = findViewById(R.id.btnPlusOne);
        minus = findViewById(R.id.btnMinusOne);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = bigNum.getText().toString();

                int ourNum = Integer.parseInt(num);

                ourNum++;

                bigNum.setText(Integer.toString(ourNum));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = bigNum.getText().toString();

                int ourNum = Integer.parseInt(num);

                ourNum--;

                bigNum.setText(Integer.toString(ourNum));
            }
        });
    }
}