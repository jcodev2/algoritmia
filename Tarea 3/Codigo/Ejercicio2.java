
// importamos la libreria Scanner
import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    // creamos un objeto de tipo Scanner
    Scanner sc = new Scanner(System.in);

    // variables
    double compra, descuento, total;

    // pedimos los datos al usuario
    System.out.print("Ingrese el monto de la compra: ");
    compra = sc.nextDouble();

    // validamos los datos
    if (compra > 0) {
      // calculamos el descuento
      descuento = compra * 0.3;

      // calculamos el total
      total = compra - descuento;

      // validamos el total
      if (total > 1000) {
        System.out.println("El total a pagar es de " + total);
      } else {
        System.out.println("El total a pagar es de " + compra);
      }
    } else {
      System.out.println("El monto de la compra debe ser mayor a 0");
    }

    // cerramos el objeto Scanner
    sc.close();
  }
}