package com.droidfreesoft.Modelo;

import com.droidfreesoft.Interface.TarjetaDebito;

/**
 * Created by gustavo on 12/3/2017.
 */
public class TarjetaDebitoImp implements TarjetaDebito {

    private String descuento;

    public TarjetaDebitoImp(String descuento) {
        this.descuento = descuento;
    }

    public String getDescuento() {
        return this.descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String show() {
        return descuento;
    }
}
