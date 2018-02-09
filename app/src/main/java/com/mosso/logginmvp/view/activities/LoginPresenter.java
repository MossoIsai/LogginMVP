package com.mosso.logginmvp.view.activities;

import com.mosso.logginmvp.view.activities.LoginInterface.Presentador;

/**
 * Created by isaigarciamoso on 09/02/18.
 */

public class LoginPresenter implements Presentador {

     private  LoginInterface.View view;
     private LoginInterface.Interaptor interaptor;


    public LoginPresenter(LoginInterface.View view) {
        this.view = view;
        interaptor = new LoginInteraptor(this);
    }

    @Override
    public void login(String usuario, String password) {
        if(view != null){
            interaptor.login(usuario,password);
        }

    }
}
