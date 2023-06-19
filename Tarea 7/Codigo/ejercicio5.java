/*
  Ingresar N números enteros positivos a un arreglo A. y N números enteros positivos en un arreglo B.
    - Luego Reportar A y Reportar B.
    - Después, en un arreglo P, en cada posición P[i], almacenar el producto por sumas sucesivas de A[i] * B[i].
    - Luego reportar A, B y C en paralelo.
*/

import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Declaración de arreglos A, B y P de tamaño 100
    int[] A = new int[100];
    int[] B = new int[100];
    int[] P = new int[100];

    int n, numero;

    // Ciclo do-while para asegurarse de que el usuario ingrese un valor válido para
    // n
    do {
      System.out.print("Ingrese la cantidad de números enteros positivos para el arreglo A: ");
      n = input.nextInt();
    } while (n <= 0 || n > 100);

    // Ciclo for para ingresar los valores de A
    System.out.println("\nIngrese números enteros positivos para el arreglo A: ");
    for (int i = 0; i < n; i++) {
      do {
        System.out.print("Ingrese el número " + (i + 1) + ": ");
        numero = input.nextInt();
      } while (numero <= 0);

      A[i] = numero;
    }

    // Ciclo for para ingresar los valores de B
    System.out.println("\nIngrese números enteros positivos para el arreglo B: ");
    for (int i = 0; i < n; i++) {
      do {
        System.out.print("Ingrese el número " + (i + 1) + ": ");
        numero = input.nextInt();
      } while (numero <= 0);

      B[i] = numero;
    }

    // Ciclo for para imprimir los valores de A
    System.out.println("\nArreglo A: ");
    for (int i = 0; i < n; i++) {
      System.out.println("Número " + (i + 1) + ": " + A[i]);
    }

    // Ciclo for para imprimir los valores de B
    System.out.println("\nArreglo B: ");
    for (int i = 0; i < n; i++) {
      System.out.println("Número " + (i + 1) + ": " + B[i]);
    }

    // Ciclo for para calcular los valores de P
    for (int i = 0; i < n; i++) {
      P[i] = 0;

      for (int j = 0; j < B[i]; j++) {
        P[i] += A[i];
      }
    }

    // Ciclo for para imprimir los valores de P
    System.out.println("\nArreglo P: ");
    for (int i = 0; i < n; i++) {
      System.out.println("Multiplicación de " + A[i] + " * " + B[i] + ": " + P[i]);
    }

    // Cierre del objeto Scanner
    input.close();
  }
}