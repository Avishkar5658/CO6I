package com.example.mad_practicals;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;
public class MainActivity extends AppCompatActivity
{
    private ToggleButton toggleButton1;
    @Override protected void onCreate(Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getTextOff();
    }
    public void getTextOff(){
        toggleButton1=(ToggleButton)findViewById(R.id.tg);
        toggleButton1.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View view)
            { StringBuilder result = new StringBuilder();
                result.append("Bluetooth is :").append(toggleButton1.getText());
                        Toast.makeText(getApplicationContext(), result.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
