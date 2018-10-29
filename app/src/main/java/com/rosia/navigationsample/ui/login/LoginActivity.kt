package com.rosia.navigationsample.ui.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.rosia.navigationsample.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    companion object {
        fun getIntent(context: Context?) = Intent(context, LoginActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val inflater = login_nav_host_fragment.findNavController().navInflater
        val graph = inflater.inflate(R.navigation.nav_login)
        login_nav_host_fragment.findNavController().graph = graph
    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(this, R.id.login_nav_host_fragment).navigateUp()
    }


}
