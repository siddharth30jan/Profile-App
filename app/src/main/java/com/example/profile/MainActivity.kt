package com.example.profile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.homescreen.*

class MainActivity : AppCompatActivity() {

    var photo: ImageView? = null
    var edu: Button? = null
    var work: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen)

        photo=findViewById(R.id.profilephoto)
        edu=findViewById((R.id.education))
        photo?.setOnClickListener {
            run {
                var clickIntent = Intent(this@MainActivity, Profile_Photo::class.java)
                startActivity(clickIntent)
            }
        }
    }
}
