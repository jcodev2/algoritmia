// Leer un numero n entero positivo e indicar si es un numero malvado o no.

import java.util.Scanner;

public class ejercicio17 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numero = 0, cont = 0, temp;
    boolean esMalvado;

    do {
      System.out.print("Introduce un número entero positivo: ");
      numero = scanner.nextInt();
    } while (numero < 0);

    temp = numero;

    while (temp != 0) {
      if (temp % 2 == 1) {
        cont++;
      }
      temp = temp / 2;
    }

    if (cont % 2 == 0) {
      esMalvado = true;
    } else {
      esMalvado = false;
    }

    if (esMalvado) {
      System.out.println("El número es un número malvado.");
    } else {
      System.out.println("El número no es un número malvado.");
    }

    scanner.close();
  }
}
