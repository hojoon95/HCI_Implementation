package com.example.win10px64.hci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;

public class selectTag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_tag);

        final CheckBox foodCheck = (CheckBox) findViewById(R.id.foodCheck) ;
        final CheckBox peopleCheck = (CheckBox) findViewById(R.id.PeopleCheck) ;
        Button button= (Button) findViewById(R.id.button) ;

        button.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                if(peopleCheck.isChecked()){
                    Intent intent = new Intent(getApplicationContext(),searchResultPeople.class);
                    startActivity(intent);
                }
                else{
                    if(foodCheck.isChecked()){
                        Intent intent = new Intent(getApplicationContext(),searchResultFood.class);
                        startActivity(intent);
                    }
                }
            }
        });


    }
}
