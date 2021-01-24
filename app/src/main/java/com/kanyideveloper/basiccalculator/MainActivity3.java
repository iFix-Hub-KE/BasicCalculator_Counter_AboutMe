package com.kanyideveloper.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    EditText changeNicknameEditText;
    Button btnChangeNickname;
    ImageView giveStar;
    TextView updatedNickname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        changeNicknameEditText = findViewById(R.id.edtNickname);
        btnChangeNickname = findViewById(R.id.btnChangeNickname);
        giveStar = findViewById(R.id.star);
        updatedNickname = findViewById(R.id.myNickname);

        btnChangeNickname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (changeNicknameEditText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity3.this, "We cant update a null nickname, shame on you!!", Toast.LENGTH_SHORT).show();
                }
                else{
                    String nickname = changeNicknameEditText.getText().toString();
                    updatedNickname.setText("Dear "+nickname+",");
                }
            }
        });

        giveStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity3.this, "Thank you for you Star", Toast.LENGTH_SHORT).show();
            }
        });
    }
}