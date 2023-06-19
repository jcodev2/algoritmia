// Leer un numero entero positivo N y reportar factorial del numero.

import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n, factorial;

    do {
      System.out.print("Ingrese un numero entero positivo: ");
      n = sc.nextInt();
    } while (n <= 0);

    factorial = 1;

    for (int i = 2; i <= n; i++) {
      factorial = factorial * i;
    }

    System.out.println(n + "! = " + factorial);
  }
}