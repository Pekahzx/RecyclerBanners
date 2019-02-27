package com.ripple.recyclerbanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

//import com.example.library.banner.BannerLayout;
//import com.renny.recyclerbanner.adapter.WebBannerAdapter;

import com.ripple.recyclerbanner.adapter.WebBannerAdapter;
import com.ripple.recyclerbanner.banner.BannerLayout;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements BannerLayout.OnBannerItemClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BannerLayout  recyclerBanner =  findViewById(R.id.recycler);
        BannerLayout bannerVertical =  findViewById(R.id.recycler_ver);

        ImageView iv_test = findViewById(R.id.iv_test);
        Picasso.with(this).load("http://static.renextop.com/uploads/video/cover/5b752336f63575119e5930a6/_DSC2638.jpg").into(iv_test);

        List<String> list = new ArrayList<>();
        list.add("http://static.renextop.com/uploads/video/cover/5b752336f63575119e5930a6/_DSC2638.jpg");
        list.add("http://static.renextop.com/uploads/video/cover/5b752336f63575119e5930a6/_DSC2638.jpg");
        list.add("http://static.renextop.com/uploads/video/cover/5b752336f63575119e5930a6/_DSC2638.jpg");
        list.add("http://static.renextop.com/uploads/video/cover/5b752336f63575119e5930a6/_DSC2638.jpg");
        list.add("http://static.renextop.com/uploads/video/cover/5b752336f63575119e5930a6/_DSC2638.jpg");
        list.add("http://static.renextop.com/uploads/video/cover/5b752336f63575119e5930a6/_DSC2638.jpg");

        WebBannerAdapter webBannerAdapter=new WebBannerAdapter(this,list);
        webBannerAdapter.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, "点击了第  " + position+"  项", Toast.LENGTH_SHORT).show();
            }
        });

        WebBannerAdapter WebBannerAdapter2 =new WebBannerAdapter(this,list);
        WebBannerAdapter2.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, "点击了第  " + position+"  项", Toast.LENGTH_SHORT).show();
            }
        });
        recyclerBanner.setAdapter(webBannerAdapter);
        bannerVertical.setAdapter(WebBannerAdapter2);
    }


    public void jump(View view) {
        startActivity(new Intent(MainActivity.this, NormalActivity.class));
    }
    public void jumpOverFlying(View view) {
        startActivity(new Intent(MainActivity.this, OverFlyingActivity.class));
    }

    @Override
    public void onItemClick(int position) {

    }
}
