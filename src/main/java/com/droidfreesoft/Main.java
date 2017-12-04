package com.droidfreesoft;

import com.droidfreesoft.Factory.*;
import com.droidfreesoft.Interface.ServicioBancoFactory;
import com.droidfreesoft.Interface.TipoCuentaAbstractFactory;

/**
 * Created by gustavo on 12/3/2017.
 */
public class Main {

    public static void main(String[] args) {

        crearCuenta(new JovenFactory());
        crearCuenta(new MedioFactory());
        crearCuenta(new OroFactory());


    }

    public static void crearCuenta(ServicioBancoFactory servicioBanco) {
        TipoCuentaAbstractFactory tipoCuentaAbstractFactory = servicioBanco.crearTipoCuentaAbstractFactory();
        System.out.println("--------------------------------------------------------");
        System.out.println("Tipo de cuenta: " + tipoCuentaAbstractFactory.getNombre());
        System.out.println("Cuenta: " + tipoCuentaAbstractFactory.getCuenta().show());
        System.out.println("Tarjeta Debito: " + tipoCuentaAbstractFactory.getTarjetaDebito().show());
        System.out.println("Tarjeta Credito: " + tipoCuentaAbstractFactory.getTarjetaCredito().show());


    }


}
