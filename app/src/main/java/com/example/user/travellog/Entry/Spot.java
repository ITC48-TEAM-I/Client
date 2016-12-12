
package com.example.user.travellog.Entry;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Spot {

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

}
