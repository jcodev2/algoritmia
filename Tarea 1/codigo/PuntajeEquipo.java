// 11. Elaborar un programa que ingrese el número de partidos ganados, empatados
// y perdidos por un equipo y calcule su puntaje total, sabiendo que por cada
// partido ganado son 5 puntos, cada partido empatado es 3 punto y por partido
// perdido 1 puntos.

import java.util.Scanner;

public class PuntajeEquipo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Se pide ingresar el número de partidos ganados, empatados y perdidos
    System.out.print("Ingrese el número de partidos ganados: ");
    int partidosGanados = sc.nextInt();

    System.out.print("Ingrese el número de partidos empatados: ");
    int partidosEmpatados = sc.nextInt();

    System.out.print("Ingrese el número de partidos perdidos: ");
    int partidosPerdidos = sc.nextInt();

    // Se calcula el puntaje total de acuerdo a los puntos por partido ganado,
    // empatado y perdido
    int puntajeTotal = (partidosGanados * 5) + (partidosEmpatados * 3) + (partidosPerdidos * 1);

    // Se muestra el puntaje total
    System.out.println("El puntaje total del equipo es: " + puntajeTotal);

    sc.close();
  }
}
