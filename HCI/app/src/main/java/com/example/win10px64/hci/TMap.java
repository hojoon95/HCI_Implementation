package com.example.win10px64.hci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TMap extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        //Menu
        ImageView home = (ImageView) findViewById(R.id.home);
        ImageView edit = (ImageView) findViewById(R.id.edit);
        ImageView search = (ImageView) findViewById(R.id.search);
        ImageView option = (ImageView) findViewById(R.id.option);
        ImageView photo = (ImageView) findViewById(R.id.photo);
        ImageView refresh = (ImageView)  findViewById(R.id.refresh);

        //home --> TMap
        home.setOnClickListener(new android.view.View.OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                Intent intent = new Intent(getApplicationContext(),TFolder.class);
                startActivity(intent);
            }
        });
        search.setOnClickListener(new android.view.View.OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                Intent intent = new Intent(getApplicationContext(),Search.class);
                startActivity(intent);
            }
        });
        //photo --> camera
        photo.setOnClickListener(new android.view.View.OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                Intent intent = new Intent(getApplicationContext(),camera.class);
                startActivity(intent);
            }
        });
        //refresh-->Refresh
        refresh.setOnClickListener(new android.view.View.OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                Intent intent = new Intent(getApplicationContext(),Refresh.class);
                startActivity(intent);
            }
        });
        ImageView af = (ImageView) findViewById(R.id.addfolder);
        af.setOnClickListener(new android.view.View.OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                Intent intent = new Intent(getApplicationContext(),addFolder.class);
                startActivity(intent);
            }
        });


        ImageView view = (ImageView) findViewById(R.id.view);
        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),TFolder.class);
                startActivity(intent);
            }
        });
        ImageView img1 = (ImageView) findViewById(R.id.m_p1);
        img1.setOnClickListener(new android.view.View.OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                Intent intent = new Intent(getApplicationContext(),time.class);
                startActivity(intent);
            }
        });
        ImageView img2 = (ImageView) findViewById(R.id.m_p2);
        img2.setOnClickListener(new android.view.View.OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                Intent intent = new Intent(getApplicationContext(),time.class);
                startActivity(intent);
            }
        });

    }
}
