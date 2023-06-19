/* Escribir un programa que ingrese la edad y la nota de N alumnos y reporte la suma de las edades y la suma de las notas. */

// importamos la libreria Scanner
import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args) {
    // creamos el objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int n, i, edad, nota, sumaEdades = 0, sumaNotas = 0;

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
      System.out.print("Ingrese la edad del alumno " + i + ": ");
      edad = sc.nextInt();

      // validamos que la edad sea positiva y menor a 120
      while (edad <= 0 || edad > 120) {
        System.out.print("La edad debe ser positiva y menor a 120. Ingrese nuevamente: ");
        edad = sc.nextInt();
      }

      // ingresamos la nota del alumno
      System.out.print("Ingrese la nota del alumno " + i + ": ");
      nota = sc.nextInt();

      // validamos que la nota sea positiva y menor a 20
      while (nota < 0 || nota > 20) {
        System.out.print("La nota debe ser positiva y menor a 20. Ingrese nuevamente: ");
        nota = sc.nextInt();
      }

      // sumamos las edades y las notas
      sumaEdades += edad;
      sumaNotas += nota;
    }

    // mostramos los resultados
    System.out.println("La suma de las edades de los " + n + " alumnos es: " + sumaEdades);
    System.out.println("La suma de las notas de los " + n + " alumnos es: " + sumaNotas);

    // cerramos el objeto Scanner
    sc.close();
  }
}