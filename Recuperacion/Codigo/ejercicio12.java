// Leer un numero N entero positivo e indicar si es capicua o no.

import java.util.Scanner;

public class ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num, res, numCopia, nInvertido = 0;

    do {
      System.out.print("Ingrese un numero entero positivo: ");
      num = sc.nextInt();
    } while (num <= 0);

    sc.close();

    numCopia = num;

    while (num > 0) {
      res = num % 10;
      nInvertido = nInvertido * 10 + res;
      num = num / 10;
    }

    if (numCopia == nInvertido) {
      System.out.println("El numero " + numCopia + " es capicua.");
    } else {
      System.out.println("El numero " + numCopia + " no es capicua.");
    }
  }
}
