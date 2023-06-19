/*
 * Leer 2 edades e1 y e2. Si ambas son mayores de edad reportar el producto de
 * las edades.
 * Sino calcular y reportar la suma de las edades.
 */

// importar la clase Scanner
import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args) {
    // crear un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declarar variables
    int e1, e2;

    // leer un número entero
    System.out.print("Ingrese la edad 1: ");
    e1 = sc.nextInt();

    // leer un número entero
    System.out.print("Ingrese la edad 2: ");
    e2 = sc.nextInt();

    // verificar si las edades son válidas
    if (e1 > 0 && e2 > 0 && e1 < 120 && e2 < 120) {
      if (e1 >= 18 && e2 >= 18) {
        System.out.println(e1 + " * " + e2 + " = " + (e1 * e2));
      } else {
        System.out.println(e1 + " + " + e2 + " = " + (e1 + e2));
      }
    } else {
      System.out.println("Las edades no son válidas");
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}