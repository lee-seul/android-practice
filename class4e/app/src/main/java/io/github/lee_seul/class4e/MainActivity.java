package io.github.lee_seul.class4e;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.iv_like).setOnClickListener(this);
        findViewById(R.id.iv_share).setOnClickListener(this);

        findViewById(R.id.iv_photo).setOnClickListener(this);
        findViewById(R.id.iv_photo).setOnTouchListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.iv_like:
                Toast.makeText(MainActivity.this, "like", Toast.LENGTH_SHORT).show();
                break;


            case R.id.iv_share:
                Toast.makeText(MainActivity.this, "share", Toast.LENGTH_SHORT).show();
                break;

            case R.id.iv_photo:
                Toast.makeText(MainActivity.this, "touch", Toast.LENGTH_SHORT).show();
                break;
        }

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Toast.makeText(MainActivity.this, "down", Toast.LENGTH_SHORT).show();
                break;

            case MotionEvent.ACTION_UP:
                Toast.makeText(MainActivity.this, "up", Toast.LENGTH_SHORT).show();
                break;
        }

        return false;
    }
}
