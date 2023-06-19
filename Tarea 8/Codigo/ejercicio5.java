/* 5. Ingresar N números enteros positivos a un arreglo A. y N números enteros positivos en un arreglo B.
   - Luego Reportar A y Reportar B.
   - Después, en un arreglo P, en cada posición P[i], almacenar el producto por sumas sucesivas de A[i] * B[i].
   - Luego reportar A, B y C en paralelo. */

package Codigo;

import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args) {
    int[] arregloA = new int[100];
    int[] arregloB = new int[100];
    int[] arregloP = new int[100];

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

    calcularProducto(arregloA, arregloB, arregloP, n);

    System.out.println("\nArreglo P: ");
    mostrarArreglo(arregloP, n);
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
      System.out.print("Elemento " + (i + 1) + ": " + arreglo[i] + "\n");
    }
  }

  public static void calcularProducto(int[] arregloA, int[] arregloB, int[] arregloP, int n) {
    for (int i = 0; i < n; i++) {
      arregloP[i] = producto(arregloA[i], arregloB[i]);
    }
  }

  public static int producto(int a, int b) {
    int producto = 0;

    for (int i = 0; i < b; i++) {
      producto += a;
    }

    return producto;
  }
}