package com.mosso.logginmvp.api.client;

import com.mosso.logginmvp.constantes.Constantes;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by isaigarciamoso on 21/01/18.
 */

public class RetrofitClient {

  private static  Retrofit mretrofit = null;


  private static Retrofit getInstance(){//Singleton

      HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
      httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
      //Muenstra los datos en Log "HttpLoggingInterceptor.Level.BODY"

      OkHttpClient okHttpClient = new OkHttpClient.Builder()
              .connectTimeout(20, TimeUnit.SECONDS) //Tiempo de conexion
              .readTimeout(20,TimeUnit.SECONDS) // Tiempo de socket
              .addInterceptor(httpLoggingInterceptor)
              .build();

     if(mretrofit == null){

         mretrofit = new Retrofit.Builder().
                 baseUrl(Constantes.BASE_URL)
                 .client(okHttpClient)
                 .addConverterFactory(GsonConverterFactory.create())
                 .build();
     }
     return  mretrofit;
  }

}
