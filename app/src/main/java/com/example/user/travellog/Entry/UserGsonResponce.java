
package com.example.user.travellog.Entry;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserGsonResponce {

    /**
     * 
     * Corresponds to the "user_code" property.
     * 
     */
    @SerializedName("user_code")
    @Expose
    private String userCode;
    @SerializedName("token")
    @Expose
    private String token;

    /**
     * 
     * Corresponds to the "user_code" property.
     * 
     * @return
     *     The userCode
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 
     * Corresponds to the "user_code" property.
     * 
     * @param userCode
     *     The user_code
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * 
     * @return
     *     The token
     */
    public String getToken() {
        return token;
    }

    /**
     * 
     * @param token
     *     The token
     */
    public void setToken(String token) {
        this.token = token;
    }

}
