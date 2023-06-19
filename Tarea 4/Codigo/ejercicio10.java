/* Programa que Lee N edades y determine cuantas edades son mayores de edad y cuantas son menores de edad. También debe calcular la suma de todas las edades y su promedio. */

// importamos la librería Scanner
import java.util.Scanner;

public class ejercicio10 {
  public static void main(String[] args) {
    // creamos el objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declaramos las variables
    int n, i, mayores = 0, menores = 0, edad, suma = 0;
    double promedio;

    // ingresamos el valor de N
    System.out.print("Ingrese el número de edades a ingresar: ");
    n = sc.nextInt();

    // validamos que N sea positivo
    while (n <= 0) {
      System.out.print("El valor debe ser positivo. Ingrese nuevamente: ");
      n = sc.nextInt();
    }

    // ingresamos las N edades
    for (i = 1; i <= n; i++) {
      // ingresamos la edad
      System.out.print("Ingrese la edad " + i + ": ");
      edad = sc.nextInt();

      // validamos que la edad sea positiva y menor a 120
      while (edad <= 0 || edad > 120) {
        System.out.print("La edad debe ser positiva, mayor a 0 y menor a 120. Ingrese nuevamente: ");
        edad = sc.nextInt();
      }

      // contamos las edades mayores y menores
      if (edad >= 18) {
        mayores++;
      } else {
        menores++;
      }

      // sumamos las edades
      suma += edad;
    }

    // calculamos el promedio
    promedio = (double) suma / n;

    // mostramos los resultados
    System.out.println("Hay " + mayores + " mayores de edad");
    System.out.println("Hay " + menores + " menores de edad");
    System.out.println("La suma de las edades es " + suma);
    System.out.println("El promedio de las edades es " + promedio);
  }
}