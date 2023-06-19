
// importamos la libreria Scanner
import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    // creamos un objeto de tipo Scanner
    Scanner sc = new Scanner(System.in);

    // variables
    int n1, n2;
    double resultado;
    char operador;

    // pedimos los datos al usuario
    System.out.print("Ingrese el numero 1: ");
    n1 = sc.nextInt();

    System.out.print("Ingrese el numero 2: ");
    n2 = sc.nextInt();

    System.out.print("Ingrese el operador: ");
    operador = sc.next().charAt(0);

    // validamos los datos
    if (n1 > 0 && n2 > 0) {
      // calculamos el tipo de operacion
      if (operador == '+') {
        resultado = n1 + n2;

        System.out.println("La suma es: " + resultado);
      } else if (operador == '-') {
        resultado = n1 - n2;

        System.out.println("La resta es: " + resultado);
      } else if (operador == '*') {
        resultado = n1 * n2;

        System.out.println("El producto es: " + resultado);
      } else if (operador == '/') {
        resultado = n1 / n2;

        System.out.println("El cociente es: " + resultado);
      } else if (operador == '%') {
        resultado = n1 % n2;

        System.out.println("El residuo es: " + resultado);
      } else {
        System.out.println("El operador no es valido");
      }
    } else {
      System.out.println("Los numeros deben ser mayores a 0");
    }

    // cerramos el objeto Scanner
    sc.close();
  }
}