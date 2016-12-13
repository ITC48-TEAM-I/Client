
package com.example.user.travellog.Entry;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreateGsonResponce {

    /**
     * 
     * Corresponds to the "create_num" property.
     * 
     */
    @SerializedName("create_num")
    @Expose
    private Integer createNum;

    /**
     * 
     * Corresponds to the "create_num" property.
     * 
     * @return
     *     The createNum
     */
    public Integer getCreateNum() {
        return createNum;
    }

    /**
     * 
     * Corresponds to the "create_num" property.
     * 
     * @param createNum
     *     The create_num
     */
    public void setCreateNum(Integer createNum) {
        this.createNum = createNum;
    }

}
