/*
 * Una agencia de autos necesita un sistema que le permita calcular el pago
 * mensual para un
 * vendedor de autos, basándose en lo siguiente: El pago base es de S/.1000, más
 * una comisión de S/.150 por cada auto vendido y un bono adicional de S/.400 si vendió más de
 * 10 autos.
 * El impuesto a pagar es el 5 % del pago total. Ingresar el nombre del vendedor
 * y el n° de autos
 * vendidos en el mes. Reportar nombre del vendedor, sueldo bruto, impuesto y
 * sueldo neto.
 */

// importamos la libreria Scanner
import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    // creamos un objeto de tipo Scanner
    Scanner sc = new Scanner(System.in);

    // variables
    String nombre;
    int autos;
    double sueldo, comision, bono, impuesto, total, neto;

    // pedimos los datos al usuario
    System.out.print("Ingrese el nombre del vendedor: ");
    nombre = sc.nextLine();

    System.out.print("Ingrese el numero de autos vendidos: ");
    autos = sc.nextInt();

    // validamos los datos
    if (autos > 0 && nombre.length() > 0) {
      // calculamos el sueldo
      sueldo = 1000;
      comision = autos * 150;

      if (autos > 10) {
        bono = 400;
      } else {
        bono = 0;
      }

      total = sueldo + comision + bono;
      impuesto = total * 0.05;
      neto = total - impuesto;

      System.out.println("Nombre: " + nombre);
      System.out.println("Sueldo bruto: " + total);
      System.out.println("Impuesto: " + impuesto);
      System.out.println("Sueldo neto: " + neto);
    } else {
      System.out.println("El numero de autos y el nombre deben ser datos validos");
    }

    // cerramos el objeto Scanner
    sc.close();
  }
}