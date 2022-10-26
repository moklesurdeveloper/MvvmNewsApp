package com.mvvm.retrofitFinal.Service.Repository;

import androidx.lifecycle.MutableLiveData;

import com.mvvm.retrofitFinal.Service.Model.CarInfoModel;

import java.util.List;

public interface CarRepositoryIm
{
     MutableLiveData<List<CarInfoModel>> getDataList();
}
