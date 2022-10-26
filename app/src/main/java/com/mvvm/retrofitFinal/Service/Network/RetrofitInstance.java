package com.mvvm.retrofitFinal.Service.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    /**
     * Base Url
     */
    public static String BASE_URL = "https://navneet7k.github.io/";

    public static Retrofit retrofit ;

    public static Retrofit getRetroInstance(){

        if (retrofit == null)
        {
            retrofit=new Retrofit.Builder()
                    .baseUrl("https://navneet7k.github.io/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
