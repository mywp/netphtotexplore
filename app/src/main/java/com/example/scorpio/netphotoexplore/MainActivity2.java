package com.example.scorpio.netphotoexplore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.loopj.android.image.SmartImageView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    private SmartImageView mImageView;
    private EditText etUrl;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mImageView = (SmartImageView) findViewById(R.id.iv_icon);
        etUrl = (EditText) findViewById(R.id.et_url);

        findViewById(R.id.bt_submit).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       //1.去除url，抓取图片
        String url = etUrl.getText().toString();
        
        mImageView.setImageUrl(url);
        

    }

}
