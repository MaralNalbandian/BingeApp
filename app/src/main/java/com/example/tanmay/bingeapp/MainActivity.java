package com.example.tanmay.bingeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });

     Button button2 = (Button) findViewById(R.id.button2);
     button2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             openRegister();
         }
     });

    }
    public void openProfile(){
    Intent openProfile = new Intent(this,Profile.class);
    startActivity(openProfile);
}
    public void openRegister(){
        Intent openRegister = new Intent(this,Register.class);
        startActivity(openRegister);
    }
}