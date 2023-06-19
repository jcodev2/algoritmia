/*
 * Un restaurante ofrece sus ofertas de acuerdo a la siguiente escala de
 * consumo. En todos los casos se aplica un impuesto del 18%. Determinar el
 * importe a pagar por lo consumido, mostrando cuanto es el descuento en cada
 * caso.
  Consumo	  Descuento
  250 a más	20%
  120 a 249	15%
  30 a 119	10%
  Hasta 30	5%
 */

// Importamos la clase Scanner
import java.util.Scanner;

public class ejercicio11 {
  public static void main(String[] args) {
    // Creamos un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // Declaramos las variables
    double consumo, descuento, impuesto, importe;

    // Leemos los datos
    System.out.print("Ingrese el consumo: ");
    consumo = sc.nextDouble();

    // validamos los datos
    if (consumo < 0) {
      System.out.println("El consumo no puede ser negativo");
      sc.close();
      return;
    } else if (consumo == 0) {
      System.out.println("El consumo no puede ser cero");
      sc.close();
      return;
    }

    // Determinamos el descuento
    if (consumo >= 250) {
      descuento = consumo * 0.20;
    } else if (consumo >= 120) {
      descuento = consumo * 0.15;
    } else if (consumo >= 30) {
      descuento = consumo * 0.10;
    } else {
      descuento = consumo * 0.05;
    }

    // Calculamos el impuesto
    impuesto = consumo * 0.18;

    // Calculamos el importe a pagar
    importe = consumo + impuesto - descuento;

    // Mostramos el resultado
    System.out.println("El impuesto es: " + impuesto);
    System.out.println("El descuento es: " + descuento + " (" + (descuento / consumo) * 100 + "%)");
    System.out.println("El importe a pagar es: " + importe);

    // Cerramos el objeto Scanner
    sc.close();
  }
}
