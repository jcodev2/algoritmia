import java.util.Scanner;

public class ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n;
    boolean esPrimo = true;

    do {
      System.out.print("Ingrese un número entero positivo N: ");
      n = sc.nextInt();
    } while (n <= 0);

    if (n == 1) {
      esPrimo = false;
    } else {
      for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
          esPrimo = false;
          i = n;
        }
      }
    }

    if (esPrimo) {
      System.out.println(n + " es un número primo.");
    } else {
      System.out.println(n + " no es un número primo.");
    }

    sc.close();
  }
}
