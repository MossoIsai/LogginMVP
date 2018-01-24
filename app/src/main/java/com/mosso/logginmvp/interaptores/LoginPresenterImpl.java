package com.mosso.logginmvp.interaptores;

import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.mosso.logginmvp.api.client.HttpUsuario;
import com.mosso.logginmvp.api.client.RetrofitClient;
import com.mosso.logginmvp.models.Usuario;
import com.mosso.logginmvp.view.activities.ILoginViewPresenter;
import com.mosso.logginmvp.view.activities.LoginView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by isaigarciamoso on 22/01/18.
 */

public class LoginPresenterImpl implements ILoginViewPresenter {

    private LoginView loginView;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void login(String nombre, String password) {

        HttpUsuario httpUsuario = RetrofitClient.getInstance().create(HttpUsuario.class);
        Call<Usuario> respuesta = httpUsuario.login(nombre, password);
        respuesta.enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
             // Realzar operacion
                Log.d("SUCEES ","Respuesta con exito");
                Toast.makeText(loginView,"Mensaje de error",Toast.LENGTH_LONG).show();

            }
            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {
                //Error
                Log.e("ERROR: ","Ocurrio un error: "+t.getMessage());

            }
        });
    }
}
