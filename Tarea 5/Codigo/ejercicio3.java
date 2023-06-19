/* Leer 2 números enteros positivos N1, N2, y hallar reportar su MCD. El programa se debe repetir N veces. */

// importamos la clase Scanner
import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
    // creamos un objeto de la clase Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int n, i, j, n1, n2, mcd = 0;

    // solicitamos los datos al usuario
    System.out.print("\nIngrese la cantidad de veces que se repetirá el programa: ");
    n = sc.nextInt();

    // validamos que el número ingresado sea positivo
    while (n <= 0) {
      System.out.println("\n\u001B[31mERROR: El número ingresado debe ser positivo.\u001B[0m");
      System.out.print("Ingrese un número positivo: ");
      n = sc.nextInt();
    }

    // realizamos el cálculo y mostramos el resultado
    for (i = 1; i <= n; i++) {
      // solicitamos los datos al usuario
      System.out.print("Ingrese el primer número entero positivo: ");
      n1 = sc.nextInt();

      // validamos que el número ingresado sea positivo
      while (n1 <= 0) {
        System.out.println("ERROR: El número ingresado debe ser positivo.");
        System.out.print("Ingrese un número positivo: ");
        n1 = sc.nextInt();
      }

      // solicitamos los datos al usuario
      System.out.print("Ingrese el segundo número entero positivo: ");
      n2 = sc.nextInt();

      // validamos que el número ingresado sea positivo
      while (n2 <= 0) {
        System.out.println("ERROR: El número ingresado debe ser positivo.");
        System.out.print("Ingrese un número positivo: ");
        n2 = sc.nextInt();
      }

      // realizamos el cálculo
      for (j = 1; j <= n1 && j <= n2; j++) {
        if (n1 % j == 0 && n2 % j == 0) {
          mcd = j;
        }
      }

      // mostramos el resultado
      System.out.println("\u001B[36m\nResultado:");
      System.out.println("El MCD de " + n1 + " y " + n2 + " es " + mcd);
      System.out.println("\u001B[0m");
    }

    // cerramos el objeto Scanner
    sc.close();
  }
}
