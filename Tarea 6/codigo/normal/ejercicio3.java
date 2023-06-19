import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n1, n2, mcd = 1;

    do {
      System.out.print("Ingrese un número entero positivo para n1: ");
      n1 = input.nextInt();
    } while (n1 <= 0);

    do {
      System.out.print("Ingrese un número entero positivo para n2: ");
      n2 = input.nextInt();
    } while (n2 <= 0);

    for (int i = 1; i <= n1 && i <= n2; i++) {
      if (n1 % i == 0 && n2 % i == 0) {
        mcd = i;
      }
    }

    System.out.println("El MCD de " + n1 + " y " + n2 + " es " + mcd);

    input.close();
  }
}