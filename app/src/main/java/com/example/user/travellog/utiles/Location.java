package com.example.user.travellog.utiles;

import jp.co.yahoo.android.maps.*;
/**
 * Created by user on 2016/12/02.
 */
public class Location {

    private double latitude;
    private double longitude;

    Location(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    Location(GeoPoint location){
        this.latitude = location.getLatitude();
        this.longitude = location.getLongitude();
    }

    public GeoPoint toGeoPoint(){
        int latitude = (int)(this.latitude * 1E6);
        int longitude = (int)(this.longitude * 1E6);
        return new GeoPoint(latitude, longitude);
    }

    public double distance(Location end) {
        float[] results = new float[3];
        android.location.Location.distanceBetween(this.latitude, this.longitude, end.getLatitude(), end.getLongitude(), results);
        return (double)results[0];
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
