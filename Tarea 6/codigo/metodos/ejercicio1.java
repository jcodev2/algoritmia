package metodos;

import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {

    int n, sum;

    n = leerNumero();
    sum = sumarDigitos(n);

    mostrarResultado("La suma de los dígitos de " + n + " es " + sum + ".");
  }

  public static int leerNumero() {
    Scanner input = new Scanner(System.in);

    int n;

    do {
      System.out.print("Ingrese un número entero positivo: ");
      n = input.nextInt();
    } while (n < 0);

    input.close();

    return n;
  }

  public static int sumarDigitos(int n) {
    int sum = 0;

    while (n > 0) {
      sum = sum + n % 10;
      n = n / 10;
    }

    return sum;
  }

  public static void mostrarResultado(String mensaje) {
    System.out.println(mensaje);
  }
}
