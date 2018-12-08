package com.example.win10px64.hci;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Refresh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.refresh);

        final TextView text = (TextView) findViewById(R.id.r_text);
        new CountDownTimer(10000, 1000) {
            public void onTick(long millisUntilFinished) {
                text.setText("remains: " + millisUntilFinished / 1000 + "s");
                //here you can have your logic to set text to edittext
            }
            public void onFinish() {
                finish();
            }
        }.start();
    }
}
