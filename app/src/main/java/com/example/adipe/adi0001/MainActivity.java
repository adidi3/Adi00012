package com.example.adipe.adi0001;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Switch rl;
    ToggleButton ll;
    LinearLayout rr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rl = (Switch) findViewById(R.id.switch1);
        ll = (ToggleButton) findViewById(R.id.toggleButton);
        rr=(LinearLayout) findViewById(R.id.roro);


    }


    public void B(View view) {
        if (rl.isChecked() && ll.isChecked()) {
            rr.setBackgroundColor(Color.BLUE);
        }
         else {
            if (rl.isChecked()) {
                rr.setBackgroundColor(Color.RED);}
                else {
                if (ll.isChecked()) {
                    rr.setBackgroundColor(Color.YELLOW);
                } else {
                    rr.setBackgroundColor(Color.GREEN);
                }
            }
        }
    }
        }
