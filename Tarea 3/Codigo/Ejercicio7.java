
// importamos la libreria Scanner
import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    // creamos un objeto de tipo Scanner
    Scanner sc = new Scanner(System.in);

    // variables
    double a, b, c;

    // pedimos los datos al usuario
    System.out.print("Ingrese el lado A: ");
    a = sc.nextDouble();

    System.out.print("Ingrese el lado B: ");
    b = sc.nextDouble();

    System.out.print("Ingrese el lado C: ");
    c = sc.nextDouble();

    // validamos los datos
    if (a > 0 && b > 0 && c > 0) {
      // calculamos el tipo de triangulo
      if (a >= b + c) {
        System.out.println("No se forma un triangulo");
      } else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
        System.out.println("Se forma un triangulo rectangulo");
      } else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
        System.out.println("Se forma un triangulo obtusangulo");
      } else {
        System.out.println("Se forma un triangulo acutangulo");
      }
    } else {
      System.out.println("Los lados deben ser mayores a 0");
    }

    // cerramos el objeto Scanner
    sc.close();
  }
}