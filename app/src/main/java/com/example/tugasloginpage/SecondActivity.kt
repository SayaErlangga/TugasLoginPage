package com.example.tugasloginpage

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.tugasloginpage.MainActivity.Companion.EXTRA_EMAIL
import com.example.tugasloginpage.MainActivity.Companion.EXTRA_NAME
import com.example.tugasloginpage.MainActivity.Companion.EXTRA_PHONE
import com.example.tugasloginpage.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra(EXTRA_NAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)
        val phoneNumber = intent.getStringExtra(EXTRA_PHONE)

        with(binding){
            val intentToMainActivity = Intent(this@SecondActivity, MainActivity::class.java)

            txtUsername.text ="Welcome $name"
            txtEmail.text = "Your Email $email has been activated"
            txtPhoneNumber.text = "Your $phoneNumber has been registered"

            btnLogout.setOnClickListener {
                startActivity(intentToMainActivity)
            }
        }


    }
}