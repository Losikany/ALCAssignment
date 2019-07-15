package com.example.alcassignment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class MyProfile extends AppCompatActivity {
    private Toolbar toolbar;
    private ImageView photo;
    private TextView name, track, country, email, number, user_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_profile);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        photo = findViewById(R.id.profile_img);
        name = findViewById(R.id.name);
        track = findViewById(R.id.track);
        country = findViewById(R.id.country);
        email = findViewById(R.id.email);
        number = findViewById(R.id.phone_number);
        user_name = findViewById(R.id.slack_uname);

    }

    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
