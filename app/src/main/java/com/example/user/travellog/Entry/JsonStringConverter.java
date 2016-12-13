package com.example.user.travellog.Entry;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by 44 on 2016/12/12.
 */

public class JsonStringConverter {
    public static String routesToJsonStr(List<Route> routes){
        return  new Gson().toJson(routes);
    }

    public static String sportsToJsonStr(List<Spot> spots){
        return  new Gson().toJson(spots);
    }
}
