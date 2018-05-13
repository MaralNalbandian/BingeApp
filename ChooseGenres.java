package com.example.user.choosegenrescreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseGenres extends AppCompatActivity {

    public Button showFilmsButton;

    public void film(){
        showFilmsButton = (Button) findViewById(R.id.showFilmsButton);
        showFilmsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Intent openFilmView = new Intent(MainActivity.this, Main2Activity.class);

                //startActivity(openFilmView);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_genres);
    }
}
