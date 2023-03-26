package com.example.mad_practicals;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText user, pass;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        user = findViewById(R.id.username);
        pass = findViewById(R.id.pass);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if
                (user.getText().toString().equals("adv@gmail.com") &
                        pass.getText().toString().equals("adv@123")) {
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                } else if
                (user.getText().toString().equals("adventure@gmail.com") &
                                pass.getText().toString().equals("adventure@123")) {
                    Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Login Unsuccessful", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}