/*
  Este programa permite ingresar N nombres en un arreglo X y, N nombres en un arreglo W (como máximo 100 para cada uno).
  Luego, almacena en un arreglo Z, en cada posición Z[i], la palabra “IGUALES” si los elementos X[i] y W[i] son iguales, en caso contrario almacenar la palabra “DIFERENTES”.
  Finalmente, reporta los arreglos X, W y Z.

  El programa utiliza la clase Scanner para leer la entrada del usuario.
*/

import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Se crean los arreglos X, W y Z de tipo String con una longitud máxima de 100.
    String[] X = new String[100];
    String[] W = new String[100];
    String[] Z = new String[100];

    int n;
    String nombre;

    // Se solicita al usuario ingresar la cantidad de nombres para el arreglo X.
    // Se utiliza un ciclo do-while para asegurarse de que el valor ingresado sea
    // válido.
    do {
      System.out.print("Ingrese la cantidad de nombres para el arreglo X: ");
      n = input.nextInt();
    } while (n <= 0 || n > 100);

    // Se solicita al usuario ingresar los nombres para el arreglo X.
    System.out.println("\nIngrese nombres para el arreglo X: ");
    for (int i = 0; i < n; i++) {
      System.out.print("Ingrese el nombre " + (i + 1) + ": ");
      nombre = input.next().toLowerCase(); // Lower case the name

      X[i] = nombre;
    }

    // Se solicita al usuario ingresar los nombres para el arreglo W.
    System.out.println("\nIngrese nombres para el arreglo W: ");
    for (int i = 0; i < n; i++) {
      System.out.print("Ingrese el nombre " + (i + 1) + ": ");
      nombre = input.next().toLowerCase(); // Lower case the name

      W[i] = nombre;
    }

    // Se reporta el arreglo X.
    System.out.println("\nArreglo X: ");
    for (int i = 0; i < n; i++) {
      System.out.println("Nombre " + (i + 1) + ": " + X[i]);
    }

    // Se reporta el arreglo W.
    System.out.println("\nArreglo W: ");
    for (int i = 0; i < n; i++) {
      System.out.println("Nombre " + (i + 1) + ": " + W[i]);
    }

    // Se compara cada elemento de los arreglos X y W y se almacena el resultado en
    // el arreglo Z.
    for (int i = 0; i < n; i++) {
      if (X[i].equals(W[i])) {
        Z[i] = "IGUALES";
      } else {
        Z[i] = "DIFERENTES";
      }
    }

    // Se reporta el arreglo Z.
    System.out.println("\nArreglo Z: ");
    for (int i = 0; i < n; i++) {
      System.out.println((i + 1) + ". " + X[i] + " y " + W[i] + " son " + Z[i]);
    }

    // Se cierra el objeto Scanner.
    input.close();
  }
}