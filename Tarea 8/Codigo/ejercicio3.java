/* 3. Diseñe un algoritmo que permita ingresar N nombres en un arreglo X y, N nombres en un arreglo W (como máximo 100 para cada uno).
   - Reportar el arreglo X, y después el arreglo W.
   - Luego, almacene en un arreglo Z, en cada posición Z[i], la palabra “IGUALES”
   si los elementos X[i] y W[i] son iguales, en caso contrario almacenar la palabra “DIFERENTES”.
   - Reportar el arreglo resultante Z. */

package Codigo;

import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
    String[] arregloX = new String[100];
    String[] arregloW = new String[100];
    String[] arregloZ = new String[100];

    int n;

    n = leerN();

    System.out.println("\nIngrese los elementos del arreglo X: ");
    leerArreglo(arregloX, n);

    System.out.println("\nIngrese los elementos del arreglo W: ");
    leerArreglo(arregloW, n);

    System.out.println("\nArreglo X: ");
    mostrarArreglo(arregloX, n);

    System.out.println("\nArreglo W: ");
    mostrarArreglo(arregloW, n);

    compararArreglos(arregloX, arregloW, arregloZ, n);

    System.out.println("\nArreglo Z: ");
    mostrarArreglo(arregloZ, n);
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

  public static void leerArreglo(String[] arreglo, int n) {
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < n; i++) {
      System.out.print("Ingrese el elemento " + (i + 1) + ": ");
      arreglo[i] = input.next().toLowerCase();
    }
  }

  public static void mostrarArreglo(String[] arreglo, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println("Elemento " + (i + 1) + ": " + arreglo[i]);
    }
  }

  public static void compararArreglos(String[] arregloX, String[] arregloW, String[] arregloZ, int n) {
    for (int i = 0; i < n; i++) {
      if (arregloX[i].equals(arregloW[i])) {
        arregloZ[i] = "IGUALES";
      } else {
        arregloZ[i] = "DIFERENTES";
      }
    }
  }
}