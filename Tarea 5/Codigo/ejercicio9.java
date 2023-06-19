/* Programa que permite leer un número entero positivo y lo escribe al revés. El programa se debe repetir X veces. */

// importamos la clase Scanner
import java.util.Scanner;

public class ejercicio9 {
  public static void main(String[] args) {
    // creamos un objeto de la clase Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int x, i, numero, digito;

    // solicitamos los datos al usuario
    System.out.print("Ingrese la cantidad de números que desea invertir: ");
    x = sc.nextInt();

    // comprobamos si el número es positivo
    while (x <= 0) {
      System.out.println("\n\u001B[31mERROR: El número debe ser positivo.\u001B[0m");
      System.out.print("Ingrese la cantidad de números que desea invertir: ");
      x = sc.nextInt();
    }

    // invertimos el número
    for (i = 0; i < x; i++) {
      System.out.print("Ingrese un número entero positivo: ");
      numero = sc.nextInt();

      // comprobamos si el número es positivo
      while (numero <= 0) {
        System.out.println("\n\u001B[31mERROR: El número debe ser positivo.\u001B[0m");
        System.out.print("Ingrese un número entero positivo: ");
        numero = sc.nextInt();
      }

      while (numero != 0) {
        digito = numero % 10; // % 10 nos da el último dígito
        System.out.print("" + digito); // imprimimos el último dígito
        numero = numero / 10; // eliminamos el último dígito
      }

      System.out.println("\n");
    }

    // cerramos el objeto Scanner
    sc.close();
  }
}