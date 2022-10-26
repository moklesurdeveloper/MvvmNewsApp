package com.mvvm.retrofitFinal.Service.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CarInfoModel
{
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String CarNames;
    @SerializedName("desc")
    @Expose
    private String CarDetails;
    @SerializedName("image")
    @Expose
    private String CarImages;

    public String getId() {
        return id;
    }

    public String getCarNames() {
        return CarNames;
    }

    public String getCarDetails() {
        return CarDetails;
    }

    public String getCarImages() {
        return CarImages;
    }
}
