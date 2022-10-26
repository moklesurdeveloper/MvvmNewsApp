package com.mvvm.retrofitFinal.Service.Network;

import com.mvvm.retrofitFinal.Service.Model.CarInfoModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("cars_list.json")
    Call<List<CarInfoModel>> getCarInfoList();
}
