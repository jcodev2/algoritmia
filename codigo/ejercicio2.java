// Leer un numero entero N. Si es positivo, calcular su cuadrado y su cubo. Sino escribir un mensaje: “El número es negativo o cero”.

// importar la clase Scanner
import java.util.Scanner;

public class ejercicio2 {
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
      System.out.println("El cuadrado de " + n + " es " + (n * n));
      System.out.println("El cubo de " + n + " es " + (n * n * n));
    } else {
      System.out.println("El número es negativo o cero");
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}