package com.droidfreesoft.Modelo;

import com.droidfreesoft.Interface.TarjetaCredito;

/**
 * Created by gustavo on 12/3/2017.
 */
public class TarjetaCreditoImp implements TarjetaCredito {

    private String detalles;

    public TarjetaCreditoImp(String detalles) {
        this.detalles = detalles;
    }

    public String getDetalles() {
        return this.detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String show() {
        return detalles;
    }
}
