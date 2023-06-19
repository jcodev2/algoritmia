/* 4. Ingresar N números enteros positivos a un arreglo A.
   - Reportar A.
   - Luego en un arreglo B, en cada posición B[i], almacenar la cantidad de dígitos de cada A[i].
   - Luego reportar A, y B en paralelo. */

package Codigo;

import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {
    int[] arregloA = new int[100];
    int[] arregloB = new int[100];

    int n;

    n = leerN();

    System.out.println("\nIngrese los elementos del arreglo A: ");
    leerArreglo(arregloA, n);

    System.out.println("\nArreglo A: ");
    mostrarArreglo(arregloA, n);

    calcularDigitos(arregloA, arregloB, n);

    System.out.println("\nArreglo B: ");
    mostrarArreglo(arregloB, n);
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

  public static void calcularDigitos(int[] arregloA, int[] arregloB, int n) {
    int digitos;

    for (int i = 0; i < n; i++) {
      digitos = 0;

      while (arregloA[i] > 0) {
        arregloA[i] /= 10;
        digitos++;
      }

      arregloB[i] = digitos;
    }
  }
}