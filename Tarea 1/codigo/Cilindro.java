// 9. Ingresar el radio y la altura de un cilindro y reportar su volumen y su
// superficie

import java.util.Scanner;

public class Cilindro {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Paso 1: Solicitar el valor del radio del cilindro
    System.out.print("Ingrese el valor del radio del cilindro en cm: ");
    double radio = sc.nextDouble();

    // Paso 2: Solicitar el valor de la altura del cilindro
    System.out.print("Ingrese el valor de la altura del cilindro en cm: ");
    double altura = sc.nextDouble();

    // Paso 3: Calcular el volumen del cilindro
    double volumen = Math.PI * radio * radio * altura;

    // Paso 4: Calcular la superficie del cilindro
    double superficie = 2 * Math.PI * radio * (radio + altura);

    // Paso 5: Imprimir el valor del volumen y la superficie
    System.out.println("El volumen del cilindro es: " + volumen + " cm^3");
    System.out.println("La superficie del cilindro es: " + superficie + " cm^2");

    sc.close();
  }
}
