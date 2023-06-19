// Leer dos numeros enteros positivos n1, n2 y calcular el producto por sumas sucesivas.

import java.util.Scanner;

public class ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n1, n2, producto = 0;

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
      producto = producto + n1;
    }

    System.out.println("El producto de " + n1 + " y " + n2 + " es " + producto + ".");
  }
}