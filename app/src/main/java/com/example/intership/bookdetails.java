package com.example.intership;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class bookdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookdetails);


        LinearLayout i=findViewById(R.id.playnow);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(bookdetails.this,playbook.class);
                startActivity(j);
            }
        });


        ImageView k=findViewById(R.id.back);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l=new Intent(bookdetails.this,MainActivity.class);
                startActivity(l);
            }
        });



    }
}