/*
 * Leer un N° diferente de cero. Si N es positivo calcular 2 * N
 * sino calcular 5 * N.
 */

// importar la clase Scanner
import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
    // crear un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declarar variables
    int n;

    // leer un número entero
    System.out.print("Ingrese un número entero: ");
    n = sc.nextInt();

    // verificar si es positivo
    if (n != 0) {
      if (n > 0) {
        System.out.println("2 * " + n + " = " + (2 * n));
      } else {
        System.out.println("5 * " + n + " = " + (5 * n));
      }
    } else {
      System.out.println("El número es cero");
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}