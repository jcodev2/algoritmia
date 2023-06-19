/* Leer 2 números enteros N1 y N2 (cada uno de los cuales puede ser positivo, negativo y/o cero). Si ambos números son positivos calcular el MCD de N1 y N2. Sino calcular el producto de N1* N2 por sumas sucesivas. */

// importamos la clase Scanner
import java.util.Scanner;

public class ejercicio7 {
  public static void main(String[] args) {
    // creamos un objeto de la clase Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int n1, n2, temp, producto = 0, mcd = 0, i;

    // solicitamos los datos al usuario
    System.out.print("Ingresa el primer número: ");
    n1 = sc.nextInt();

    System.out.print("Ingresa el segundo número: ");
    n2 = sc.nextInt();

    // cerramos el objeto Scanner
    sc.close();

    // comprobamos si los números son positivos
    if (n1 > 0 && n2 > 0) {
      // comprobamos cual es el mayor de los dos números
      if (n1 > n2) {
        temp = n1;
        n1 = n2;
        n2 = temp;
      }

      // calculamos el MCD
      for (i = 1; i <= n1; i++) {
        if (n1 % i == 0 && n2 % i == 0) {
          mcd = i;
        }
      }

      System.out.println("El MCD de " + n1 + " y " + n2 + " es: " + mcd);
    } else {
      // calculamos el producto
      producto = Math.abs(n1) * Math.abs(n2);

      // comprobamos si el producto es negativo
      if ((n1 < 0 && n2 > 0) || (n1 > 0 && n2 < 0)) {
        producto = -producto;
      }

      System.out.println("El producto de " + n1 + " y " + n2 + " es: " + producto);
    }
  }
}