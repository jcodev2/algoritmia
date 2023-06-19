/* Programa que lee un número entero positivo y determina la suma de sus dígitos. El programa se debe repetir mientras se desee continuar. */

// importamos la clase Scanner
import java.util.Scanner;

public class ejercicio10 {
  public static void main(String[] args) {
    // creamos un objeto de la clase Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int numero, suma = 0, digito;
    char respuesta;

    // repetimos el programa mientras el usuario lo desee
    do {
      System.out.print("Introduzca un número entero positivo: ");

      while (!sc.hasNextInt()) {
        System.out.println("\n\u001B[31mERROR: Debe introducir un número entero.\u001B[0m");
        System.out.print("Introduzca un número entero positivo: ");
        sc.next();
      }

      numero = sc.nextInt();

      // comprobamos si el número es positivo
      while (numero <= 0) {
        System.out.println("\n\u001B[31mERROR: El número debe ser positivo.\u001B[0m");
        System.out.print("Introduzca un número entero positivo: ");
        while (!sc.hasNextInt()) {
          System.out.println("\n\u001B[31mERROR: Debe introducir un número entero.\u001B[0m");
          System.out.print("Introduzca un número entero positivo: ");
          sc.next();
        }

        numero = sc.nextInt();
      }

      // calculamos la suma de los dígitos
      while (numero != 0) {
        digito = numero % 10;
        suma = suma + digito;
        numero = numero / 10;
      }

      // mostramos el resultado
      System.out.println("La suma de sus dígitos es: " + suma);
      System.out.print("¿Desea continuar? (s/n): ");

      while (true) {
        respuesta = sc.next().charAt(0);

        if (respuesta == 's' || respuesta == 'S' || respuesta == 'n' || respuesta == 'N') {
          break;
        } else {
          System.out.println("\n\u001B[31mERROR: Debe introducir 's' o 'n'.\u001B[0m");
          System.out.print("¿Desea continuar? (s/n): ");
        }
      }

      // reiniciamos la variable suma
      suma = 0;
    } while (respuesta == 's' || respuesta == 'S');

    // cerramos el objeto Scanner
    sc.close();
  }
}
