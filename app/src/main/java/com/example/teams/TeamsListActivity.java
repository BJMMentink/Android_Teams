package com.example.teams;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TeamsListActivity extends AppCompatActivity {
    public static final String TAG = "TeamsListActivity";
    public static final String FILENAME = "teams.txt";
    ArrayList<Team> teams;
    RecyclerView teamList;
    TeamsAdapter teamsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams_list);

        Navbar.initListButton(this);
        Navbar.initMapButton(this);
        Navbar.initSettingsButton(this);

        this.setTitle("List");

        if(teams.isEmpty()){
            createTeams();
        }
        RebindTeams();
    }

    private void RebindTeams() {
        // Rebind RecyclerView
        teamList = findViewById(R.id.rvTeams);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamList.setLayoutManager(layoutManager);
        teamsAdapter = new TeamsAdapter(teams, this);
        teamList.setAdapter(teamsAdapter);
    }

    private void createTeams() {
        teams = new ArrayList<Team>();
        teams.add(new Team(1, "Packers", "Green Bay", "111-222-3333", 1, true, R.drawable.packers));
        teams.add(new Team(2, "Bears", "Chicago", "222-333-4444", 2, false, R.drawable.bears));
        teams.add(new Team(3, "Lions", "Detroit", "333-444-5555", 4, false, R.drawable.lions));
        teams.add(new Team(4, "Vikings", "Minneapolis", "444-555-6666", 4, false, R.drawable.vikings));
    }
}