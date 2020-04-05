package com.coronalive
import android.os.Bundle
import android.util.Base64
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.settings.javaScriptEnabled = true
        val unencodedHtml = "&lt;html&gt;&lt;body&gt;'%23' is the percent code for ‘#‘ &lt;/body&gt;&lt;/html&gt;"
        val encodedHtml = Base64.encodeToString(unencodedHtml.toByteArray(), Base64.NO_PADDING)
        myWebView.loadData(encodedHtml, "text/html", "base64")
        myWebView.loadUrl("https://www.worldometers.info/coronavirus/")
       /* Snackbar.make(myWebView, "Replace with your own action", Snackbar.LENGTH_LONG)
            .setAction("Action", null).show()*/
    }
}