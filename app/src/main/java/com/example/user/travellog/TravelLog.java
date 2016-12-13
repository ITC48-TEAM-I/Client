package com.example.user.travellog;

import android.app.Application;

import com.example.user.travellog.Entry.Route;
import com.example.user.travellog.Entry.Spot;

import java.util.ArrayList;

/**
 * Created by 44 on 2016/12/12.
 */

public class TravelLog extends Application {
    public ArrayList<Route> cacheRoutes;
    public  ArrayList<Spot> cacheSpot;
    public String travelCode;
    public String token;
}
