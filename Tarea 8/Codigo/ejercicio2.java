/* 2. Diseñe un algoritmo que permita ingresar N números enteros positivos en un arreglo A y N números enteros positivos en un arreglo B (como máximo 100 para cada uno).
   - Reportar el arreglo A, y después el arreglo B.
   - Luego, sumar cada elemento A[i], del arreglo A con cada elemento B[i], del arreglo B y almacenar cada resultado en un arreglo C, en la posición C[i].
   - Al final reportar el arreglo resultante C. */

package Codigo;

import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    int[] arregloA = new int[100];
    int[] arregloB = new int[100];
    int[] arregloC = new int[100];

    int n;

    n = leerN();

    System.out.println("\nIngrese los elementos del arreglo A: ");
    leerArreglo(arregloA, n);

    System.out.println("\nIngrese los elementos del arreglo B: ");
    leerArreglo(arregloB, n);

    System.out.println("\nArreglo A: ");
    mostrarArreglo(arregloA, n);

    System.out.println("\nArreglo B: ");
    mostrarArreglo(arregloB, n);

    sumarArreglos(arregloA, arregloB, arregloC, n);

    System.out.println("\nArreglo C: ");
    mostrarArreglo(arregloC, n);
  }

  public static int leerN() {
    Scanner input = new Scanner(System.in);

    int n;

    do {
      System.out.print("\nIngrese la cantidad de elementos: ");
      n = input.nextInt();
    } while (n <= 0 || n > 100);

    return n;
  }

  public static void leerArreglo(int[] arreglo, int n) {
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < n; i++) {
      System.out.print("Ingrese el elemento " + (i + 1) + ": ");
      arreglo[i] = input.nextInt();
    }
  }

  public static void mostrarArreglo(int[] arreglo, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println("Elemento " + (i + 1) + ": " + arreglo[i]);
    }
  }

  public static void sumarArreglos(int[] arregloA, int[] arregloB, int[] arregloC, int n) {
    for (int i = 0; i < n; i++) {
      arregloC[i] = arregloA[i] + arregloB[i];
    }
  }
}