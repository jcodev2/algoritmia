/* Escribir un programa que lea el nombre de N alumnos cada uno con su nota y al final reporte la nota promedio. */

// importamos la libreria Scanner
import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {
    // creamos el objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    String nombre;
    int n, i, nota, suma = 0;
    double promedio;

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

      System.out.print("Ingrese la nota del alumno " + nombre + ": ");
      nota = sc.nextInt();

      // validamos que la nota sea positiva y este entre 0 y 20
      while (nota < 0 || nota > 20) {
        System.out.print("La nota debe ser positiva y estar entre 0 y 20. Ingrese nuevamente: ");
        nota = sc.nextInt();
      }

      // sumamos las notas
      suma += nota;
    }

    // calculamos el promedio
    promedio = (double) suma / n;

    // mostramos el resultado
    System.out.println("El promedio de las notas de los " + n + " alumnos es: " + promedio);

    // cerramos el objeto Scanner
    sc.close();
  }
}