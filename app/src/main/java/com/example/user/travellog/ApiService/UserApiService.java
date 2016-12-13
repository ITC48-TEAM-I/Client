package com.example.user.travellog.ApiService;

import com.example.user.travellog.Entry.UserGsonResponce;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;

/**
 * Created by 44 on 2016/12/12.
 */

public interface UserApiService {
    @POST("api/users")
    Call<UserGsonResponce> postUser(@Field("mail_address") String mailaddress, @Field("password") String password);

    @POST("api/auth")
    Call<UserGsonResponce> loginUser(@Field("mail_address") String mailaddress, @Field("password") String password);
}
