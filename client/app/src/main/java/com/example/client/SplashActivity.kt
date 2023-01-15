package com.example.client

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.client.ui.category.ChangeCategoryActivity
import com.example.client.ui.category.SettingCategoryActivity
import com.example.client.ui.navigation.BottomNavigationActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this, ChangeCategoryActivity::class.java)
        startActivity(intent)
        finish()
    }
}