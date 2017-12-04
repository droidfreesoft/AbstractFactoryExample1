package com.droidfreesoft.TipoCuenta;

import com.droidfreesoft.Interface.Cuenta;
import com.droidfreesoft.Interface.TarjetaCredito;
import com.droidfreesoft.Interface.TarjetaDebito;
import com.droidfreesoft.Interface.TipoCuentaAbstractFactory;
import com.droidfreesoft.Modelo.CuentaImp;
import com.droidfreesoft.Modelo.TarjetaCreditoImp;
import com.droidfreesoft.Modelo.TarjetaDebitoImp;

/**
 * Created by gustavo on 12/3/2017.
 */
public class TipoCuentaOro implements TipoCuentaAbstractFactory {

    public Cuenta getCuenta() {
        return new CuentaImp("2%");
    }

    public TarjetaDebito getTarjetaDebito() {
        return new TarjetaDebitoImp("5");
    }

    public TarjetaCredito getTarjetaCredito() {
        return new TarjetaCreditoImp("20 max.4000");
    }

    public String getNombre() {
        return "Oro";
    }
}
