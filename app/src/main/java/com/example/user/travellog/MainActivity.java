package com.example.user.travellog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.user.travellog.ApiService.QiitaApiService;
import com.example.user.travellog.ApiService.TravelApiService;
import com.example.user.travellog.Entry.QiitaGsonResponse;
import com.example.user.travellog.Entry.Travel;

import java.io.IOException;
import java.util.List;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://localhost:8000")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TravelApiService travelApiService = retrofit.create(TravelApiService.class);
        Call<List<Travel>> call = travelApiService.getTravel("abcd");
        try {
            List<Travel> travels = call.execute().body();

        } catch (IOException e) {
            e.printStackTrace();
        }
//        Intent intent = new Intent(MainActivity.this, MapTestActivity.class);
//        startActivity(intent);
    }
}
