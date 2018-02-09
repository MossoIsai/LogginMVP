package com.mosso.logginmvp.view.activities;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.mosso.logginmvp.R;
import com.mosso.logginmvp.interaptores.LoginPresenterImpl;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginView extends AppCompatActivity implements LoginInterface.View{

    @BindView(R.id.txtNombre) EditText txtNombre;
    @BindView(R.id.txtPassword) EditText txtPassword;
    @BindView(R.id.btnEnter) Button btnEnter;
    //LoginPresenterImpl loginPresenter;
    LoginPresenter loginPresenter;
    private String nombre;
    private String password;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        ButterKnife.bind(this);
        //loginPresenter = new LoginPresenterImpl(this);
        loginPresenter = new LoginPresenter(this);
    }

    @OnClick(R.id.btnEnter) void clickEnter(){
       loginPresenter.login(nombre,password);
         //loginPresenter.login(nombre, password);

    }

    @Override
    public void initViews() {
        //Cambio el tipo de letra y personalizo
        nombre = txtNombre.getText().toString();
        password = txtPassword.getText().toString();
        Typeface typeface = Typeface.createFromAsset(getAssets(),"font/dksljdksds/letra.otf");
        txtPassword.setTypeface(typeface);
    }



}
