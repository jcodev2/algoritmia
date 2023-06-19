/*
 * Leer un número entero N entero positivo. Si N es divisible entre 5
 * calcular N + N, sino calcular N * N.
 */

// importar la clase Scanner
import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {
    // crear un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declarar variables
    int n;

    // leer un número entero
    System.out.print("Ingrese un número entero: ");
    n = sc.nextInt();

    // verificar si es positivo
    if (n > 0) {
      if (n % 5 == 0) {
        System.out.println(n + " + " + n + " = " + (n + n));
      } else {
        System.out.println(n + " * " + n + " = " + (n * n));
      }
    } else if (n < 0) {
      System.out.println("El número es negativo");
    } else {
      System.out.println("El número es cero");
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}