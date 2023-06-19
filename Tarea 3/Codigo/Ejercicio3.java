
// importamos la libreria Scanner
import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    // creamos un objeto de tipo Scanner
    Scanner sc = new Scanner(System.in);

    // variables
    double precio, total;
    int cantidad;

    // pedimos los datos al usuario
    System.out.print("Ingrese el precio de la camisa: ");
    precio = sc.nextDouble();

    System.out.print("Ingrese la cantidad de camisas: ");
    cantidad = sc.nextInt();

    // validamos los datos
    if (precio > 0 && cantidad > 0) {
      // calculamos el total
      total = precio * cantidad;

      // validamos el total
      if (cantidad >= 8) {
        total = total - (total * 0.2);
      } else {
        total = total - (total * 0.1);
      }

      System.out.println("El total a pagar es de " + total);
    } else {
      System.out.println("El precio y la cantidad deben ser mayores a 0");
    }

    // cerramos el objeto Scanner
    sc.close();
  }
}