
package com.example.user.travellog.Entry;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import jp.co.yahoo.android.maps.GeoPoint;

public class Travel implements Serializable{

    /**
     * 
     * Corresponds to the "travel_code" property.
     * 
     */
    @SerializedName("travel_code")
    @Expose
    private String travelCode;
    /**
     * 
     * Corresponds to the "travel_date" property.
     * 
     */
    @SerializedName("travel_date")
    @Expose
    private String travelDate;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    /**
     * 
     * Corresponds to the "area_name" property.
     * 
     */
    @SerializedName("area_name")
    @Expose
    private String areaName;
    /**
     * 
     * Corresponds to the "country_name" property.
     * 
     */
    @SerializedName("country_name")
    @Expose
    private String countryName;
    @SerializedName("routes")
    @Expose
    private List<Route> routes = null;
    @SerializedName("spots")
    @Expose
    private List<Spot> spots = null;

    /**
     * 
     * Corresponds to the "travel_code" property.
     * 
     * @return
     *     The travelCode
     */
    public String getTravelCode() {
        return travelCode;
    }

    /**
     * 
     * Corresponds to the "travel_code" property.
     * 
     * @param travelCode
     *     The travel_code
     */
    public void setTravelCode(String travelCode) {
        this.travelCode = travelCode;
    }

    /**
     * 
     * Corresponds to the "travel_date" property.
     * 
     * @return
     *     The travelDate
     */
    public String getTravelDate() {
        return travelDate;
    }

    /**
     * 
     * Corresponds to the "travel_date" property.
     * 
     * @param travelDate
     *     The travel_date
     */
    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
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

    /**
     * 
     * Corresponds to the "area_name" property.
     * 
     * @return
     *     The areaName
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 
     * Corresponds to the "area_name" property.
     * 
     * @param areaName
     *     The area_name
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    /**
     * 
     * Corresponds to the "country_name" property.
     * 
     * @return
     *     The countryName
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 
     * Corresponds to the "country_name" property.
     * 
     * @param countryName
     *     The country_name
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * 
     * @return
     *     The routes
     */
    public List<Route> getRoutes() {
        return routes;
    }

    /**
     * 
     * @param routes
     *     The routes
     */
    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    /**
     * 
     * @return
     *     The spots
     */
    public List<Spot> getSpots() {
        return spots;
    }

    /**
     * 
     * @param spots
     *     The spots
     */
    public void setSpots(List<Spot> spots) {
        this.spots = spots;
    }

    public GeoPoint toGeoPoint(){
        return new GeoPoint((int)(latitude * 1E6), (int)(longitude * 1E6));
    }
}
