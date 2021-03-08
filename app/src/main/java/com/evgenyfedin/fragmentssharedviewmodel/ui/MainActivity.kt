package com.evgenyfedin.fragmentssharedviewmodel.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.evgenyfedin.fragmentssharedviewmodel.R
import com.evgenyfedin.fragmentssharedviewmodel.addFragment
import com.evgenyfedin.fragmentssharedviewmodel.viewmodel.SharedViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment(FragmentA(), R.id.container_a)
        addFragment(FragmentB(), R.id.container_b)
    }

}