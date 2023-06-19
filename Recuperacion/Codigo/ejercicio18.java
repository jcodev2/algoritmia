// Leer un numero n entero positivo y reportar el numero n y el numero invertido.

import java.util.Scanner;

public class ejercicio18 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numero, numeroInvertido = 0, rest, numeroCopia;

    // Lee un número entero positivo ingresado por el usuario
    do {
      System.out.print("Introduce un número entero positivo: ");
      numero = scanner.nextInt();
    } while (numero <= 0);

    numeroCopia = numero;

    // Invierte el número ingresado
    while (numero != 0) {
      rest = numero % 10; // Obtiene el último dígito del número
      numeroInvertido = numeroInvertido * 10 + rest; // Agrega el dígito al número invertido
      numero = numero / 10; // Elimina el último dígito del número
    }

    // Imprime el número original y su número invertido
    System.out.println("El número original es: " + numeroCopia);
    System.out.println("El número invertido es: " + numeroInvertido);

    scanner.close();
  }
}