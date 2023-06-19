import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n, sum = 0;

    do {
      System.out.print("Ingrese un número entero positivo: ");
      n = input.nextInt();
    } while (n < 0);

    while (n > 0) {
      sum = sum + n % 10;
      n = n / 10;
    }

    System.out.println("La suma de los dígitos es: " + sum);

    input.close();
  }
}
