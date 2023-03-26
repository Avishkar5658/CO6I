package com.example.mad_practicals;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton1,radioButton2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.rgrp);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioButtonID =
                        radioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton)
                        radioGroup.findViewById(radioButtonID);
                String selectedtext = (String) radioButton.getText();
                Toast.makeText(MainActivity.this,selectedtext+" is Selected ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}