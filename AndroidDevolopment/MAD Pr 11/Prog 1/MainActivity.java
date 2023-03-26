package com.example.mad_practicals;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    CheckBox java,python,php,c,cpp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        java=findViewById(R.id.java);
        java.setOnClickListener(this);
        python=findViewById(R.id.python);
        python.setOnClickListener(this);
        php=findViewById(R.id.php);
        php.setOnClickListener(this);
        c=findViewById(R.id.c);
        c.setOnClickListener(this);
        cpp=findViewById(R.id.cpp);
        cpp.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.java:
                if(java.isChecked())
                    Toast.makeText(this, "Java Selected",
                            Toast.LENGTH_SHORT).show();
                break;
            case R.id.php:
                if(php.isChecked())
                    Toast.makeText(this, "PHP Selected",
                            Toast.LENGTH_SHORT).show();
                break;
            case R.id.python:
                if(python.isChecked())
                    Toast.makeText(this, "Python Selected",
                            Toast.LENGTH_SHORT).show();
                break;
            case R.id.c:
                if(c.isChecked())
                    Toast.makeText(this, "C Selected",
                            Toast.LENGTH_SHORT).show();
                break;
            case R.id.cpp:
                if(cpp.isChecked())
                    Toast.makeText(this, "C++ Selected",
                            Toast.LENGTH_SHORT).show();
                break;
        }
    }
}