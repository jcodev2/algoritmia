/*
 * Leer 2 notas N1, N2. Si alguna de ellas es aprobatoria calcular y reportar su
 * producto, sino calcular y reportar su suma.
 */

// importar la clase Scanner
import java.util.Scanner;

public class ejercicio8 {
  public static void main(String[] args) {
    // crear un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declarar variables
    double n1, n2;

    // leer un número entero
    System.out.print("Ingrese la nota 1: ");
    n1 = sc.nextDouble();

    // leer un número entero
    System.out.print("Ingrese la nota 2: ");
    n2 = sc.nextDouble();

    // verificar si son positivos y menores o iguales a 20
    if (n1 > 0 && n2 > 0 && n1 <= 20 && n2 <= 20) {
      if (n1 >= 11 || n2 >= 11) {
        System.out.println("El producto de las notas es: " + n1 + " * " + n2 + " = " + (n1 * n2));
      } else {
        System.out.println("La suma de las notas es: " + n1 + " + " + n2 + " = " + (n1 + n2));
      }
    } else if (n1 < 0 || n2 < 0) {
      System.out.println("Las notas deben ser positivas");
    } else {
      System.out.println("Las notas deben ser mayores a 0 y menores o iguales a 20");
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}