package com.recipeapp.cookbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById(R.id.webview)
        
        webView.settings.apply {
            javaScriptEnabled = true
            domStorageEnabled = true
            databaseEnabled = true
        }
        
        webView.loadUrl("file:///android_asset/recipe.html")
    }
}
