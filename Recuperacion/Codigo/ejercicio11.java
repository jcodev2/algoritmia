// Leer dos numeros enteros positivos n1, n2 y calcular la potencia n1^n2 por multiplicaciones sucesivas.

import java.util.Scanner;

public class ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n1, n2, potencia = 1;

    do {
      System.out.print("Ingrese un numero entero positivo: ");
      n1 = sc.nextInt();
    } while (n1 <= 0);

    do {
      System.out.print("Ingrese otro numero entero positivo: ");
      n2 = sc.nextInt();
    } while (n2 <= 0);

    sc.close();

    for (int i = 0; i < n2; i++) {
      potencia = potencia * n1;
    }

    System.out.println(n1 + " elevado a la " + n2 + " es igual a " + potencia + ".");
  }
}