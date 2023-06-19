// Leer 2 numeros enteros positivos n1, n2 y reportar el mcd.

import java.util.Scanner;

public class ejercicio8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n1, n2, mcd = 1;

    do {
      System.out.print("Ingrese un numero entero positivo: ");
      n1 = sc.nextInt();
    } while (n1 <= 0);

    do {
      System.out.print("Ingrese otro numero entero positivo: ");
      n2 = sc.nextInt();
    } while (n2 <= 0);

    sc.close();

    for (int i = 1; i <= n1 && i <= n2; i++) {
      if (n1 % i == 0 && n2 % i == 0) {
        mcd = i;
      }
    }

    System.out.println("El mcd de " + n1 + " y " + n2 + " es " + mcd + ".");
  }
}