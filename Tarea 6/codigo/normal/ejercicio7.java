import java.util.Scanner;

public class ejercicio7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int res, num, numCopia, numInv = 0;

    do {
      System.out.print("Ingrese un número entero positivo: ");
      num = input.nextInt();
    } while (num <= 0);

    numCopia = num;

    while (num > 0) {
      res = num % 10;
      numInv = numInv * 10 + res;
      num = num / 10;
    }

    if (numCopia == numInv) {
      System.out.println("El número " + numCopia + " es capicúa.");
    } else {
      System.out.println("El número " + numCopia + " no es capicúa.");
    }

    input.close();
  }
}
