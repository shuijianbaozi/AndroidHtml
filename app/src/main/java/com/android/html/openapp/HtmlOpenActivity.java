package com.android.html.openapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.android.html.R;

/**
 * Author: river
 * Date: 2016/3/29 14:30
 * Description: 通过链接打开app
 */
public class HtmlOpenActivity extends AppCompatActivity {
    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);
        webView = (WebView) findViewById(R.id.webView);


        webView.getSettings().setJavaScriptEnabled(true);

        // 加载本地网页
        webView.loadUrl("file:///android_asset/index_app.html");

    }
}