package com.mvvm.retrofitFinal.View.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mvvm.retrofitFinal.R;
import com.mvvm.retrofitFinal.Service.Model.CarInfoModel;
import com.mvvm.retrofitFinal.View.Adapter.CardAdapter;
import com.mvvm.retrofitFinal.ViewModel.CarModelView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    CarModelView mViewModel;
    RecyclerView recyclerview;
    CardAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewModel = new ViewModelProvider(this).get(CarModelView.class);

        mViewModel.getDataCarList().observe(this, new Observer<List<CarInfoModel>>() {
            @Override
            public void onChanged(List<CarInfoModel> models)
            {
                recyclerview = findViewById(R.id.cars_recyclerview);
                recyclerview.setLayoutManager(new GridLayoutManager(MainActivity.this,2));
                adapter = new CardAdapter(MainActivity.this,models);
                recyclerview.setAdapter(adapter);
            }
        });

    }
}