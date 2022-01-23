package com.example.intership;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void onBackPressed(){
        Intent o= new Intent(Intent.ACTION_MAIN);
        o.addCategory(Intent.CATEGORY_HOME);
        o.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(o);
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView i=findViewById(R.id.b1);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(MainActivity.this,bookdetails.class);
                startActivity(j);
            }
        });


        TextView k=findViewById(R.id.t1);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l=new Intent(MainActivity.this,bookdetails.class);
                startActivity(l);
            }
        });

        LinearLayout m=findViewById(R.id.music);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(MainActivity.this,playbook.class);
                startActivity(n);
            }
        });






}





}