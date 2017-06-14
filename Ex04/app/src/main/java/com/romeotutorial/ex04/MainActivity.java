package com.romeotutorial.ex04;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox cb;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb = (CheckBox) findViewById(R.id.checkBox);
    }
    public void itemClicked(View view){
        if(((CheckBox)view).isChecked()) {
            cb.setText(R.string.checked);
        }
        else{
            cb.setText(R.string.unchecked);

        }
    }
}
