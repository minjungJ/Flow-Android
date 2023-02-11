package com.example.client.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.client.api.HttpConnection
import com.example.client.data.AppDatabase
import com.example.client.data.User
import com.example.client.databinding.ActivityLoginBinding

import com.example.client.ui.signup.SignUpActivity
import kotlinx.coroutines.InternalCoroutinesApi

@InternalCoroutinesApi
class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val httpConnection = HttpConnection()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val roomDb = AppDatabase.getInstance(this)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.signupButton.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        // 로그인 버튼 클릭리스너에 넣기
//        val userId : Int = 1
//        httpConnection.getUserInfo(roomDb, userId)
//        httpConnection.getCategory(userId)
    }
}