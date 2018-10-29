package com.rosia.navigationsample.ui.login.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.rosia.navigationsample.R

class RegisterFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val appCompatActivity = activity as AppCompatActivity
        appCompatActivity.supportActionBar?.apply {
            title = "Register"
            setDisplayHomeAsUpEnabled(true)
        }
    }
}

