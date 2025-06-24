package com.app.boldblue.midoconlinesdk

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.webkit.CookieManager
import android.webkit.PermissionRequest
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class ActivityWebViewMdoPac : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_mdopac)
        //window.statusBarColor = ContextCompat.getColor(this, R.color.BlueDarkMdoPac)
        val myToolbar: Toolbar = findViewById(R.id.ToolbarRecuperar)
        myToolbar.setTitle(R.string.midoconline_mdopac)
        myToolbar.setNavigationIcon(R.drawable.closearrow_mdopac)
        setSupportActionBar(myToolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        myToolbar.setNavigationOnClickListener {
            finish()
        }
        if (!hasPermissions()) {
        ActivityCompat.requestPermissions(this, permissions, requestCode)
        }
        val webcita : WebView = findViewById(R.id.web_view_mdopac)
        webcita.clearCache(true)
        webcita.settings.cacheMode = WebSettings.LOAD_NO_CACHE
        webcita.settings.javaScriptEnabled = true
        webcita.settings.domStorageEnabled = true
        webcita.settings.mediaPlaybackRequiresUserGesture = false
        webcita.settings.cacheMode = WebSettings.LOAD_DEFAULT
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(webcita, true)
        webcita.webViewClient = WebViewClient()
        webcita.webChromeClient = object : WebChromeClient() {
            override fun onPermissionRequest(request: PermissionRequest) {
                runOnUiThread {
                    request.grant(request.resources)
                }
            }
        }
        webcita.loadUrl("https://paciente.midoconline.com/")
        onBackPressedDispatcher.addCallback(this) {
        }
    }
    
    private val permissions = arrayOf(
        Manifest.permission.CAMERA,
        Manifest.permission.RECORD_AUDIO
    )
    private val requestCode = 123


    private fun hasPermissions(): Boolean {
        return permissions.all {
            ContextCompat.checkSelfPermission(this, it) == PackageManager.PERMISSION_GRANTED
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<out String>, grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == this.requestCode && grantResults.any { it != PackageManager.PERMISSION_GRANTED }) {
            Toast.makeText(this, "Activa permisos para cámara y micrófono desde configuración.", Toast.LENGTH_LONG).show()
        }
    }
    
}