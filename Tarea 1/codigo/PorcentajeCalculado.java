// 10. Leer un número N y el porcentaje que desea calcular del número leído. Reportar tanto el número como el porcentaje calculado.

import java.util.Scanner;

public class PorcentajeCalculado {
  public static void main(String[] args) {
    // Instancio un objeto Scanner para poder leer la entrada de teclado
    Scanner input = new Scanner(System.in);
    // Declaro las variables
    double numero, porcentaje, porcentajeCalculado;

    // Pido al usuario que ingrese un número y lo guardo en la variable numero
    System.out.print("Ingrese un número: ");
    numero = input.nextDouble();

    // Pido al usuario que ingrese el porcentaje que desea calcular
    // y lo guardo en la variable porcentaje
    System.out.print("Ingrese el porcentaje que desea calcular: ");
    porcentaje = input.nextDouble();

    // Calculo el porcentaje y guardo el resultado en la variable
    // porcentajeCalculado
    porcentajeCalculado = numero * porcentaje / 100;

    // Imprimo el número y el porcentaje calculado
    System.out.println("El número es: " + numero);
    System.out.println("El porcentaje calculado es: " + porcentajeCalculado);

    // Cierro el objeto Scanner
    input.close();
  }
}
