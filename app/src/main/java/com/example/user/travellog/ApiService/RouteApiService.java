package com.example.user.travellog.ApiService;

import com.example.user.travellog.Entry.CreateGsonResponce;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by 44 on 2016/12/12.
 */

public interface RouteApiService {
    @POST("api/travels/{travelCode}/routes")
    Call<CreateGsonResponce> postRoutes(@Path(value = "travelCode") String travelCode, @Field("routes") String routesJsonStr,@Field("token") String token);
}
