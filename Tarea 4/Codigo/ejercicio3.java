/* Escribir un programa que lea el nombre de N alumnos con su respectiva edad y al final reporte la suma de las edades. */

// importamos la libreria Scanner
import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
    // creamos el objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    String nombre;
    int n, i, edad, suma = 0;

    // ingresamos el valor de N
    System.out.print("Ingrese el número de alumnos: ");
    n = sc.nextInt();

    // validamos que N sea positivo
    while (n <= 0) {
      System.out.print("El valor debe ser positivo. Ingrese nuevamente: ");
      n = sc.nextInt();
    }

    // ingresamos los N números
    for (i = 1; i <= n; i++) {
      System.out.print("Ingrese el nombre del alumno " + i + ": ");
      nombre = sc.next();

      System.out.print("Ingrese la edad del alumno " + nombre + ": ");
      edad = sc.nextInt();

      // validamos que la edad sea positiva
      while (edad <= 0) {
        System.out.print("La edad debe ser positiva. Ingrese nuevamente: ");
        edad = sc.nextInt();
      }

      // sumamos las edades
      suma += edad;
    }

    // mostramos el resultado
    System.out.println("La suma de las edades de los " + n + " alumnos es: " + suma);

    // cerramos el objeto Scanner
    sc.close();
  }
}