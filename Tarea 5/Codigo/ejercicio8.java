/* Escribir un programa que lea X números enteros positivos y determine para cada uno si es capicúa o no lo es. Un número capicúa es aquel que se lee igual de izquierda a derecha y de derecha a izquierda. */

// importamos la clase Scanner
import java.util.Scanner;

public class ejercicio8 {
  public static void main(String[] args) {
    // creamos un objeto de la clase Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int x, i, numero, numeroInvertido = 0, resto, numeroOriginal;

    // solicitamos los datos al usuario
    System.out.print("Ingresa la cantidad de números a ingresar: ");
    x = sc.nextInt();

    // comprobamos si la cantidad de números es positiva
    while (x <= 0) {
      System.out.println("\n\u001B[31mERROR: La cantidad de números debe ser positiva.\u001B[0m");
      System.out.print("Ingresa la cantidad de números a ingresar: ");
      x = sc.nextInt();
    }

    // solicitamos los números al usuario
    for (i = 1; i <= x; i++) {
      System.out.print("Ingresa el número " + i + ": ");
      numero = sc.nextInt();

      // comprobamos si el número es positivo
      while (numero <= 0) {
        System.out.println("\n\u001B[31mERROR: El número debe ser positivo.\u001B[0m");
        System.out.print("Ingresa el número " + i + ": ");
        numero = sc.nextInt();
      }

      // guardamos el número original
      numeroOriginal = numero;

      // invertimos el número
      while (numero > 0) {
        resto = numero % 10;
        numeroInvertido = numeroInvertido * 10 + resto;
        numero /= 10;
      }

      // comprobamos si el número es capicúa
      if (numeroOriginal == numeroInvertido) {
        System.out.println("El número " + numeroOriginal + " es capicúa.\n");
      } else {
        System.out.println("El número " + numeroOriginal + " no es capicúa.\n");
      }

      // reiniciamos el número invertido
      numeroInvertido = 0;
    }

    // cerramos el objeto Scanner
    sc.close();
  }
}