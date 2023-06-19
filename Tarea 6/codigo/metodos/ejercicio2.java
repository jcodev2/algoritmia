package metodos;

import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    int n, sumDiv;

    n = leerNumero();

    sumDiv = esNumeroPerfecto(n);

    if (sumDiv == n) {
      mostrarResultado("El número " + n + " es perfecto.");
    } else {
      mostrarResultado("El número " + n + " no es perfecto.");
    }
  }

  public static int leerNumero() {
    Scanner input = new Scanner(System.in);

    int n;

    do {
      System.out.print("Ingrese un número entero positivo: ");
      n = input.nextInt();
    } while (n <= 0);

    input.close();

    return n;
  }

  public static int esNumeroPerfecto(int n) {
    int sumDiv = 0;

    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        sumDiv += i;
      }
    }

    return sumDiv;
  }

  public static void mostrarResultado(String mensaje) {
    System.out.println(mensaje);
  }
}
