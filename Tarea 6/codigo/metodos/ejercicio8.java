package metodos;

import java.util.Scanner;

public class ejercicio8 {
  public static void main(String[] args) {
    int n, sum;

    n = leerNumero();

    sum = sumaDivisores(n);

    if (sum < n) {
      mostrarResultado(n + " es un número deficiente.");
    } else {
      mostrarResultado(n + " no es un número deficiente.");
    }
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

  public static int sumaDivisores(int n) {
    int sum = 0;

    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }

    return sum;
  }

  public static void mostrarResultado(String mensaje) {
    System.out.println(mensaje);
  }
}