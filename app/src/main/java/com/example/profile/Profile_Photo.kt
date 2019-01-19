package com.example.profile

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Profile_Photo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profilephoto)
        title = "My Profile Photo"
    }
}
