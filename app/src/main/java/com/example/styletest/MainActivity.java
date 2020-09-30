package com.example.styletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn ;
    EditText etName;
    EditText etGrade;
    TextView result ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        etName = (EditText) findViewById(R.id.editTextTextPersonName);
        etGrade = (EditText) findViewById(R.id.editTextNumber);
        result = (TextView) findViewById(R.id.textView3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = Integer.parseInt(etGrade.getText().toString());
                String name = etName.getText().toString();
                result.setText(name + " has a "+setState(value));
            }
        });
    }
    String setState(int number) {
        if (number >= 90) return "Excellent";
        else if (number >=80) return "Very Good";
        else if (number >= 70) return "Good";
        else if (number >= 60) return "Pass";
        else return "Failed";
    }
}