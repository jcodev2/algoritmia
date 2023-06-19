// Leer un numero N entero positivo e indicar si es abundante o no.

import java.util.Scanner;

public class ejercicio7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n, sum = 0;

    do {
      System.out.print("Ingrese un numero entero positivo: ");
      n = sc.nextInt();
    } while (n <= 0);

    sc.close();

    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }

    if (sum > n) {
      System.out.println(n + " es un numero abundante.");
    } else {
      System.out.println(n + " no es un numero abundante.");
    }
  }
}