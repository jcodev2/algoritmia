// Leer 2 numeros enteros positivos n1, n2 y reportar el mcm.

import java.util.Scanner;

public class ejercicio9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n1, n2, d = 2, mcm = 1;

    do {
      System.out.print("Ingrese un numero entero positivo: ");
      n1 = sc.nextInt();
    } while (n1 <= 0);

    do {
      System.out.print("Ingrese otro numero entero positivo: ");
      n2 = sc.nextInt();
    } while (n2 <= 0);

    sc.close();

    while (n1 > 1 || n2 > 1) {
      if (n1 % d == 0 || n2 % d == 0) {
        mcm = mcm * d; // obtengo el mcm

        if (n1 % d == 0) {
          n1 = n1 / d;
        }
        if (n2 % d == 0) {
          n2 = n2 / d;
        }
      } else {
        d++;
      }
    }

    System.out.println("El mcm es " + mcm + ".");
  }
}