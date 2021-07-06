package io.github.rifqips.pinjemhelm.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.rifqips.pinjemhelm.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar!!.title = "Recovery Account"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }

}