/* Escribir un programa que lea N números enteros positivos y al final reporte la cantidad de números pares, la cantidad de números impares, la suma de números pares y la suma de números impares. */

// importamos la librería Scanner
import java.util.Scanner;

public class ejercicio12 {
  public static void main(String[] args) {
    // creamos el objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int n, i, pares = 0, impares = 0, numero;
    double sumaPares = 0, sumaImpares = 0;

    // ingresamos el valor de N
    System.out.print("Ingrese el número de números: ");
    n = sc.nextInt();

    // validamos que N sea positivo
    while (n <= 0) {
      System.out.print("El valor debe ser positivo. Ingrese nuevamente: ");
      n = sc.nextInt();
    }

    // ingresamos los N números
    for (i = 1; i <= n; i++) {
      // ingresamos el número
      System.out.print("Ingrese el número " + i + ": ");
      numero = sc.nextInt();

      // validamos que el número sea positivo
      while (numero <= 0) {
        System.out.print("El número debe ser positivo. Ingrese nuevamente: ");
        numero = sc.nextInt();
      }

      // contamos los pares e impares
      if (numero % 2 == 0) {
        pares++;
        sumaPares += numero;
      } else {
        impares++;
        sumaImpares += numero;
      }
    }

    // mostramos los resultados
    System.out.println("Hay " + pares + " números pares");
    System.out.println("Hay " + impares + " números impares");
    System.out.println("La suma de los números pares es " + sumaPares);
    System.out.println("La suma de los números impares es " + sumaImpares);
  }
}