
// importamos la libreria Scanner
import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    // creamos un objeto de tipo Scanner
    Scanner sc = new Scanner(System.in);

    // variables
    double precioLed, precioPlasma, descuentoLed, descuentoPlasma, totalLed, totalPlasma;

    // pedimos los datos al usuario
    System.out.print("Ingrese el precio del televisor Led: ");
    precioLed = sc.nextDouble();

    System.out.print("Ingrese el descuento del televisor Led: ");
    descuentoLed = sc.nextDouble();

    System.out.print("Ingrese el precio del televisor Plasma: ");
    precioPlasma = sc.nextDouble();

    System.out.print("Ingrese el descuento del televisor Plasma: ");
    descuentoPlasma = sc.nextDouble();

    // validamos los datos
    if (precioLed > 0 && precioPlasma > 0 && descuentoLed > 0 && descuentoPlasma > 0 && descuentoLed <= 100
        && descuentoPlasma <= 100) {
      // calculamos el total
      totalLed = precioLed - (precioLed * (descuentoLed / 100));
      totalPlasma = precioPlasma - (precioPlasma * (descuentoPlasma / 100));

      // validamos el total
      if (totalLed < totalPlasma) {
        System.out.println("Debe comprar el televisor Led");
        System.out.println("El total a pagar es de " + totalLed);
      } else {
        System.out.println("Debe comprar el televisor Plasma");
        System.out.println("El total a pagar es de " + totalPlasma);
      }
    } else {
      System.out.println("Los precios y descuentos deben ser mayores a 0");
    }

    // cerramos el objeto Scanner
    sc.close();
  }
}