package com.example.pr_15_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.Gravity;

import android.view.LayoutInflater;

import android.view.View;

import android.view.ViewGroup;

import android.widget.Button;

import android.widget.TextView;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Button button;

@Override

protected void onCreate(Bundle savedInstanceState) {

super.onCreate(savedInstanceState);

setContentView(R.layout.activity_main);

button=findViewById(R.id.button);

button.setOnClickListener(new View.OnClickListener() {

@Override

public void onClick(View view) {

LayoutInflater inflater = getLayoutInflater();

View toastLayout = inflater.inflate(R.layout.toast, (ViewGroup)

findViewById(R.id.toast_root_view));

TextView header = (TextView)

toastLayout.findViewById(R.id.toast_header); header

.setText("Message for you:");

TextView body = (TextView)

toastLayout.findViewById(R.id.toast_body); body

.setText("You have got mail!");

Toast toast = new Toast(getApplicationContext());

toast.setGravity(Gravity.CENTER, 0, 0);

toast.setDuration(Toast.LENGTH_LONG);

toast.setView(toastLayout);

toast.show();

}

}); }

}
