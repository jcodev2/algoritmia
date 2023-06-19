/* Ingrese N números diferentes de cero y reporte cuantos son positivos, cuantos son negativos y el promedio de todos los números. */

// importamos la librería Scanner
import java.util.Scanner;

public class ejercicio8 {
  public static void main(String[] args) {
    // creamos el objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int n, i, positivos = 0, negativos = 0;
    double numero, promedio = 0, suma = 0;

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
      numero = sc.nextDouble();

      // validamos que el número sea diferente de cero
      while (numero == 0) {
        System.out.print("El número debe ser diferente de cero. Ingrese nuevamente: ");
        numero = sc.nextDouble();
      }

      // sumamos el total
      suma += numero;

      // contamos los positivos y negativos
      if (numero > 0) {
        positivos++;
      } else {
        negativos++;
      }
    }

    // calculamos el promedio
    promedio = suma / n;

    // mostramos los resultados
    System.out.println("El total es: " + suma);
    System.out.println("El promedio es: " + promedio);
    System.out.println("Hay " + positivos + " números positivos");
    System.out.println("Hay " + negativos + " números negativos");
  }
}