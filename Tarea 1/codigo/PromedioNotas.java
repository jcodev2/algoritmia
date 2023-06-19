// 2. Leer dos notas y Calcular y reportar la nota promedio.

import java.util.Scanner;

public class PromedioNotas {
  public static void main(String[] args) {
    // Crear un objeto Scanner para leer la entrada de la consola
    Scanner sc = new Scanner(System.in);

    // Crear variables para almacenar las notas
    double note1, note2, average;

    // Lectura de las notas desde el teclado
    System.out.print("Ingrese la primera nota: ");
    note1 = sc.nextDouble();

    System.out.print("Ingrese la segunda nota: ");
    note2 = sc.nextDouble();

    // Cálculo de la nota promedio
    average = (note1 + note2) / 2;

    // Mostrar el resultado por pantalla
    System.out.println("La nota promedio de " + note1 + " y " + note2 + " es: " + average);

    // Cerrar el objeto Scanner
    sc.close();
  }
}