
package com.example.user.travellog.Entry;

import com.example.user.travellog.R;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import jp.co.yahoo.android.maps.GeoPoint;

public class Spot implements Serializable{

    /**
     * 
     * Corresponds to the "visit_time" property.
     * 
     */
    @SerializedName("visit_time")
    @Expose
    private String visitTime;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    /**
     * 
     * Corresponds to the "spot_name" property.
     * 
     */
    @SerializedName("spot_name")
    @Expose
    private String spotName;
    /**
     * 
     * Corresponds to the "site_url" property.
     * 
     */
    @SerializedName("site_url")
    @Expose
    private String siteUrl;
    /**
     * 
     * Corresponds to the "stay_minute" property.
     * 
     */
    @SerializedName("stay_minute")
    @Expose
    private Integer stayMinute;
    /**
     *
     * Corresponds to the "site_url" property.
     *
     */
    @SerializedName("spot_code")
    @Expose
    private String spotCode;
    /**
     *
     * Corresponds to the "site_url" property.
     *
     */
    @SerializedName("category_code")
    @Expose
    private String categoryCode;

    /**
     * 
     * Corresponds to the "visit_time" property.
     * 
     * @return
     *     The visitTime
     */
    public String getVisitTime() {
        return visitTime;
    }

    /**
     * 
     * Corresponds to the "visit_time" property.
     * 
     * @param visitTime
     *     The visit_time
     */
    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
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
     * Corresponds to the "spot_name" property.
     * 
     * @return
     *     The spotName
     */
    public String getSpotName() {
        return spotName;
    }

    /**
     * 
     * Corresponds to the "spot_name" property.
     * 
     * @param spotName
     *     The spot_name
     */
    public void setSpotName(String spotName) {
        this.spotName = spotName;
    }

    /**
     * 
     * Corresponds to the "site_url" property.
     * 
     * @return
     *     The siteUrl
     */
    public String getSiteUrl() {
        return siteUrl;
    }

    /**
     * 
     * Corresponds to the "site_url" property.
     * 
     * @param siteUrl
     *     The site_url
     */
    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    /**
     * 
     * Corresponds to the "stay_minute" property.
     * 
     * @return
     *     The stayMinute
     */
    public Integer getStayMinute() {
        return stayMinute;
    }

    /**
     * 
     * Corresponds to the "stay_minute" property.
     * 
     * @param stayMinute
     *     The stay_minute
     */
    public void setStayMinute(Integer stayMinute) {
        this.stayMinute = stayMinute;
    }

    public String getSpotCode() {
        return spotCode;
    }

    public void setSpotCode(String spotCode) {
        this.spotCode = spotCode;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public GeoPoint toGeoPoint(){
        return new GeoPoint((int)(latitude * 1E6), (int)(longitude * 1E6));
    }


    public int getIcon(){
        String code = categoryCode;
        if(categoryCode.length() != 2) code =  code.substring(0,2);
        if(code.equals("01")) {
            return 1;
        } else
        if (code.equals("02")){
            return 2;
        } else
        if (code.equals("03")){
            return 3;
        } else
        if (code.equals("04")){
            return 4;
        } else {
            return 5;
        }
    }
}
