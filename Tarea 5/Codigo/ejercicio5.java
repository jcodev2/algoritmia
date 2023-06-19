/* Leer X números y para cada uno indicar si es primo o no lo es. */

// importamos la libreria Scanner
import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args) {
    // creamos el objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int x, numero, contador = 0, i, j;

    // leemos el número de veces que se va a repetir el programa
    System.out.print("Introduce el número de veces que se va a repetir el programa: ");
    x = sc.nextInt();

    // validamos que el número de veces sea mayor que 0
    while (x <= 0) {
      System.out.println("\n\u001B[31mERROR:El número de veces debe ser mayor que 0\u001B[0m");
      System.out.print("Introduce el número de veces que se va a repetir el programa: ");
      x = sc.nextInt();
    }

    // bucle para repetir el programa
    for (i = 0; i < x; i++) {
      // leemos el número
      System.out.print("\nIntroduce un número: ");
      numero = sc.nextInt();

      // validamos que el número sea mayor que 0
      while (numero <= 0) {
        System.out.println("\nEl número debe ser mayor que 0");
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();
      }

      // bucle para comprobar si el número es primo
      for (j = 1; j <= numero; j++) {
        if (numero % j == 0) {
          contador++;
        }
      }

      // mostramos el resultado
      if (contador == 2) {
        System.out.println("\u001B[36mEl número " + numero + " es primo\u001B[0m");
      } else {
        System.out.println("\u001B[36mEl número " + numero + " no es primo\u001B[0m");
      }

      // reiniciamos el contador
      contador = 0;
    }

    // cerramos el Scanner
    sc.close();
  }
}