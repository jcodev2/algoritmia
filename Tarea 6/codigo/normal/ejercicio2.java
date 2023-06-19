import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n, sumDiv = 0;

    do {
      System.out.print("Ingrese un número entero positivo: ");
      n = input.nextInt();
    } while (n <= 0);

    input.close();

    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        sumDiv += i;
      }
    }

    if (sumDiv == n) {
      System.out.println(n + " es un número perfecto.");
    } else {
      System.out.println(n + " no es un número perfecto.");
    }
  }
}