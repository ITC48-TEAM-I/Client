
package com.example.user.travellog.Entry;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import jp.co.yahoo.android.maps.GeoPoint;

public class Route implements Serializable{

    /**
     * 
     * Corresponds to the "transit_time" property.
     * 
     */
    @SerializedName("transit_time")
    @Expose
    private String transitTime;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;


    public Route(String transitTime, GeoPoint location){
        this.transitTime = transitTime;
        this.latitude = location.getLatitude();
        this.longitude = location.getLongitude();
    }
    /**
     * 
     * Corresponds to the "transit_time" property.
     * 
     * @return
     *     The transitTime
     */
    public String getTransitTime() {
        return transitTime;
    }

    /**
     * 
     * Corresponds to the "transit_time" property.
     * 
     * @param transitTime
     *     The transit_time
     */
    public void setTransitTime(String transitTime) {
        this.transitTime = transitTime;
    }

    /**
     * 
     * @return
     *     The latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public GeoPoint toGeoPoint(){
        return new GeoPoint((int)(latitude * 1E6), (int)(longitude * 1E6));
    }
}
