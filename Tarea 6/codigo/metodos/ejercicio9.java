package metodos;

import java.util.Scanner;

public class ejercicio9 {
  public static void main(String[] args) {
    int n1, n2, sum1, sum2;

    n1 = leerNumero();
    n2 = leerNumero();

    sum1 = sumarDivisores(n1);
    sum2 = sumarDivisores(n2);

    if (sum1 == n2 && sum2 == n1) {
      mostrarResultado("Los números son amigos.");
    } else {
      mostrarResultado("Los números no son amigos.");
    }
  }

  public static int leerNumero() {
    Scanner input = new Scanner(System.in);

    int num;

    do {
      System.out.print("Ingrese un número entero positivo N: ");
      num = input.nextInt();
    } while (num <= 0);

    return num;
  }

  public static int sumarDivisores(int num) {
    int sum = 0;

    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }

    return sum;
  }

  public static void mostrarResultado(String mensaje) {
    System.out.println(mensaje);
  }
}
