// Leer 2 numeros enteros positivos n1, n2 e indicar si son numeros amigos o no.

import java.util.Scanner;

public class ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n1, n2, sum1 = 0, sum2 = 0;

    do {
      System.out.print("Ingrese un numero entero positivo: ");
      n1 = sc.nextInt();
    } while (n1 <= 0);

    do {
      System.out.print("Ingrese otro numero entero positivo: ");
      n2 = sc.nextInt();
    } while (n2 <= 0);

    sc.close();

    for (int i = 1; i < n1; i++) {
      if (n1 % i == 0) {
        sum1 += i;
      }
    }

    for (int i = 1; i < n2; i++) {
      if (n2 % i == 0) {
        sum2 += i;
      }
    }

    if (sum1 == n2 && sum2 == n1) {
      System.out.println(n1 + " y " + n2 + " son números amigos.");
    } else {
      System.out.println(n1 + " y " + n2 + " no son números amigos.");
    }
  }
}