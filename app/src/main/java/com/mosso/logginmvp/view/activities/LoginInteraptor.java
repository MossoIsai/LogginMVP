package com.mosso.logginmvp.view.activities;

import android.util.Log;
import android.widget.Toast;

import com.mosso.logginmvp.api.client.HttpUsuario;
import com.mosso.logginmvp.api.client.RetrofitClient;
import com.mosso.logginmvp.models.Usuario;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by isaigarciamoso on 09/02/18.
 */

public class LoginInteraptor  implements LoginInterface.Interaptor{

    private LoginInterface.Presentador presentador;

    public LoginInteraptor(LoginInterface.Presentador presentador) {
        this.presentador = presentador;

    }

    @Override
    public void login(String usuario, String password) {
        presentador.login(usuario, password);
        HttpUsuario httpUsuario = RetrofitClient.getInstance().create(HttpUsuario.class);
        Call<Usuario> respuesta = httpUsuario.login(usuario, password);
        respuesta.enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                // Realzar operacion
               // Log.d("SUCEES ","Respuesta con exito");
                //Toast.makeText(loginView,"Mensaje de error",Toast.LENGTH_LONG).show();

            }
            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {
                //Error
                Log.e("ERROR: ","Ocurrio un error: "+t.getMessage());

            }
        });

    }
}
