package com.rosia.navigationsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.rosia.navigationsample.ui.login.LoginActivity
import com.rosia.navigationsample.ui.MainActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val randomInt = Math.random().toInt() % 2
        if (randomInt == 0) {
            startActivity(LoginActivity.getIntent(this@SplashActivity))
        } else {
            startActivity(LoginActivity.getIntent(this@SplashActivity))
        }
        finish()
    }
}
