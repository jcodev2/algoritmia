// Leer un numero N entero positivo e indicar si es un numero Repunit o no.

import java.util.Scanner;

public class ejercicio16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numero;
    boolean esRepunit = true;

    do {
      System.out.print("Ingrese un numero entero positivo: ");
      numero = sc.nextInt();
    } while (numero <= 0);

    for (int i = 0; i < numero; i++) {
      if (numero % 10 != 1) {
        esRepunit = false;
        break;
      }
      numero = numero / 10;
    }

    if (esRepunit) {
      System.out.println("El número es un número Repunit.");
    } else {
      System.out.println("El número no es un número Repunit.");
    }

    sc.close();
  }
}
