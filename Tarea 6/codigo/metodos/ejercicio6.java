package metodos;

import java.util.Scanner;

public class ejercicio6 {
  public static void main(String[] args) {
    int n1, n2, pot;

    n1 = leerNumero();
    n2 = leerNumero();

    pot = potencia(n1, n2);

    mostrarResultado(n1 + "^" + n2 + " = " + pot);
  }

  public static int leerNumero() {
    Scanner input = new Scanner(System.in);

    int n;

    do {
      System.out.print("Ingrese un número entero positivo N: ");
      n = input.nextInt();
    } while (n <= 0);

    return n;
  }

  public static int potencia(int n1, int n2) {
    int pot = 1;

    for (int i = 1; i <= n2; i++) {
      pot = pot * n1;
    }

    return pot;
  }

  public static void mostrarResultado(String mensaje) {
    System.out.println(mensaje);
  }
}
