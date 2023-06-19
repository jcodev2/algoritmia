
// importamos la libreria Scanner
import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    // creamos un objeto de tipo Scanner
    Scanner sc = new Scanner(System.in);

    // variables
    double cantidad, total;

    // pedimos los datos al usuario
    System.out.print("Ingrese la cantidad de cuadernos: ");
    cantidad = sc.nextDouble();

    // validamos los datos
    if (cantidad > 0) {
      // calculamos el total
      if (cantidad >= 10) {
        total = cantidad * 6;
      } else {
        total = cantidad * 9;
      }

      System.out.println("El total a pagar es de " + total);
    } else {
      System.out.println("La cantidad debe ser mayor a 0");
    }

    // cerramos el objeto Scanner
    sc.close();
  }
}