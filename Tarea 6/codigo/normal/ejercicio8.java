import java.util.Scanner;

public class ejercicio8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n, sum = 0;

    do {
      System.out.print("Ingrese un número entero positivo: ");
      n = input.nextInt();
    } while (n <= 0);

    input.close();

    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        sum += i;
      }
    }

    if (sum < n) {
      System.out.println(n + " es un número deficiente.");
    } else {
      System.out.println(n + " no es un número deficiente.");
    }
  }
}
