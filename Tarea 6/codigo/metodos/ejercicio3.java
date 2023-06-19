package metodos;

import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
    int n1, n2, mcd;

    n1 = leerNumero();
    n2 = leerNumero();

    mcd = mcd(n1, n2);

    mostrarResultado("El MCD de " + n1 + " y " + n2 + " es " + mcd + ".");
  }

  public static int leerNumero() {
    Scanner input = new Scanner(System.in);

    int n;

    do {
      System.out.print("Ingrese un número entero positivo: ");
      n = input.nextInt();
    } while (n < 0);

    return n;
  }

  public static int mcd(int n1, int n2) {
    int mcd = 1;

    for (int i = 1; i <= n1 && i <= n2; i++) {
      if (n1 % i == 0 && n2 % i == 0) {
        mcd = i;
      }
    }

    return mcd;
  }

  public static void mostrarResultado(String mensaje) {
    System.out.println(mensaje);
  }
}
