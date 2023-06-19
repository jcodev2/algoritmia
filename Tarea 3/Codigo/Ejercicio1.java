
// importamos la libreria Scanner
import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    // creamos un objeto de tipo Scanner
    Scanner sc = new Scanner(System.in);

    // variables
    double nota1, nota2, nota3, promedio;

    // pedimos los datos al usuario
    System.out.print("Ingrese la nota 1: ");
    nota1 = sc.nextDouble();
    System.out.print("Ingrese la nota 2: ");
    nota2 = sc.nextDouble();
    System.out.print("Ingrese la nota 3: ");
    nota3 = sc.nextDouble();

    // validamos los datos
    if (nota1 >= 0 && nota1 <= 20 && nota2 >= 0 && nota2 <= 20 && nota3 >= 0 && nota3 <= 20) {
      // calculamos el promedio
      promedio = (nota1 + nota2 + nota3) / 3;

      // validamos el promedio
      if (promedio >= 11) {
        System.out.println("El alumno aprobo el curso con un promedio de " + promedio);
      } else {
        System.out.println("El alumno reprobo el curso con un promedio de " + promedio);
      }
    } else {
      System.out.println("Las notas deben estar entre 0 y 20");
    }

    // cerramos el objeto Scanner
    sc.close();
  }
}