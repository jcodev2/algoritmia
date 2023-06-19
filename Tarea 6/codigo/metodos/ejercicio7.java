package metodos;

import java.util.Scanner;

public class ejercicio7 {
  public static void main(String[] args) {
    int num, numInv;

    num = leerNumero();

    numInv = capicua(num);

    if (num == numInv) {
      mostrarResultado("El número " + num + " es capicúa.");
    } else {
      mostrarResultado("El número " + num + " no es capicúa.");
    }
  }

  public static int leerNumero() {
    Scanner input = new Scanner(System.in);

    int num;

    do {
      System.out.print("Ingrese un número entero positivo N: ");
      num = input.nextInt();
    } while (num <= 0);

    return num;
  }

  public static int capicua(int num) {
    int res, numInv = 0;

    while (num > 0) {
      res = num % 10;
      numInv = numInv * 10 + res;
      num = num / 10;
    }

    return numInv;
  }

  public static void mostrarResultado(String mensaje) {
    System.out.println(mensaje);
  }
}
