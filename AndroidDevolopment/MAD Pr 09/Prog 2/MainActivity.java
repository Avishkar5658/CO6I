package com.example.mad_practicals;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText t1 , t2;
    Button add ,Mul ,Div ,sub;
    TextView answer;
    double ans = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        add = findViewById(R.id.add);
        Mul = findViewById(R.id.Mul);
        Div = findViewById(R.id.Div);
        sub = findViewById(R.id.sub);
        answer = findViewById(R.id.ans);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = t1.getText().toString();
                String num2 = t2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    double a =
                            Double.parseDouble(t1.getText().toString());
                    double b =
                            Double.parseDouble(t2.getText().toString());
                    ans = a + b;
                    String ans1 = String.valueOf(ans);
                    answer.setText(ans1);
                    ans= 0;
                    Toast.makeText(getApplicationContext(),"Addition Performed",Toast.LENGTH_SHORT).show();
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = t1.getText().toString();
                String num2 = t2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    double a =
                            Double.parseDouble(t1.getText().toString());
                    double b =
                            Double.parseDouble(t2.getText().toString());
                    ans = a - b;
                    String ans1 = String.valueOf(ans);
                    answer.setText(ans1);
                    ans= 0;
                    Toast.makeText(getApplicationContext(),"Subtraction Performed",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = t1.getText().toString();
                String num2 = t2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(),"Enter Numbers",Toast.LENGTH_SHORT).show();
                }
                else {
                    double a =
                            Double.parseDouble(t1.getText().toString());
                    double b =
                            Double.parseDouble(t2.getText().toString());
                    ans = a * b;
                    String ans1 = String.valueOf(ans);
                    answer.setText(ans1);
                    ans= 0;

                    Toast.makeText(getApplicationContext(),"Multiplication Performed",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = t1.getText().toString();
                String num2 = t2.getText().toString();
                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter Numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    double a =
                            Double.parseDouble(t1.getText().toString());
                    double b =
                            Double.parseDouble(t2.getText().toString());
                    if (b != 0) {
                        ans = a / b;
                        String ans1 = String.valueOf(ans);
                        answer.setText(ans1);
                        ans= 0;
                        Toast.makeText(getApplicationContext(),"Division Performed",Toast.LENGTH_SHORT).show();
                    }
                    else
                        Toast.makeText(getApplicationContext(),
                                "Enter Valid Numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}