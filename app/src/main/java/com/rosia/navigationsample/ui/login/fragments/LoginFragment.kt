package com.rosia.navigationsample.ui.login.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.rosia.navigationsample.R
import com.rosia.navigationsample.models.User
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val appCompatActivity = activity as AppCompatActivity
        appCompatActivity.supportActionBar?.apply {
            title = "Login"
            setDisplayHomeAsUpEnabled(false)
        }
        text_register.setOnClickListener {
            /*val bundle = Bundle()
            bundle.putInt("dataRegister",2)*/

           val action = LoginFragmentDirections.actionLoginFragmentToRegisterFragment()
            action.setUserId(12)
            action.setUser(User(2, "Rx"))


            Navigation.findNavController(activity!!, R.id.login_nav_host_fragment).navigate(action)

            //findNavController().navigate(R.id.action_loginFragment_to_registerFragment, action)
        }

        text_forgot.setOnClickListener {
            findNavController()
                .navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
        }
    }
}
