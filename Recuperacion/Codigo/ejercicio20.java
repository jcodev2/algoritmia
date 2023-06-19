// Escribir un algoritmo que permita reducir una fraccion a su minima expresion, por ejemplo si se ingresa 28/64, quedara reducida a 7/16. Sugerencia: ingrese el numerador y denominador por separado.

import java.util.Scanner;

public class ejercicio20 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int numerador, denominador, mcd, aux, nuevoNumerador, nuevoDenominador;

    do {
      System.out.print("Ingrese el numerador: ");
      numerador = teclado.nextInt();
    } while (numerador <= 0);

    do {
      System.out.print("Ingrese el denominador: ");
      denominador = teclado.nextInt();
    } while (denominador <= 0);

    aux = numerador;
    mcd = denominador;

    while (aux != mcd) {
      if (aux > mcd) {
        aux = aux - mcd;
      } else {
        mcd = mcd - aux;
      }
    }

    nuevoNumerador = numerador / aux;
    nuevoDenominador = denominador / aux;

    System.out.println("La fraccion " + numerador + "/" + denominador + " reducida a su minima expresion es: "
        + nuevoNumerador + "/" + nuevoDenominador);
  }
}