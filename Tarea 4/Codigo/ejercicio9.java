/* Escribir un programa que lea el sexo de N alumnos y reporte la cantidad de hombres y la cantidad de mujeres. */

// importamos la librería Scanner
import java.util.Scanner;

public class ejercicio9 {
  public static void main(String[] args) {
    // creamos el objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int n, i, hombres = 0, mujeres = 0;
    char sexo;

    // ingresamos el valor de N
    System.out.print("Ingrese el número de alumnos: ");
    n = sc.nextInt();

    // validamos que N sea positivo
    while (n <= 0) {
      System.out.print("El valor debe ser positivo. Ingrese nuevamente: ");
      n = sc.nextInt();
    }

    // ingresamos los N sexos
    for (i = 1; i <= n; i++) {
      // ingresamos el sexo
      System.out.print("Ingrese el sexo del alumno " + i + " (M/F): ");
      sexo = sc.next().toUpperCase().charAt(0);

      // validamos que el sexo sea M o F
      while (sexo != 'M' && sexo != 'F') {
        System.out.print("El sexo debe ser M o F. Ingrese nuevamente: ");
        sexo = sc.next().toUpperCase().charAt(0);
      }

      // contamos los hombres y mujeres
      if (sexo == 'M') {
        hombres++;
      } else {
        mujeres++;
      }
    }

    // mostramos los resultados
    System.out.println("Hay " + hombres + " hombres");
    System.out.println("Hay " + mujeres + " mujeres");
  }
}