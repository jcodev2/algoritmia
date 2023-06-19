// Leer un numero N entero positivo e indicar si es perfecto o no.

import java.util.Scanner;

public class ejercicio6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num, sum = 0;

    do {
      System.out.print("Ingrese un número entero positivo: ");
      num = sc.nextInt();
    } while (num <= 0);

    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        sum = sum + i;
      }
    }

    if (sum == num) {
      System.out.println("El número ingresado es perfecto.");
    } else {
      System.out.println("El número ingresado no es perfecto.");
    }
  }
}