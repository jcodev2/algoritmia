/* Leer un número N entero positivo. Si N es primo, calcular su factorial, en caso contrario descomponerlo en sus factores primos. */

// importamos la clase Scanner
import java.util.Scanner;

public class ejercicio6 {

  public static void main(String[] args) {
    // creamos un objeto de la clase Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int n, i, factorial = 1, factor = 2;
    boolean esPrimo = true;

    System.out.print("Ingrese un número entero positivo: ");
    n = sc.nextInt();

    while (n <= 0) {
      System.out.println("\n\u001B[31mERROR: El número ingresado debe ser positivo.\u001B[0m");
      System.out.print("Ingrese un número entero positivo: ");
      n = sc.nextInt();
    }

    for (i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        esPrimo = false;
        break;
      }
    }

    if (esPrimo) {
      System.out.println("\u001B[36m\nResultado:");
      System.out.println(n + " es primo");
      System.out.print(n + "! = ");

      for (i = 1; i <= n; i++) {
        factorial *= i;
      }

      System.out.println(factorial);
    } else {
      System.out.println("\u001B[36m\nResultado:");
      System.out.println(n + " no es primo");
      System.out.print(n + " = ");

      while (n > 1) {
        if (n % factor == 0) {
          System.out.print(factor);
          n /= factor;
          if (n != 1) {
            System.out.print(" x ");
          }
        } else {
          factor++;
        }
      }
    }

    // cerramos el Scanner
    sc.close();
  }
}
