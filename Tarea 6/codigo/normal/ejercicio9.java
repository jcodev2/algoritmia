import java.util.Scanner;

public class ejercicio9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n1, n2, sum1 = 0, sum2 = 0;

    do {
      System.out.print("Ingrese un número entero positivo N1: ");
      n1 = input.nextInt();
    } while (n1 <= 0);

    do {
      System.out.print("Ingrese un número entero positivo N2: ");
      n2 = input.nextInt();
    } while (n2 <= 0);

    input.close();

    for (int i = 1; i < n1; i++) {
      if (n1 % i == 0) {
        sum1 += i;
      }
    }

    for (int i = 1; i < n2; i++) {
      if (n2 % i == 0) {
        sum2 += i;
      }
    }

    if (sum1 == n2 && sum2 == n1) {
      System.out.println("Los números son amigos.");
    } else {
      System.out.println("Los números no son amigos.");
    }
  }
}
