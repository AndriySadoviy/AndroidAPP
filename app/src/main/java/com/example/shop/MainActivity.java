package com.example.shop;

import android.os.Bundle;
import android.widget.ImageView;



import androidx.appcompat.app.AppCompatActivity;


import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.shop.Application.HomeApplication;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ivAvatar = findViewById(R.id.ivAvatar);
        String url = "https://content1.rozetka.com.ua/goods/images/big/415679366.jpg";
        Glide.with(HomeApplication.getAppContext())
                .load(url)
                .apply(new RequestOptions().override(400))
                .into(ivAvatar);
    }
}