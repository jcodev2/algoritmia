
// importamos la libreria Scanner
import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    // creamos un objeto de tipo Scanner
    Scanner sc = new Scanner(System.in);

    // variables
    double horas, salario;

    // pedimos los datos al usuario
    System.out.print("Ingrese las horas trabajadas: ");
    horas = sc.nextDouble();

    // validamos los datos
    if (horas > 0) {
      // calculamos el salario
      if (horas <= 40) {
        salario = horas * 16;
      } else {
        salario = (40 * 16) + ((horas - 40) * 20);
      }

      System.out.println("El salario semanal es de " + salario);
    } else {
      System.out.println("Las horas deben ser mayores a 0");
    }

    // cerramos el objeto Scanner
    sc.close();
  }
}