package metodos;

import java.util.Scanner;

public class ejercicio10 {
  public static void main(String[] args) {
    int n;
    boolean esPrimo;

    n = leerNumero();

    esPrimo = esPrimo(n);

    if (esPrimo) {
      mostrarResultado(n + " es un número primo.");
    } else {
      mostrarResultado(n + " no es un número primo.");
    }
  }

  public static int leerNumero() {
    Scanner input = new Scanner(System.in);

    int num;

    do {
      System.out.print("Ingrese un número entero positivo N: ");
      num = input.nextInt();
    } while (num <= 0);

    return num;
  }

  public static boolean esPrimo(int num) {
    boolean esPrimo = true;

    if (num == 1) {
      esPrimo = false;
    } else {
      for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
          esPrimo = false;
          i = num; // Para salir del bucle
        }
      }
    }

    return esPrimo;
  }

  public static void mostrarResultado(String mensaje) {
    System.out.println(mensaje);
  }
}
