package com.example.mad_practicals;
import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    Button button;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            Handler handle = new Handler() {
                public void handleMessage(Message msg) {
                    super.handleMessage(msg);
                    progressDialog.incrementProgressBy(2); // Incremented By Value 2
                }
            };
            @Override
            public void onClick(View v) {
                progressDialog = new
                        ProgressDialog(MainActivity.this);
                progressDialog.setMax(100); // Progress Dialog Max Value
                progressDialog.setMessage("downloading..."); //Setting Message
                progressDialog.setTitle("Download"); // Setting Title

                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL); // Progress Dialog Style Horizontal
                progressDialog.show(); // Display Progress Dialog
                progressDialog.setCancelable(false);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            while (progressDialog.getProgress() <=
                                    progressDialog.getMax()) {
                                Thread.sleep(200);

                                handle.sendMessage(handle.obtainMessage());
                                if (progressDialog.getProgress() ==
                                        progressDialog.getMax()) {
                                    progressDialog.dismiss();
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });
    }
}