package org.example.Ejercicio1;
import java.util.Scanner;

public class raizCuadrada {

    // Definimos la función que calcula la raíz cuadrada y lanza una excepción si su argumento es negativo
    public static double raizCuadrada(double numero) throws Exception {
        if (numero < 0) {
            throw new Exception("La raíz cuadrada no está definida para un número negativo.");
        }
        return Math.sqrt(numero);
    }

    // Función main para la entrada y visualización

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir un valor: ");
        double numero = scanner.nextDouble();
        scanner.close();

        try {
            double resultado = raizCuadrada(numero);
            System.out.println("√" + numero + " = " + resultado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
