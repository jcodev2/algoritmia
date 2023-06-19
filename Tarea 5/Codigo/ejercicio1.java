/*
 * Programa que lee nota y sexo (M, F) de N alumnos y reporta:
 * a) Cantidad de hombres aprobados
 * b) Cantidad de mujeres desaprobadas
 * c) Nota promedio de hombres
 * d) Nota promedio de mujeres
 * e) Nota promedio total.
 */

// importamos la clase Scanner
import java.util.Scanner;

public class ejercicio1 {

  public static void main(String[] args) {
    // creamos un objeto de la clase Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int n, i, hombresAprobados = 0, mujeresDesaprobadas = 0, totalNotasHombres = 0, totalNotasMujeres = 0,
        totalNotas = 0, cantidadHombres = 0, cantidadMujeres = 0;
    double promedioHombres, promedioMujeres, promedioTotal;
    char sexo;

    // leemos la cantidad de alumnos
    System.out.print("Ingrese la cantidad de alumnos: ");
    n = sc.nextInt();

    // validamos que la cantidad de alumnos sea mayor a 0
    while (n <= 0) {
      System.out.println("\n\u001B[31mERROR: La cantidad de alumnos debe ser mayor a 0. Inténtelo de nuevo.\u001B[0m");
      System.out.print("Ingrese la cantidad de alumnos: ");
      n = sc.nextInt();
    }

    // iteramos n veces
    for (i = 0; i < n; i++) {
      // leemos la nota y el sexo del alumno
      System.out.printf("Ingrese el sexo del alumno %d (M o F): ", i + 1);
      sexo = sc.next().toUpperCase().charAt(0);

      // validamos que el sexo sea M o F
      while (sexo != 'M' && sexo != 'F') {
        System.out.println("\n\u001B[31mERROR: El sexo ingresado no es válido. Inténtelo de nuevo.\u001B[0m");
        System.out.printf("Ingrese el sexo del alumno %d (M o F): ", i + 1);
        sexo = sc.next().toUpperCase().charAt(0);
      }

      System.out.printf("Ingrese la nota del alumno %d: ", i + 1);
      int nota = sc.nextInt();

      // validamos que la nota sea mayor o igual a 0 y menor o igual a 20
      while (nota < 0 || nota > 20) {
        System.out.println("\n\u001B[31mERROR: La nota ingresada no es válida. Inténtelo de nuevo.\u001B[0m");
        System.out.printf("Ingrese la nota del alumno %d: ", i + 1);
        nota = sc.nextInt();
      }

      // verificamos si el alumno es hombre o mujer y si aprobó o desaprobó
      if (sexo == 'M') {
        cantidadHombres++;
        totalNotasHombres += nota;

        // si la nota es mayor o igual a 11, el alumno aprobó
        if (nota >= 11) {
          hombresAprobados++;
        }
      } else {
        cantidadMujeres++;
        totalNotasMujeres += nota;

        // si la nota es menor a 12, la alumna desaprobó
        if (nota < 11) {
          mujeresDesaprobadas++;
        }
      }
      totalNotas += nota;
    }

    // calculamos los promedios
    promedioHombres = (double) totalNotasHombres / cantidadHombres;
    promedioMujeres = (double) totalNotasMujeres / cantidadMujeres;
    promedioTotal = (double) totalNotas / n;

    // mostramos los resultados
    System.out.println("\u001B[36m\nResultados:");
    System.out.printf("a) Cantidad de hombres aprobados: %d%n", hombresAprobados);
    System.out.printf("b) Cantidad de mujeres desaprobadas: %d%n", mujeresDesaprobadas);
    System.out.printf("c) Nota promedio de hombres: %.2f%n", promedioHombres);
    System.out.printf("d) Nota promedio de mujeres: %.2f%n", promedioMujeres);
    System.out.printf("e) Nota promedio total: %.2f%n", promedioTotal);

    // cerramos el objeto Scanner
    sc.close();
  }
}