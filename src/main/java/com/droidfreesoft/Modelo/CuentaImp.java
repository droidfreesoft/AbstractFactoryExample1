package com.droidfreesoft.Modelo;

import com.droidfreesoft.Interface.Cuenta;

/**
 * Created by gustavo on 12/3/2017.
 */
public class CuentaImp implements Cuenta {

    private String desceunto;

    public CuentaImp(String desceunto) {
        this.desceunto = desceunto;
    }

    public String getDesceunto() {
        return this.desceunto;
    }

    public void setDesceunto(String desceunto) {
        this.desceunto = desceunto;
    }

    public String show() {
        return desceunto;
    }
}
