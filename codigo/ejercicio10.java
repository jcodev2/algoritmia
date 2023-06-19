/*
 * Leer 2 notas de un alumno N1, N2 y obtener su promedio, Si el alumno obtiene
 * un promedio es ≥ 11, entonces escribir “Aprobado”, sino escribir
 * “Desaprobado”.
 */

// importar la clase Scanner
import java.util.Scanner;

public class ejercicio10 {
  public static void main(String[] args) {
    // crear un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declarar variables
    double n1, n2, promedio;

    // leer los datos
    System.out.print("Ingrese la nota 1: ");
    n1 = sc.nextDouble();
    System.out.print("Ingrese la nota 2: ");
    n2 = sc.nextDouble();

    // determinar si los datos ingresados son válidos
    if (n1 < 0 || n1 > 20 || n2 < 0 || n2 > 20) {
      System.out.println("Los datos ingresados no son válidos");
    } else {
      // calcular el promedio
      promedio = (n1 + n2) / 2;

      // determinar si el alumno está aprobado o no
      if (promedio >= 11) {
        System.out.println("El alumno está aprobado");
      } else {
        System.out.println("El alumno está desaprobado");
      }
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}