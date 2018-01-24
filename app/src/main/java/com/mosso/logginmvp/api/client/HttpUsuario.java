package com.mosso.logginmvp.api.client;

import com.mosso.logginmvp.models.Usuario;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by isaigarciamoso on 21/01/18.
 */

public interface HttpUsuario {

    @GET("/LoguearUsuario")
    @Headers("Acept: application/json")
    Call<Usuario> login(@Query("Usuario") String user,@Query("Password") String password);

}
