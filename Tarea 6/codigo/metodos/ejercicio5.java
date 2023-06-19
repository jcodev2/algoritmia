package metodos;

import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args) {
    int n1, n2, prod;

    n1 = leerNumero();
    n2 = leerNumero();

    prod = producto(n1, n2);

    mostrarResultado("El producto de " + n1 + " y " + n2 + " es: " + prod);
  }

  public static int leerNumero() {
    Scanner input = new Scanner(System.in);

    int numero;

    do {
      System.out.print("Introduce un número: ");
      numero = input.nextInt();
    } while (numero <= 0);

    return numero;
  }

  public static int producto(int n1, int n2) {
    int prod = 0;

    for (int i = 1; i <= n2; i++) {
      prod += n1;
    }

    return prod;
  }

  public static void mostrarResultado(String mensaje) {
    System.out.println(mensaje);
  }
}
