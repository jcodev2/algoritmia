// leer un numero entero positivo y reportar cuantos digitos tiene

import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num, count = 0;

    do {
      System.out.print("Ingrese un número entero positivo: ");
      num = sc.nextInt();
    } while (num <= 0);

    while (num > 0) {
      num = num / 10;
      count++;
    }
    System.out.println("El número ingresado tiene " + count + " dígitos.");
  }
}