package com.android.html.openapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.android.html.R;

public class AppActivityActivity extends AppCompatActivity {
    public static final String TAG = "AppActivityActivity";

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        textView = (TextView) findViewById(R.id.text);

        Intent intent = getIntent();
        String scheme = intent.getScheme();
        Uri uri = intent.getData();

        StringBuilder builder = new StringBuilder();

        if (uri != null) {
            String host = uri.getHost();
            String path = uri.getPath();
            String encodedPath = uri.getEncodedPath();
            String queryString = uri.getQuery();

            // 链接所有数据
            String dataString = intent.getDataString();

            // 获取链接所携带的参数数据
            String params = uri.getQueryParameter("params");

            builder.append("host:" + host + "\n");
            builder.append("scheme:" + scheme + "\n");

            builder.append("data:" + dataString + "\n");
            builder.append("params:" + params + "\n");

            builder.append("path:" + path + "\n");
            builder.append("encodedPath:" + encodedPath + "\n");
            builder.append("queryString:" + queryString + "\n");
        }

        Log.i(TAG, builder.toString());

        textView.setText(builder.toString());

    }
}
