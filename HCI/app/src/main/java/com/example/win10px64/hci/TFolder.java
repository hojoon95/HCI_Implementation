package com.example.win10px64.hci;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class TFolder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.folder);

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
        //photo --> camera
        photo.setOnClickListener(new android.view.View.OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                Intent intent = new Intent(getApplicationContext(),camera.class);
                startActivity(intent);
            }
        });
        //search-->Search
        search.setOnClickListener(new android.view.View.OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                Intent intent = new Intent(getApplicationContext(),Search.class);
                startActivity(intent);
            }
        });
        //Refresh-->Refresh
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
        view.setOnClickListener(new android.view.View.OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                Intent intent = new Intent(getApplicationContext(),TMap.class);
                startActivity(intent);
            }
        });

        ImageView lock = (ImageView) findViewById(R.id.lock);
        lock.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                Intent intent = new Intent(getApplicationContext(), Security.class);
                startActivity(intent);
            }
        });

        ImageView img2 = (ImageView) findViewById(R.id.photo2);
        img2.setOnClickListener(new android.view.View.OnClickListener(){
            @Override
                public void onClick(android.view.View v){
                Intent intent = new Intent(getApplicationContext(),time.class);
                startActivity(intent);
            }
        });
        ImageView img3 = (ImageView) findViewById(R.id.photo3);
        img3.setOnClickListener(new android.view.View.OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                Intent intent = new Intent(getApplicationContext(),time.class);
                startActivity(intent);
            }
        });
        ImageView img4 = (ImageView) findViewById(R.id.photo4);
        img4.setOnClickListener(new android.view.View.OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                Intent intent = new Intent(getApplicationContext(),time.class);
                startActivity(intent);
            }
        });
        ImageView img5 = (ImageView) findViewById(R.id.photo5);
        img5.setOnClickListener(new android.view.View.OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                Intent intent = new Intent(getApplicationContext(),time.class);
                startActivity(intent);
            }
        });
        ImageView img6 = (ImageView) findViewById(R.id.photo6);
        img6.setOnClickListener(new android.view.View.OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                Intent intent = new Intent(getApplicationContext(),time.class);
                startActivity(intent);
            }
        });
    }
}
