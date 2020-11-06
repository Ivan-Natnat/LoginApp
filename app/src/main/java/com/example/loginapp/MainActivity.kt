package com.example.loginapp


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin: Button = findViewById(R.id.btn_Login)
        val edUsername: EditText = findViewById(R.id.ed_Username)
        val edPassword: EditText= findViewById(R.id.ed_Password)


        btnLogin.setOnClickListener{
            val intent = Intent(this,FiveTaskActivity::class.java)
            if(edPassword.text.trim().isNotEmpty() || edUsername.text.trim().isNotEmpty()){
                startActivity(intent)
            }else{
                Toast.makeText(this,"Input required",Toast.LENGTH_LONG).show()
            }
        }

    }
}