package com.example.user.travellog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.user.travellog.ApiService.TravelApiService;
import com.example.user.travellog.Entry.Travel;
import com.example.user.travellog.LayoutAdpter.TravelListAdoter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TravelListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_list);
        final ListView listView = (ListView)findViewById(R.id.travel_list);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://travellog-mock.herokuapp.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TravelApiService travelApiService = retrofit.create(TravelApiService.class);
        Call<List<Travel>> call = travelApiService.getTravel("abcd");

        try {
            call.enqueue(new Callback<List<Travel>>() {
                @Override
                public void onResponse(Call<List<Travel>> call, Response<List<Travel>> response) {
                    List<Travel> travels = response.body();
                    TravelListAdoter adoter = new TravelListAdoter(TravelListActivity.this);
                    adoter.setTravels((ArrayList<Travel>) travels);
                    listView.setAdapter(adoter);
                }

                @Override
                public void onFailure(Call<List<Travel>> call, Throwable t) {
                    Log.d("http", "err");
                }
            });
        } catch (Exception e) {
            Log.d("Qiita", "レスポンスエラー");
        }

    }
}
