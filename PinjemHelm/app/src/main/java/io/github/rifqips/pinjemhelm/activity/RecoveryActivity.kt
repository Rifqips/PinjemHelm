package io.github.rifqips.pinjemhelm.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.rifqips.pinjemhelm.R
import android.content.Intent
import kotlinx.android.synthetic.main.activity_recovery.*

class RecoveryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery)

        button.setOnclickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}