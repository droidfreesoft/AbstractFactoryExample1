package com.droidfreesoft.Factory;

import com.droidfreesoft.Interface.*;
import com.droidfreesoft.TipoCuenta.TipoCuentaJoven;

/**
 * Created by gustavo on 12/3/2017.
 */
public class JovenFactory implements ServicioBancoFactory {

    public TipoCuentaAbstractFactory crearTipoCuentaAbstractFactory() {
        return new TipoCuentaJoven();
    }
}
