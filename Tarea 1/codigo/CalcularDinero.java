// 8. Se tienen X billetes de 10 soles, Y billetes de Veinte soles y Z billetes
// de 50 soles. Reportar cuánto dinero tengo en total.

import java.util.Scanner;

public class CalcularDinero {
  public static void main(String[] args) {
    // Crear un objeto de la clase Scanner
    Scanner sc = new Scanner(System.in);

    // Declarar variables
    int x, y, z, total;

    // Leer la cantidad de billetes de 10 soles
    System.out.print("Ingrese la cantidad de billetes de 10 soles: ");
    x = sc.nextInt();

    // Leer la cantidad de billetes de 20 soles
    System.out.print("Ingrese la cantidad de billetes de 20 soles: ");
    y = sc.nextInt();

    // Leer la cantidad de billetes de 50 soles
    System.out.print("Ingrese la cantidad de billetes de 50 soles: ");
    z = sc.nextInt();

    // Calcular la cantidad total de dinero
    total = (10 * x) + (20 * y) + (50 * z);

    // Mostrar el resultado
    System.out.println("La cantidad total de dinero es: " + total + " soles");

    sc.close();
  }
}
