package com.kanyideveloper.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button calculate;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        calculate = findViewById(R.id.btnCalculate);
        ans = findViewById(R.id.answer);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number1 = num1.getText().toString();
                String number2 = num2.getText().toString();

                if (number1.isEmpty()){
                    num1.setError("You must enter a number");
                }
                else if (number2.isEmpty()){
                    num2.setError("You must enter a number");
                }
                else if (number1.isEmpty() && number2.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please fill in both numbers", Toast.LENGTH_SHORT).show();
                }
                else{
                    int myAnswer = (Integer.parseInt(number1) + Integer.parseInt(number2));
                    ans.setText(Integer.toString(myAnswer));
                }
            }
        });
    }
}