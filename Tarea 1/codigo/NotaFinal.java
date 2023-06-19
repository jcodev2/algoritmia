// 12. Elaborar un algoritmo que ingrese el número de respuestas correctas, incorrectas y no respondidas por un estudiante. Y calcule su nota final sabiendo que cada respuesta correcta vale 6 puntos, cada incorrecta -3 puntos y cada pregunta no respondida -2 puntos.

import java.util.Scanner;

public class NotaFinal {
  public static void main(String[] args) {
    // Creación de un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // Solicita al usuario que ingrese el número de respuestas correctas
    System.out.print("Ingrese el número de respuestas correctas: ");
    int respuestasCorrectas = sc.nextInt();

    // Solicita al usuario que ingrese el número de respuestas incorrectas
    System.out.print("Ingrese el número de respuestas incorrectas: ");
    int respuestasIncorrectas = sc.nextInt();

    // Solicita al usuario que ingrese el número de preguntas no respondidas
    System.out.print("Ingrese el número de preguntas no respondidas: ");
    int preguntasNoRespondidas = sc.nextInt();

    // Calcula la nota final
    int notaFinal = (respuestasCorrectas * 6) - (respuestasIncorrectas * 3) - (preguntasNoRespondidas * 2);

    // Muestra el resultado al usuario
    System.out.println("La nota final es: " + notaFinal);

    // Cierra el objeto Scanner
    sc.close();
  }
}
