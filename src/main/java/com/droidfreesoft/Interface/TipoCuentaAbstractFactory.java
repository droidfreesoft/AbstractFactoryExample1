package com.droidfreesoft.Interface;

import com.droidfreesoft.Interface.Cuenta;
import com.droidfreesoft.Interface.TarjetaCredito;
import com.droidfreesoft.Interface.TarjetaDebito;

/**
 * Created by gustavo on 12/3/2017.
 */
public interface TipoCuentaAbstractFactory {

    String getNombre();

    Cuenta getCuenta();

    TarjetaDebito getTarjetaDebito();

    TarjetaCredito getTarjetaCredito();
}
