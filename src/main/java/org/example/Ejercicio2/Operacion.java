package org.example.Ejercicio2;

class Operacion {
    public static int sumar(int a, int b) throws org.example.DesbordaCapacidadExcepcion {
        long resultado = (long) a + (long) b;
        if (resultado < Integer.MIN_VALUE || resultado > Integer.MAX_VALUE) {
            throw new org.example.DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora.");
        }
        return a + b;
    }

    public static int restar(int a, int b) throws org.example.DesbordaCapacidadExcepcion {
        long resultado = (long) a - (long) b;
        if (resultado < Integer.MIN_VALUE || resultado > Integer.MAX_VALUE) {
            throw new org.example.DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora.");
        }
        return a - b;
    }

    public static int multiplicar(int a, int b) throws org.example.DesbordaCapacidadExcepcion {
        long resultado = (long) a * (long) b;
        if (resultado < Integer.MIN_VALUE || resultado > Integer.MAX_VALUE) {
            throw new org.example.DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora.");
        }
        return a * b;
    }
}

