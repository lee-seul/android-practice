package io.github.lee_seul.flashligth

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, TorchService::class.java)

        flashSwich.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                intent.action = "on"
            } else {
                intent.action = "off"
            }

            startService(intent)
        }
    }
}
