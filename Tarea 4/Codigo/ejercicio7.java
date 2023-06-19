/* N personas van a un restaurant, piden la carta y cada uno de ellos consumen dos platos uno de precio X y otro de precio Y, más una bebida de precio Z. Si al consumo total se le agrega el 18% por concepto de IGV. ¿Cuánto se paga en total por las N personas? */

// importamos la libreria Scanner
import java.util.Scanner;

public class ejercicio7 {
  public static void main(String[] args) {
    // creamos el objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int n, i;
    double x, y, z, suma = 0, total;

    // ingresamos el valor de N
    System.out.print("Ingrese el número de personas: ");
    n = sc.nextInt();

    // validamos que N sea positivo
    while (n <= 0) {
      System.out.print("El valor debe ser positivo. Ingrese nuevamente: ");
      n = sc.nextInt();
    }

    // pedimos el precio de X, Y y Z
    for (i = 1; i <= n; i++) {
      // ingresamos el precio de X
      System.out.print("Ingrese el precio X del primer plato de la persona " + i + ": ");
      x = sc.nextDouble();

      // validamos que el precio de X sea positivo
      while (x <= 0) {
        System.out.print("El precio de X debe ser positivo. Ingrese nuevamente: ");
        x = sc.nextDouble();
      }

      // ingresamos el precio de Y
      System.out.print("Ingrese el precio de Y del segundo plato de la persona " + i + ": ");
      y = sc.nextDouble();

      // validamos que el precio de Y sea positivo
      while (y <= 0) {
        System.out.print("El precio de Y debe ser positivo. Ingrese nuevamente: ");
        y = sc.nextDouble();
      }

      // ingresamos el precio de Z
      System.out.print("Ingrese el precio de Z de la bebida de la persona " + i + ": ");
      z = sc.nextDouble();

      // validamos que el precio de Z sea positivo
      while (z <= 0) {
        System.out.print("El precio de Z debe ser positivo. Ingrese nuevamente: ");
        z = sc.nextDouble();
      }

      // sumamos el total
      suma += x + y + z;
    }

    // calculamos el total
    total = suma + (suma * 0.18);

    // mostramos el total
    System.out.println("El total a pagar por las " + n + " personas es: " + total);

    // cerramos el objeto Scanner
    sc.close();
  }
}