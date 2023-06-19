/* Escribir un programa que lea Nombre, cantidad y precio de N productos y reporte cuanto se debe pagar en total. */

// importamos la libreria Scanner
import java.util.Scanner;

public class ejercicio6 {
  public static void main(String[] args) {
    // creamos el objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    String nombre;
    int n, i, cantidad;
    double precio, total = 0;

    // ingresamos el valor de N
    System.out.print("Ingrese el número de productos: ");
    n = sc.nextInt();

    // validamos que N sea positivo
    while (n <= 0) {
      System.out.print("El valor debe ser positivo. Ingrese nuevamente: ");
      n = sc.nextInt();
    }

    // ingresamos los N productos
    for (i = 1; i <= n; i++) {
      // ingresamos el nombre del producto
      System.out.print("Ingrese el nombre del producto " + i + ": ");
      nombre = sc.next();

      // ingresamos la cantidad del producto
      System.out.print("Ingrese la cantidad del producto " + nombre + ": ");
      cantidad = sc.nextInt();

      // validamos que la cantidad sea positiva
      while (cantidad <= 0) {
        System.out.print("La cantidad debe ser positiva. Ingrese nuevamente: ");
        cantidad = sc.nextInt();
      }

      // ingresamos el precio del producto
      System.out.print("Ingrese el precio del producto " + nombre + ": ");
      precio = sc.nextDouble();

      // validamos que el precio sea positivo
      while (precio <= 0) {
        System.out.print("El precio debe ser positivo. Ingrese nuevamente: ");
        precio = sc.nextDouble();
      }

      // sumamos el total
      total += cantidad * precio;
    }

    // mostramos el total
    System.out.println("El total a pagar por los " + n + " productos es: " + total);

    // cerramos el objeto Scanner
    sc.close();
  }
}