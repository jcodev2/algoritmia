import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n1, n2, prod = 0;

    do {
      System.out.print("Ingrese el primer número entero positivo: ");
      n1 = input.nextInt();
    } while (n1 < 0);

    do {
      System.out.print("Ingrese el segundo número entero positivo: ");
      n2 = input.nextInt();
    } while (n2 < 0);

    for (int i = 1; i <= n2; i++) {
      prod += n1;
    }

    System.out.println("El producto de " + n1 + " y " + n2 + " es: " + prod);

    input.close();
  }
}
