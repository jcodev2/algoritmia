// 7. Ingrese el peso (P) de una persona, expresado en Kg y su talla ( T )
// expresada en cm. Calcule el índice de masa corporal que se halla dividiendo
// el peso expresado en kg, entre la talla en cm elevada al cuadrado.

import java.util.Scanner;

public class IMC {
  public static void main(String[] args) {
    // Creamos un objeto de la clase Scanner
    Scanner sc = new Scanner(System.in);
    double peso, talla, imc, tallaEnMetros;

    // Solicitamos el peso al usuario
    System.out.print("Ingrese el peso en Kg: ");
    peso = sc.nextDouble();

    // Solicitamos la talla al usuario
    System.out.print("Ingrese la talla en cm: ");
    talla = sc.nextDouble();

    // Convertimos la talla de centímetros a metros
    tallaEnMetros = talla / 100;
    // Calculamos el índice de masa corporal
    imc = peso / (tallaEnMetros * tallaEnMetros);

    // Mostramos el resultado al usuario
    System.out.println("El índice de masa corporal es: " + imc);

    // Cerramos el objeto Scanner
    sc.close();
  }
}
