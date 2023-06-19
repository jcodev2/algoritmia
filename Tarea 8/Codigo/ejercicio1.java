/*
  Resolver los siguientes problemas utilizando métodos y arreglos:
  1. Diseñe un algoritmo que lea las edades de N alumnos y reporte:
    - Todos los datos ingresados
    - La lista de las edades mayores de edad, indicando cuantas son.
    - La lista de las edades menores de edad, indicando cuantas son.
    - La edad promedio.
*/

package Codigo;

import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    int[] edades = new int[100];
    int[] mayoresEdad = new int[100];
    int[] menoresEdad = new int[100];

    int n, contadorMayores = 0, contadorMenores = 0;
    double promedio = 0;

    n = leerN();

    System.out.println("\nIngrese edades de los alumnos: ");
    leerEdades(edades, n);

    System.out.println("\nEdades de los alumnos: ");
    mostrarEdades(edades, n);

    contadorMayores = calcularMayoresEdad(edades, mayoresEdad, n);

    System.out.println("\nEdades mayores de edad: ");
    mostrarMayoresEdad(mayoresEdad, contadorMayores);

    contadorMenores = calcularMenoresEdad(edades, menoresEdad, n);

    System.out.println("\nEdades menores de edad: ");
    mostrarMenoresEdad(menoresEdad, contadorMenores);

    promedio = calcularPromedio(edades, n);
    System.out.println("\nEdad promedio: " + promedio);
  }

  public static int leerN() {
    Scanner input = new Scanner(System.in);

    int n;

    do {
      System.out.print("\nIngrese la cantidad de alumnos: ");
      n = input.nextInt();
    } while (n <= 0 || n > 100);

    return n;
  }

  public static void leerEdades(int[] edades, int n) {
    Scanner input = new Scanner(System.in);

    int edad;

    for (int i = 0; i < n; i++) {
      do {
        System.out.print("Ingrese la edad del alumno " + (i + 1) + ": ");
        edad = input.nextInt();
      } while (edad <= 0 || edad >= 100);

      edades[i] = edad;
    }
  }

  public static void mostrarEdades(int[] edades, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println("Alumno " + (i + 1) + ": " + edades[i]);
    }
  }

  public static int calcularMayoresEdad(int[] edades, int[] mayoresEdad, int n) {
    int contadorMayores = 0;

    for (int i = 0; i < n; i++) {
      if (edades[i] >= 18) {
        mayoresEdad[contadorMayores] = edades[i];
        contadorMayores++;
      }
    }

    return contadorMayores;
  }

  public static void mostrarMayoresEdad(int[] mayoresEdad, int contadorMayores) {
    if (contadorMayores == 0) {
      System.out.println("No hay alumnos mayores de edad.");
    } else {
      for (int i = 0; i < contadorMayores; i++) {
        System.out.println("Alumno " + (i + 1) + ": " + mayoresEdad[i]);
      }

      System.out.println("Cantidad de alumnos mayores de edad: " + contadorMayores);
    }
  }

  public static int calcularMenoresEdad(int[] edades, int[] menoresEdad, int n) {
    int contadorMenores = 0;

    for (int i = 0; i < n; i++) {
      if (edades[i] < 18) {
        menoresEdad[contadorMenores] = edades[i];
        contadorMenores++;
      }
    }

    return contadorMenores;
  }

  public static void mostrarMenoresEdad(int[] menoresEdad, int contadorMenores) {
    if (contadorMenores == 0) {
      System.out.println("No hay alumnos menores de edad.");
    } else {
      for (int i = 0; i < contadorMenores; i++) {
        System.out.println("Alumno " + (i + 1) + ": " + menoresEdad[i]);
      }

      System.out.println("Cantidad de alumnos menores de edad: " + contadorMenores);
    }
  }

  public static double calcularPromedio(int[] edades, int n) {
    double promedio = 0;

    for (int i = 0; i < n; i++) {
      promedio += edades[i];
    }

    promedio /= n;

    return promedio;
  }

  public static void mostrarPromedio(double promedio) {
    System.out.println("El promedio de edades es: " + promedio);
  }
}
