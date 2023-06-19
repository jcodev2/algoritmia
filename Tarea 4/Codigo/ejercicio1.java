/* Ingrese N números positivos y calcule su promedio. */

// importamos la libreria Scanner
import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    // creamos el objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int n, i, suma = 0, numero;
    double promedio;

    // ingresamos el valor de N
    System.out.print("Ingrese el número de números a promediar: ");
    n = sc.nextInt();

    // validamos que N sea positivo
    while (n <= 0) {
      System.out.print("El valor debe ser positivo. Ingrese nuevamente: ");
      n = sc.nextInt();
    }

    // ingresamos los N números
    for (i = 1; i <= n; i++) {
      System.out.print("Ingrese el número " + i + ": ");

      // validamos que el número sea positivo
      do {
        numero = sc.nextInt();

        if (numero < 0) {
          System.out.print("El número debe ser positivo. Ingrese nuevamente: ");
        }
      } while (numero < 0);

      // sumamos el número ingresado
      suma += numero;
    }

    // calculamos el promedio
    promedio = (double) suma / n;

    // mostramos el resultado
    System.out.println("El promedio de los " + n + " números ingresados es: " + promedio);

    // cerramos el objeto Scanner
    sc.close();
  }
}