import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n1, n2, mcm = 1, divisor = 2;

    do {
      System.out.print("Introduce el primer número: ");
      n1 = input.nextInt();
    } while (n1 <= 0);

    do {
      System.out.print("Introduce el segundo número: ");
      n2 = input.nextInt();
    } while (n2 <= 0);

    while (n1 > 1 || n2 > 1) {
      if (n1 % divisor == 0 || n2 % divisor == 0) {
        mcm = mcm * divisor;

        if (n1 % divisor == 0) {
          n1 = n1 / divisor;
        }

        if (n2 % divisor == 0) {
          n2 = n2 / divisor;
        }
      } else {
        divisor++;
      }
    }

    System.out.println("El MCM es: " + mcm);

    input.close();
  }
}
