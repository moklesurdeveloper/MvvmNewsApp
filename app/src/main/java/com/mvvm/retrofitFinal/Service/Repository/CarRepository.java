package com.mvvm.retrofitFinal.Service.Repository;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import com.mvvm.retrofitFinal.Service.Model.CarInfoModel;
import com.mvvm.retrofitFinal.Service.Network.Api;
import com.mvvm.retrofitFinal.Service.Network.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CarRepository implements CarRepositoryIm
{

    private static Context mContext;
    private static CarRepository instance;
    private List<CarInfoModel> model;
    private MutableLiveData mLiveData;

    public static CarRepository getInstance(Context context)
    {
        if (instance == null)
        {
            mContext = context;
            instance = new CarRepository();
        }
        return instance;
    }


    @Override
    public MutableLiveData<List<CarInfoModel>> getDataList() {
        if (mLiveData == null)
        {
            mLiveData = new MutableLiveData();
        }
        Api requestApi = RetrofitInstance.getRetroInstance().create(Api.class);
        Call<List<CarInfoModel>> call =  requestApi.getCarInfoList();

        call.enqueue(new Callback<List<CarInfoModel>>() {
            @Override
            public void onResponse(Call<List<CarInfoModel>> call, Response<List<CarInfoModel>> response)
            {
                model = response.body();
                mLiveData.postValue(model);

            }
            @Override
            public void onFailure(Call<List<CarInfoModel>> call, Throwable t)
            {}
        });
        return mLiveData;
    }
}
