/*
 * Leer 2 números enteros. Si ambos son positivos calcular su suma. Si ambos son
 * negativos calcular su producto. Sino escribir: “Error”.
 */

// importar la clase Scanner
import java.util.Scanner;

public class ejercicio6 {
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

    // verificar si los números son válidos
    if (n1 > 0 && n2 > 0) {
      System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
    } else if (n1 < 0 && n2 < 0) {
      System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
    } else {
      System.out.println("Error");
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}