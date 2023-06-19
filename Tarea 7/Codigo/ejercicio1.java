/*
  Este programa lee las edades de N alumnos y reporta:
    - Todos los datos ingresados
    - La lista de las edades mayores de edad, indicando cuantas son.
    - La lista de las edades menores de edad, indicando cuantas son.
    - La edad promedio.
*/

import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se declaran los arreglos para almacenar las edades de los alumnos
    int[] edades = new int[50];
    int[] mayoresEdad = new int[50];
    int[] menoresEdad = new int[50];

    // Se declaran las variables necesarias
    int n, edad, contadorMayores = 0, contadorMenores = 0;
    double promedio = 0;

    // Se pide al usuario que ingrese la cantidad de alumnos
    do {
      System.out.print("Ingrese la cantidad de alumnos: ");
      n = input.nextInt();
    } while (n <= 0 || n > 50);

    // Se pide al usuario que ingrese las edades de los alumnos
    System.out.println("\nIngrese edades de los alumnos: ");
    for (int i = 0; i < n; i++) {
      do {
        System.out.print("Ingrese la edad del alumno " + (i + 1) + ": ");
        edad = input.nextInt();
      } while (edad <= 0 || edad >= 100);

      edades[i] = edad;
    }

    // Se muestran todas las edades ingresadas
    System.out.println("\nEdades de los alumnos: ");
    for (int i = 0; i < n; i++) {
      System.out.println("Alumno " + (i + 1) + ": " + edades[i]);
    }

    // Se separan las edades mayores y menores de edad
    for (int i = 0; i < n; i++) {
      if (edades[i] >= 18) {
        mayoresEdad[contadorMayores] = edades[i];
        contadorMayores++;
      } else {
        menoresEdad[contadorMenores] = edades[i];
        contadorMenores++;
      }
    }

    // Se muestran las edades mayores de edad y su cantidad
    System.out.println("\nEdades mayores de edad: ");
    for (int i = 0; i < contadorMayores; i++) {
      System.out.println("Alumno " + (i + 1) + ": " + mayoresEdad[i]);
    }
    System.out.println("Cantidad de mayores de edad: " + contadorMayores);

    // Se muestran las edades menores de edad y su cantidad
    System.out.println("\nEdades menores de edad: ");
    for (int i = 0; i < contadorMenores; i++) {
      System.out.println("Alumno " + (i + 1) + ": " + menoresEdad[i]);
    }
    System.out.println("Cantidad de menores de edad: " + contadorMenores);

    // Se calcula la edad promedio de los alumnos
    for (int i = 0; i < n; i++) {
      promedio += edades[i];
    }

    promedio = promedio / n;

    // Se muestra la edad promedio de los alumnos
    System.out.println("\nEdad promedio: " + promedio);

    // Se cierra el objeto Scanner
    input.close();
  }
}