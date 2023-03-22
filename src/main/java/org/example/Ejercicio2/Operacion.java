package org.example.Ejercicio2;

public class Operacion {
    public static int suma(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long)a + b;
        if(resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int)resultado;
    }

    public static int resta(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long)a - b;
        if(resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int)resultado;
    }

    public static int multiplicacion(int a, int b) throws DesbordaCapacidadExcepcion {
        long resultado = (long)a * b;
        if(resultado > Integer.MAX_VALUE || resultado < Integer.MIN_VALUE) {
            throw new DesbordaCapacidadExcepcion();
        }
        return (int)resultado;
    }
}

