package com.romeotutorial.ex06;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void itemClicked(View view)
    {
        if(((Switch)view).isChecked()){
            ((Switch) view).setText(R.string.on);
        } else{
            ((Switch) view).setText(R.string.off);
        }
    }
}
