
package com.example.user.travellog.Entry;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostTravelGsonResponce {

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

}
