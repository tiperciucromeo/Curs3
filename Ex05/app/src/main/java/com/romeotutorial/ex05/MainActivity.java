package com.romeotutorial.ex05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void itemClicked(View view){
        ToggleButton toggleButton = (ToggleButton)view;
        if(toggleButton.isChecked()) {
            toggleButton.setText(R.string.on);
        }
        else{
            toggleButton.setText(R.string.off);

        }
    }
}

