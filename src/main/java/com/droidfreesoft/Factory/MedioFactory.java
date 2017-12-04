package com.droidfreesoft.Factory;

import com.droidfreesoft.Interface.*;
import com.droidfreesoft.TipoCuenta.TipoCuentaMedio;

/**
 * Created by gustavo on 12/3/2017.
 */
public class MedioFactory implements ServicioBancoFactory {

    public TipoCuentaAbstractFactory crearTipoCuentaAbstractFactory() {
        return new TipoCuentaMedio();
    }
}
