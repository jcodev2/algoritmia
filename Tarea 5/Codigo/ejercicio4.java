/* 
  Programa que permite leer un número N entero positivo y lo descompone en sus factores primos. El programa se debe repetir X veces.
  Ejemplo: Si X = 4, entonces se repite 4 veces: 6 = 2*3, 20=2*2*5, 15= 3*5, 24=2*2*2*3
*/

// importamos la clase Scanner
import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {
    // creamos un objeto de la clase Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int x, n, i, j;

    // leemos el número de veces que se va a repetir el programa
    System.out.print("Introduce el número de veces que se va a repetir el programa: ");
    x = sc.nextInt();

    // validamos que el número de veces sea mayor que 0
    while (x <= 0) {
      System.out.println("\n\u001B[31mERROR:El número de veces debe ser mayor que 0\u001B[0m");
      System.out.print("Introduce el número de veces que se va a repetir el programa: ");
      x = sc.nextInt();
    }

    // bucle que se repite x veces
    for (i = 0; i < x; i++) {
      // leemos el número
      System.out.print("\nIntroduce un número entero positivo: ");
      n = sc.nextInt();

      // validamos que el número sea mayor que 0
      while (n <= 0) {
        System.out.println("\nEl número debe ser mayor que 0");
        System.out.print("Introduce un número entero positivo: ");
        n = sc.nextInt();
      }

      System.out.print("La factorización en números primos de " + n + " es = ");

      // bucle que se repite mientras n sea divisible entre j
      for (j = 2; j <= n; j++) {
        while (n % j == 0) {
          System.out.print(j);
          n = n / j;
          if (n != 1) {
            System.out.print(" * ");
          }
        }
      }

      // en caso de que el número sea 1
      if (n == 1) {
        System.out.print("1");
      }
      System.out.println();
    }
  }
}
