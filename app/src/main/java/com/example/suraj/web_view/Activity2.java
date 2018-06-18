package com.example.suraj.web_view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class Activity2 extends AppCompatActivity{
    WebView w;
    ProgressBar p;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        w=(WebView) findViewById(R.id.web_view);
        p=(ProgressBar)findViewById(R.id.progress_bar);
        w.loadUrl("https://www.google.com/");
        w.setWebChromeClient(new WebChromeClient(){
            public void onProgressChanged(WebView view,int progress){
                if(progress==100){
                    p.setVisibility(View.GONE);
                    w.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
