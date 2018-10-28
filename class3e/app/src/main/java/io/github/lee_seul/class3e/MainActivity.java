package io.github.lee_seul.class3e;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btn_call);
        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        //Toast.makeText(this, "cliick!", Toast.LENGTH_SHORT).show();

//        Intent intent = new Intent();
//        intent.setAction(Intent.ACTION_DIAL);
//        startActivity(intent);

        Intent intent = new Intent(MainActivity.this, CallActivity.class);
        intent.putExtra("intent-message", "game joa joa");
        startActivity(intent);

    }
}
