package org.example.Ejercicio2;

import java.util.Scanner;

public class Calculadora {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("Introducir un número entero:");
                int numero1 = scanner.nextInt();

                System.out.println(numero1);

                System.out.println("¿Operador? (+ - * / % o s para salir)");
                String operador = scanner.next();

                if(operador.equals("s")) {
                    break;
                }

                System.out.println("Introducir un número entero:");
                int numero2 = scanner.nextInt();

                int resultado;
                switch(operador) {
                    case "+":
                        resultado = Operacion.suma(numero1, numero2);
                        break;
                    case "-":
                        resultado = Operacion.resta(numero1, numero2);
                        break;
                    case "*":
                        resultado = Operacion.multiplicacion(numero1, numero2);
                        break;
                    case "/":
                        if(numero2 == 0) {
                            throw new ArithmeticException("La división por cero no está definida");
                        }
                        resultado = numero1 / numero2;
                        break;
                    case "%":
                        if(numero2 == 0) {
                            throw new ArithmeticException("La división por cero no está definida");
                        }
                        resultado = numero1 % numero2;
                        break;
                    default:
                        System.out.println("Operador no válido");
                        continue;
                }

                System.out.println(numero1 + " " + operador + " " + numero2 + " = " + resultado);
            } catch (DesbordaCapacidadExcepcion e) {
                System.out.println(e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Valor introducido incorrecto. Inténtelo de nuevo...");

                scanner.nextLine();
            }
        }
    }
}

