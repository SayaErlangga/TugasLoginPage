package com.example.tugasloginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tugasloginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnSubmit.setOnClickListener {
                val intentToSecondActivity = Intent(this@MainActivity, SecondActivity::class.java)
                val name = username.text.toString()
                val email = email.text.toString()
                val phoneNumber = phoneNumber.text.toString()

                if(cekKondisi.isChecked()){
                    intentToSecondActivity.putExtra(EXTRA_NAME, name)
                    intentToSecondActivity.putExtra(EXTRA_EMAIL, email)
                    intentToSecondActivity.putExtra(EXTRA_PHONE, phoneNumber)
                    startActivity(intentToSecondActivity)
                }else if(!cekKondisi.isChecked()){
                    Toast.makeText(this@MainActivity, "Lakukan Checklist", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}