package metodos;

import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {
    int n1, n2, mcm;

    n1 = leerNumero();
    n2 = leerNumero();

    mcm = mcm(n1, n2);

    mostrarResultado("El MCM es: " + mcm);
  }

  public static int leerNumero() {
    Scanner input = new Scanner(System.in);

    int numero;

    do {
      System.out.print("Introduce un número: ");
      numero = input.nextInt();
    } while (numero <= 0);

    return numero;
  }

  public static int mcm(int n1, int n2) {
    int mcm = 1, divisor = 2;

    while (n1 > 1 || n2 > 1) {
      if (n1 % divisor == 0 || n2 % divisor == 0) {
        mcm = mcm * divisor;

        if (n1 % divisor == 0) {
          n1 = n1 / divisor;
        }
        if (n2 % divisor == 0) {
          n2 = n2 / divisor;
        }
      } else {
        divisor++;
      }
    }

    return mcm;
  }

  public static void mostrarResultado(String mensaje) {
    System.out.println(mensaje);
  }
}