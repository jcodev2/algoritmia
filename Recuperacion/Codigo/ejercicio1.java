// Leer un numero N entero positivo e indicar si es primo o no.

import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num, i, cont;

    do {
      System.out.print("Ingrese un numero entero positivo: ");
      num = sc.nextInt();
    } while (num <= 0);

    cont = 0;

    for (i = 1; i <= num; i++) { // contador; condicion; incremento
      if (num % i == 0) {
        cont++;
      }
    }

    if (cont == 2) {
      System.out.println("El numero " + num + " es primo.");
    } else {
      System.out.println("El numero " + num + " no es primo.");
    }

  }
}