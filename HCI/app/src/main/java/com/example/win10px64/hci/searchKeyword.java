package com.example.win10px64.hci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class searchKeyword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_keyword);

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
        //search-->Search
        search.setOnClickListener(new android.view.View.OnClickListener(){
            @Override
            public void onClick(android.view.View v){
                Intent intent = new Intent(getApplicationContext(),Search.class);
                startActivity(intent);
            }
        });
        Button button= (Button) findViewById(R.id.search_button) ;
        button.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                Intent intent = new Intent(getApplicationContext(),searchResultFood.class);
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
    }
}
