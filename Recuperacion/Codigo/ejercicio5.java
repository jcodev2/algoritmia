// Leer un numero entero positivo N y reportar la suma de sus digitos.

import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num, sum = 0;

    do {
      System.out.print("Ingrese un número entero positivo: ");
      num = sc.nextInt();
    } while (num <= 0);

    while (num > 0) {
      sum = sum + (num % 10);
      num = num / 10;
    }

    System.out.println("La suma de los dígitos del número ingresado es: " + sum);
  }
}