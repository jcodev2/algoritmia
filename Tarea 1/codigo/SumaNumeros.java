// 1. Leer 2 números y Reportar la suma de ambos números.

import java.util.Scanner;

public class SumaNumeros {
  public static void main(String[] args) {
    // Crear un objeto Scanner para leer la entrada de la consola
    Scanner sc = new Scanner(System.in);

    // Crear variables para almacenar los números
    int num1, num2, suma;

    // Lectura de los números desde el teclado
    System.out.print("Ingrese el primer número: ");
    num1 = sc.nextInt();

    System.out.print("Ingrese el segundo número: ");
    num2 = sc.nextInt();

    // Cálculo de la suma
    suma = num1 + num2;

    // Mostrar el resultado por pantalla
    System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);

    // Cerrar el objeto Scanner
    sc.close();
  }
}