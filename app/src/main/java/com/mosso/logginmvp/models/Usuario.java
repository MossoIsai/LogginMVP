package com.mosso.logginmvp.models;

/**
 * Created by isaigarciamoso on 21/01/18.
 */

public class Usuario {

    private String departmento;
    private String nomnbre;

    public Usuario(String departmento, String nomnbre) {
        this.departmento = departmento;
        this.nomnbre = nomnbre;
    }

    public String getDepartmento() {
        return departmento;
    }

    public void setDepartmento(String departmento) {
        this.departmento = departmento;
    }

    public String getNomnbre() {
        return nomnbre;
    }

    public void setNomnbre(String nomnbre) {
        this.nomnbre = nomnbre;
    }
}
