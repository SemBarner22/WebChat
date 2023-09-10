package com.myapplication

import MainView
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.jetbrains.handson.kmm.shared.WebChatSDK
import com.jetbrains.handson.kmm.shared.cache.DatabaseDriverFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val sdk = WebChatSDK(DatabaseDriverFactory(this))

        setContent {
            MainView(sdk)
        }
    }
}