package com.mvvm.retrofitFinal.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.mvvm.retrofitFinal.Service.Model.CarInfoModel;
import com.mvvm.retrofitFinal.Service.Repository.CarRepository;
import com.mvvm.retrofitFinal.Service.Repository.CarRepositoryIm;

import java.util.List;

public class CarModelView extends AndroidViewModel {


    CarRepositoryIm carRepository;

    public CarModelView(@NonNull Application application) {
        super(application);
        carRepository = CarRepository.getInstance(application);

    }

    public LiveData<List<CarInfoModel>> getDataCarList()
    {
        return carRepository.getDataList();
    }
}
