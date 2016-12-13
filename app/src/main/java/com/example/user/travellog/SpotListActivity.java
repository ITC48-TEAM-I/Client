package com.example.user.travellog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.user.travellog.Entry.Travel;

public class SpotListActivity extends AppCompatActivity {
    private Travel travel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spot_list);

        travel = (Travel) getIntent().getSerializableExtra("travel");
        setTitle(travel.getTravelDate() + " " + travel.getAreaName() + "旅行で訪れた場所");
    }
}
