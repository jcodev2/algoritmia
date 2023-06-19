// 5. Leer una temperatura en grados centígrados y reportarla en grados
// Fahrenheit (°F= 1.8*°C+32)

import java.util.Scanner;

public class ConversionTemperatura {
  public static void main(String[] args) {
    // Crea un objeto Scanner para leer la entrada del usuario
    Scanner sc = new Scanner(System.in);
    // Declara las variables
    double celsius, fahrenheit;

    // Pide al usuario ingresar la temperatura en grados Celsius
    System.out.print("Ingrese la temperatura en grados Celsius: ");
    celsius = sc.nextDouble();

    // Convierte la temperatura de Celsius a Fahrenheit utilizando la fórmula °F =
    // 1.8 * °C + 32
    fahrenheit = 1.8 * celsius + 32;

    // Imprime la temperatura convertida en grados Fahrenheit
    System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);

    // Cierra el objeto Scanner
    sc.close();
  }
}
