/* 
  Programa que lee edad, nota y sexo de N alumnos y reporta:
  a) Cantidad de mujeres.
  b) Cantidad de Hombres.
  c) Cantidad de Mujeres aprobadas.
  d) Cantidad de Hombres desaprobados.
  e) Edad promedio de Hombres
  f) Edad promedio de mujeres
*/

// importamos la clase Scanner
import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    // creamos un objeto de la clase Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int n, i, edad, nota, cantidadMujeres = 0, cantidadHombres = 0, mujeresAprobadas = 0, hombresDesaprobados = 0,
        edadPromedioHombres = 0, edadPromedioMujeres = 0;
    char sexo;

    // leemos la cantidad de alumnos
    System.out.print("\nIngrese la cantidad de alumnos: ");
    n = sc.nextInt();

    // validamos que la cantidad de alumnos sea mayor a 0
    while (n <= 0) {
      System.out.println("\n\u001B[31mERROR: La cantidad de alumnos debe ser mayor a 0.\u001B[0m");
      System.out.print("Ingrese la cantidad de alumnos: ");

      n = sc.nextInt();
    }

    // iteramos n veces
    for (i = 1; i <= n; i++) {
      // leemos la edad
      System.out.print("\nIngrese la edad del alumno " + i + ": ");
      edad = sc.nextInt();

      // validamos que la edad sea mayor a 0
      while (edad <= 0) {
        System.out.println("\n\u001B[31mERROR: La edad debe ser mayor a 0.\u001B[0m");
        System.out.print("Ingrese la edad del alumno " + i + ": ");

        edad = sc.nextInt();
      }

      // leemos la nota
      System.out.print("Ingrese la nota del alumno " + i + ": ");
      nota = sc.nextInt();

      // validamos que la nota este entre 0 y 20
      while (nota < 0 || nota > 20) {
        System.out.println("\n\u001B[31mERROR: La nota debe estar entre 0 y 20.\u001B[0m");
        System.out.print("Ingrese la nota del alumno " + i + ": ");

        nota = sc.nextInt();
      }

      // leemos el sexo
      System.out.print("Ingrese el sexo del alumno " + i + " (M/F): ");
      sexo = sc.next().toUpperCase().charAt(0);

      // validamos que el sexo sea M o F
      while (sexo != 'M' && sexo != 'F') {
        System.out.println("\n\u001B[31mERROR: El sexo debe ser M o F.\u001B[0m");
        System.out.print("Ingrese el sexo del alumno " + i + " (M/F): ");

        sexo = sc.next().toUpperCase().charAt(0);
      }

      // si el sexo es F, incrementamos la cantidad de mujeres
      if (sexo == 'F') {
        cantidadMujeres++;

        // validamos que la nota sea mayor o igual a 11
        if (nota >= 11) {
          mujeresAprobadas++;
        }

        // incrementamos la edad promedio de mujeres
        edadPromedioMujeres += edad;
      } else {
        // si el sexo es M, incrementamos la cantidad de hombres
        cantidadHombres++;

        // validamos que la nota sea menor a 11
        if (nota < 11) {
          hombresDesaprobados++;
        }

        // incrementamos la edad promedio de hombres
        edadPromedioHombres += edad;
      }
    }

    // calculamos la edad promedio de hombres y mujeres
    edadPromedioHombres /= cantidadHombres;
    edadPromedioMujeres /= cantidadMujeres;

    // mostramos los resultados
    System.out.println("\u001B[36m\nResultados:");
    System.out.println("a) Cantidad de mujeres: " + cantidadMujeres);
    System.out.println("b) Cantidad de hombres: " + cantidadHombres);
    System.out.println("c) Cantidad de mujeres aprobadas: " + mujeresAprobadas);
    System.out.println("d) Cantidad de hombres desaprobados: " + hombresDesaprobados);
    System.out.println("e) Edad promedio de hombres: " + edadPromedioHombres);
    System.out.println("f) Edad promedio de mujeres: " + edadPromedioMujeres);

    // cerramos el Scanner
    sc.close();

  }
}
