package com.example.user.travellog.ApiService;

import com.example.user.travellog.Entry.PostTravelGsonResponce;
import com.example.user.travellog.Entry.Travel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by user on 2016/12/12.
 */
public interface TravelApiService {
    @GET("api/users/{userCode}/travels")
    Call<List<Travel>> getTravel(@Path(value = "userCode") String userCode);

    @POST("api/users/{userCode}/travels")
    Call<PostTravelGsonResponce> postTravel(@Path(value = "userCode") String userCode, @Field("travel_date") String travelDate, @Field("latitude") Double latitude, @Field("longitude") Double longitude, @Field("area_name") String areaName, @Field("contry_name") String countryName, @Field("token") String token);
}
