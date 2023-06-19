/* Escribir un programa que ingrese las notas de N alumnos y reporte la cantidad de aprobados, la cantidad de desaprobados y la nota promedio. */

// importamos la librería Scanner
import java.util.Scanner;

public class ejercicio11 {
  public static void main(String[] args) {
    // creamos el objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int n, i, aprobados = 0, desaprobados = 0, nota;
    double promedio, suma = 0;

    // ingresamos el valor de N
    System.out.print("Ingrese el número de alumnos: ");
    n = sc.nextInt();

    // validamos que N sea positivo
    while (n <= 0) {
      System.out.print("El valor debe ser positivo. Ingrese nuevamente: ");
      n = sc.nextInt();
    }

    // ingresamos las N notas
    for (i = 1; i <= n; i++) {
      // ingresamos la nota
      System.out.print("Ingrese la nota del alumno " + i + ": ");
      nota = sc.nextInt();

      // validamos que la nota sea positiva y menor a 20
      while (nota <= 0 || nota > 20) {
        System.out.print("La nota debe ser positiva y menor a 20. Ingrese nuevamente: ");
        nota = sc.nextInt();
      }

      // contamos los aprobados y desaprobados
      if (nota >= 11) {
        aprobados++;
      } else {
        desaprobados++;
      }

      // sumamos las notas
      suma += nota;
    }

    // calculamos el promedio
    promedio = suma / n;

    // mostramos los resultados
    System.out.println("Hay " + aprobados + " aprobados");
    System.out.println("Hay " + desaprobados + " desaprobados");
    System.out.println("El promedio de las notas es " + promedio);
  }
}