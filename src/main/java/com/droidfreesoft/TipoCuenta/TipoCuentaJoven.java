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
public class TipoCuentaJoven implements TipoCuentaAbstractFactory {

    public Cuenta getCuenta() {
        return new CuentaImp("1%");
    }

    public TarjetaDebito getTarjetaDebito() {
        return new TarjetaDebitoImp("Gratuito");
    }

    public TarjetaCredito getTarjetaCredito() {
        return new TarjetaCreditoImp("Gratuito max.600");
    }

    public String getNombre() {
        return "Joven";
    }
}
