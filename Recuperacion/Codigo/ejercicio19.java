// Leer un numero n entero positivo y reportar sus divisores e indicar cuantos son.

import java.util.Scanner;

public class ejercicio19 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numero, cantDiv = 0;

    // Lee un número entero positivo ingresado por el usuario
    do {
      System.out.print("Introduce un número entero positivo: ");
      numero = scanner.nextInt();
    } while (numero <= 0);

    // Encuentra los divisores del número ingresado
    for (int i = 1; i <= numero; i++) {
      if (numero % i == 0) {
        System.out.println(i + " es un divisor de " + numero);
        cantDiv++;
      }
    }

    // Imprime el número de divisores encontrados
    System.out.println("El número de divisores de " + numero + " es: " + cantDiv);

    scanner.close();
  }
}