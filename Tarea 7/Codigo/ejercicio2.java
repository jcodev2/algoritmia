/*
  Este programa permite ingresar N números enteros positivos en un arreglo A y N números enteros positivos en un arreglo B (como máximo 100 para cada uno).
  Luego, suma cada elemento A[i], del arreglo A con cada elemento B[i], del arreglo B y almacena cada resultado en un arreglo C, en la posición C[i].
  Finalmente, muestra los arreglos A, B y C.
*/

import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Declaración de arreglos y variables
    int[] A = new int[100];
    int[] B = new int[100];
    int[] C = new int[100];
    int n, numero;

    // Solicita la cantidad de números enteros positivos para el arreglo A
    do {
      System.out.print("Ingrese la cantidad de números enteros positivos para el arreglo A: ");
      n = input.nextInt();
    } while (n <= 0 || n > 100);

    // Solicita los números enteros positivos para el arreglo A
    System.out.println("\nIngrese números enteros positivos para el arreglo A: ");
    for (int i = 0; i < n; i++) {
      do {
        System.out.print("Ingrese el número " + (i + 1) + ": ");
        numero = input.nextInt();
      } while (numero <= 0);

      A[i] = numero;
    }

    // Solicita los números enteros positivos para el arreglo B
    System.out.println("\nIngrese números enteros positivos para el arreglo B: ");
    for (int i = 0; i < n; i++) {
      do {
        System.out.print("Ingrese el número " + (i + 1) + ": ");
        numero = input.nextInt();
      } while (numero <= 0);

      B[i] = numero;
    }

    // Muestra el arreglo A
    System.out.println("\nArreglo A: ");
    for (int i = 0; i < n; i++) {
      System.out.println("Número " + (i + 1) + ": " + A[i]);
    }

    // Muestra el arreglo B
    System.out.println("\nArreglo B: ");
    for (int i = 0; i < n; i++) {
      System.out.println("Número " + (i + 1) + ": " + B[i]);
    }

    // Suma los elementos de los arreglos A y B y los almacena en el arreglo C
    for (int i = 0; i < n; i++) {
      C[i] = A[i] + B[i];
    }

    // Muestra el arreglo C
    System.out.println("\nArreglo C: ");
    for (int i = 0; i < n; i++) {
      System.out.println((i + 1) + ". Suma de " + A[i] + " + " + B[i] + ": " + C[i]);
    }

    input.close();
  }
}