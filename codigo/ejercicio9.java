/*
 * Diseñe un algoritmo que permita leer los 3 lados de un triángulo L1,L2 y L3,
 * y que, determine el tipo de triangulo que se tiene (Escaleno=Tres lados
 * diferentes, Isósceles = dos lados iguales, equilátero = Tres lados iguales).
 */

// importar la clase Scanner
import java.util.Scanner;

public class ejercicio9 {
  public static void main(String[] args) {
    // crear un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declarar variables
    double l1, l2, l3;

    // leer los datos
    System.out.print("Ingrese el lado 1: ");
    l1 = sc.nextDouble();
    System.out.print("Ingrese el lado 2: ");
    l2 = sc.nextDouble();
    System.out.print("Ingrese el lado 3: ");
    l3 = sc.nextDouble();

    // determinar si los datos ingresados son válidos
    if (l1 <= 0 || l2 <= 0 || l3 <= 0) {
      System.out.println("Los datos ingresados no son válidos");
    } else {
      // determinar el tipo de triángulo
      if (l1 == l2 && l2 == l3) {
        System.out.println("El triángulo es equilátero");
      } else if (l1 == l2 || l2 == l3 || l1 == l3) {
        System.out.println("El triángulo es isósceles");
      } else {
        System.out.println("El triángulo es escaleno");
      }
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}