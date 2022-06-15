package com.example.ebaywebapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.ebaywebapp.R.style.Theme_EBayWebApp

class MainActivity : AppCompatActivity() {
    private val web : WebView?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(Theme_EBayWebApp)
        setContentView(R.layout.activity_main)
        val web = findViewById<WebView>(R.id.webview)
        web.webViewClient = WebViewClient()
        web.loadUrl("www.ebay.com")
        val webSettings=web.settings
        webSettings.javaScriptEnabled=true
    }

    override fun onBackPressed() {
        if (web !!.canGoBack()){
            web.goBack()
        }
        super.onBackPressed()
    }
}