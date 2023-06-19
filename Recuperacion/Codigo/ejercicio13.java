// Leer un numero entero positivo y descomponerlo en sus factores primos.

import java.util.Scanner;

public class ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num;

    do {
      System.out.print("Ingrese un numero entero positivo: ");
      num = sc.nextInt();
    } while (num <= 0);

    System.out.print("Factores primos de " + num + ": ");

    sc.close();

    if (num == 1) {
      System.out.print("1");
    } else {
      for (int i = 2; i <= num; i++) {
        while (num % i == 0) {
          System.out.print(i);
          num = num / i;

          if (num != 1) {
            System.out.print(" * ");
          }
        }
      }
    }
  }
}