/*
  Ingresar N números enteros positivos a un arreglo A.

    - Reportar A.
    - Luego en un arreglo B, en cada posición B[i], almacenar la cantidad de dígitos de cada A[i].
    - Luego reportar A, y B en paralelo.
*/

import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Declaración de arreglos y variables
    int[] A = new int[100];
    int[] B = new int[100];
    int n, numero, contador;

    // Ciclo para validar la cantidad de números a ingresar
    do {
      System.out.print("Ingrese la cantidad de números enteros positivos para el arreglo A: ");
      n = input.nextInt();
    } while (n <= 0 || n > 100);

    // Ciclo para ingresar los números y contar sus dígitos
    System.out.println("\nIngrese números enteros positivos para el arreglo A: ");
    for (int i = 0; i < n; i++) {
      do {
        System.out.print("Ingrese el número " + (i + 1) + ": ");
        numero = input.nextInt();
      } while (numero <= 0);

      A[i] = numero;
      contador = 0;

      while (numero != 0) {
        numero /= 10;
        contador++;
      }

      B[i] = contador;
    }

    // Impresión del arreglo A
    System.out.println("\nArreglo A: ");
    for (int i = 0; i < n; i++) {
      System.out.println("Número " + (i + 1) + ": " + A[i]);
    }

    // Impresión del arreglo B
    System.out.println("\nArreglo B: ");
    for (int i = 0; i < n; i++) {
      System.out.println("Número " + (i + 1) + ": " + B[i]);
    }

    // Cierre del objeto Scanner
    input.close();
  }
}