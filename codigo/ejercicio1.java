// Leer un número N Entero positivo. Si es par reportar su cuadrado, sino reportar su cubo.

// importar la clase Scanner
import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    // crear un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declarar variables
    int n;

    // leer un número entero
    System.out.print("Ingrese un número entero: ");
    n = sc.nextInt();

    // verificar si positivo
    if (n > 0) {
      // verificar si es par
      if (n % 2 == 0) {
        System.out.println("El cuadrado de " + n + " es " + (n * n));
      } else {
        System.out.println("El cubo de " + n + " es " + (n * n * n));
      }
    } else {
      System.out.println("El número es negativo o cero");
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}