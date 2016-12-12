package com.example.user.travellog.ApiService;

import com.example.user.travellog.Entry.Travel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by user on 2016/12/12.
 */
public interface TravelApiService {
    @GET("api/{userCode}/travels")
    Call<List<Travel>> getTravel(@Path(value = "userCode") String userCode);
}
