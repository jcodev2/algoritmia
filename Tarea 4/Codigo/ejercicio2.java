/* Programa que ingrese el precio de N productos y reporte la suma de los precios. */

// importamos la libreria Scanner
import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    // creamos el objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int n, i;
    double suma = 0, precio;

    // ingresamos el valor de N
    System.out.print("Ingrese el número de productos: ");
    n = sc.nextInt();

    // validamos que N sea positivo
    while (n <= 0) {
      System.out.print("El valor debe ser positivo. Ingrese nuevamente: ");
      n = sc.nextInt();
    }

    // ingresamos los N precios
    for (i = 1; i <= n; i++) {
      System.out.print("Ingrese el precio del producto " + i + ": ");
      precio = sc.nextDouble();

      // validamos que el precio sea positivo
      while (precio < 0) {
        System.out.print("El precio debe ser positivo. Ingrese nuevamente: ");
        precio = sc.nextDouble();
      }

      // sumamos el precio ingresado
      suma += precio;
    }

    // mostramos el resultado
    System.out.println("La suma de los precios de los " + n + " productos es: " + suma);

    // cerramos el objeto Scanner
    sc.close();
  }
}
