package com.example.lee.class5b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RedFragment redFagement = new RedFragment();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fl_right, redFagement).commit();


    }
}
