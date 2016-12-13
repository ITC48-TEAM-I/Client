package com.example.user.travellog.ApiService;

import com.example.user.travellog.Entry.CreateGsonResponce;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by 44 on 2016/12/13.
 */

public interface SpotApiService {
    @POST("api/travels/{travelCode}/spots")
    Call<CreateGsonResponce> postSpots(@Path(value = "travelCode") String travelCode, @Field("spots") String spotsJsonStr, @Field("token") String token);

    @PUT("api/spots/{spotCode}")
    Call<CreateGsonResponce> putSpot(@Path(value = "sportCode") String spotCode, @Field("spot_name") String spotName, @Field("site_url") String siteUrl, @Field("category_code") String categoryCode, @Field("token") String token);
}
