package com.example.teams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TeamsMapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams_map);

        Navbar.initListButton(this);
        Navbar.initMapButton(this);
        Navbar.initSettingsButton(this);

        this.setTitle("Map");
    }
}