/* Leer 2 N° enteros positivos N1 y N2 e indicar si N1 es divisible entre N2. */

// importar la clase Scanner
import java.util.Scanner;

public class ejercicio7 {
  public static void main(String[] args) {
    // crear un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declarar variables
    int n1, n2;

    // leer un número entero
    System.out.print("Ingrese el número 1: ");
    n1 = sc.nextInt();

    // leer un número entero
    System.out.print("Ingrese el número 2: ");
    n2 = sc.nextInt();

    // verificar si son positivos
    if (n1 > 0 && n2 > 0) {
      if (n1 % n2 == 0) {
        System.out.println(n1 + " es divisible entre " + n2);
      } else {
        System.out.println(n1 + " no es divisible entre " + n2);
      }
    } else if (n1 < 0 || n2 < 0) {
      System.out.println("Los números deben ser positivos");
    } else {
      System.out.println("Los números son cero");
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}