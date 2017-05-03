
package com.alwh.alweather.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wind {

    @SerializedName("speed")
    @Expose
    public Double speed;
    @SerializedName("deg")
    @Expose
    public Integer deg;
    @SerializedName("gust")
    @Expose
    public Double gust;

}
