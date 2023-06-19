// 3. Leer dos números enteros N1, N2. Reportar el cuadrado de la resta de N1-N2 y el cubo del producto de N1 y N2.

import java.util.Scanner;

public class OperacionesAritmeticas {
  public static void main(String[] args) {
    // Declaración de variables
    int N1, N2;
    double resta, producto, cuadrado, cubo;

    // Creación de un objeto Scanner para leer los datos desde el teclado
    Scanner sc = new Scanner(System.in);

    // Lectura de los números desde el teclado
    System.out.print("Ingrese el primer número: ");
    N1 = sc.nextInt();

    System.out.print("Ingrese el segundo número: ");
    N2 = sc.nextInt();

    // Cálculo de la resta
    resta = N1 - N2;

    // Cálculo del producto
    producto = N1 * N2;

    // Cálculo del cuadrado de la resta
    cuadrado = Math.pow(resta, 2);

    // Cálculo del cubo del producto
    cubo = Math.pow(producto, 3);

    // Mostrar los resultados por pantalla
    System.out.println("El cuadrado de la resta de " + N1 + " y " + N2 + " es: " + cuadrado);
    System.out.println("El cubo del producto de " + N1 + " y " + N2 + " es: " + cubo);

    // Cierre del objeto Scanner
    sc.close();
  }
}
