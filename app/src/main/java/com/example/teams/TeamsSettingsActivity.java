package com.example.teams;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TeamsSettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams_settings);

        Navbar.initListButton(this);
        Navbar.initMapButton(this);
        Navbar.initSettingsButton(this);

        this.setTitle("Settings");
    }
}