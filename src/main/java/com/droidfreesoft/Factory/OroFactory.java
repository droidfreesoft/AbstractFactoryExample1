package com.droidfreesoft.Factory;

import com.droidfreesoft.Interface.*;
import com.droidfreesoft.TipoCuenta.TipoCuentaOro;

/**
 * Created by gustavo on 12/3/2017.
 */
public class OroFactory implements ServicioBancoFactory {

    public TipoCuentaAbstractFactory crearTipoCuentaAbstractFactory() {
        return new TipoCuentaOro();
    }

}
