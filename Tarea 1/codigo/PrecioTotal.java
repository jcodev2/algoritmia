// 4. Leer el precio unitario de un producto y la cantidad que desea comprar.
// Luego reportar la cantidad total a pagar.

import java.util.Scanner;

public class PrecioTotal {
  public static void main(String[] args) {
    // Crear objeto Scanner para leer la entrada del usuario
    Scanner input = new Scanner(System.in);
    // Declarar variables
    double precioUnitario, totalPagar;
    int cantidad;

    // Solicitar al usuario que ingrese el precio unitario y la cantidad
    System.out.print("Ingrese el precio unitario del producto: ");
    precioUnitario = input.nextDouble();

    System.out.print("Ingrese la cantidad que desea comprar: ");
    cantidad = input.nextInt();

    // Calcular el total a pagar
    totalPagar = precioUnitario * cantidad;

    // Mostrar el total
    System.out.println("La cantidad total a pagar es: " + totalPagar);

    // Cerrar el objeto Scanner
    input.close();
  }
}
