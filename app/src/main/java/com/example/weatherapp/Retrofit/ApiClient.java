package com.example.weatherapp.Retrofit;

import android.util.Base64;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    static {
        System.loadLibrary("keys");
    }

    public native static  String getApi();

    private static Retrofit retrofit = null;

    public static String APIKEY = new String(Base64.decode(getApi(), Base64.DEFAULT));

   public static  Retrofit getClient(){

        if (retrofit == null){

            retrofit = new Retrofit.Builder()
                    .baseUrl(APIKEY)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }


        return retrofit;

    }
}
