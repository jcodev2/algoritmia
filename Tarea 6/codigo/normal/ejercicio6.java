import java.util.Scanner;

public class ejercicio6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n1, n2, pot = 1;

    do {
      System.out.print("Ingrese un número entero positivo N1: ");
      n1 = input.nextInt();
    } while (n1 <= 0);

    do {
      System.out.print("Ingrese un número entero positivo N2: ");
      n2 = input.nextInt();
    } while (n2 <= 0);

    for (int i = 1; i <= n2; i++) {
      pot = pot * n1;
    }

    System.out.println(n1 + "^" + n2 + " = " + pot);

    input.close();
  }
}
