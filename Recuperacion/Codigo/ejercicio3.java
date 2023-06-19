// leer un numero N entero positivo y escribirlo al reves

import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num, res, coc;

    do {
      System.out.print("Ingrese un numero entero positivo: ");
      num = sc.nextInt();
    } while (num <= 0);

    res = 0;

    while (num != 0) {
      res = num % 10;

      System.out.print(res);

      coc = num / 10;

      num = coc;
    }

  }
}