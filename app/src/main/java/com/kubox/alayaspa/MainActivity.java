package com.kubox.alayaspa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        final WebView myWebView = (WebView) findViewById(R.id.webview);
//        myWebView.getSettings().setJavaScriptEnabled(true);
//        myWebView.getSettings().setAppCacheEnabled(true);
//        myWebView.loadUrl("http://192.168.100.67/website/alaya-mobile/");
//        myWebView.setWebViewClient(new WebViewClient());

        final WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setAppCacheEnabled(true);
        myWebView.loadUrl("http://192.168.0.7/website/alaya-mobile/");
        myWebView.setWebViewClient(new WebViewClient(){
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl){
                myWebView.loadUrl("file:///android_asset/error.html");
            }
        });
    }

}
