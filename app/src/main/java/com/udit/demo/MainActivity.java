package com.udit.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void test (View view2)
    {
        ImageView counter = (ImageView) findViewById(R.id.test) ;
        counter.setTranslationY(-1200f);
        counter.setImageResource(R.drawable.udtech);
        counter.animate().translationY(0f).setDuration(300);

    }

    public void clicked(View view)
    {

        Log.i("info" , "dba diya");
        int a = 20+3+50+8+22;
        Log.i("info2" , "hello world");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
