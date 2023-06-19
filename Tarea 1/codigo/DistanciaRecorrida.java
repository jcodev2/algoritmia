// 6.Ingresar la velocidad en cm/seg y el tiempo en horas y reportar la distancia recorrida. (V = d/t).

import java.util.Scanner;

public class DistanciaRecorrida {
  public static void main(String[] args) {
    // Se crea un objeto de la clase Scanner para leer los datos ingresados por el
    // usuario desde la consola
    Scanner sc = new Scanner(System.in);

    // Se declaran las variables necesarias para almacenar los valores ingresados
    // por el usuario y el resultado de los cálculos
    double velocidad, tiempo, distancia;

    // Se le solicita al usuario que ingrese la velocidad en cm/seg y se almacena en
    // la variable correspondiente
    System.out.print("Ingrese la velocidad en cm/seg: ");
    velocidad = sc.nextDouble();

    // Se le solicita al usuario que ingrese el tiempo en horas y se almacena en la
    // variable correspondiente
    System.out.print("Ingrese el tiempo en horas: ");
    tiempo = sc.nextDouble();

    // Se calcula la distancia recorrida utilizando la fórmula V = d/t, despejando d
    // = V*t y se almacena en la variable correspondiente
    distancia = velocidad * tiempo * 3600;

    // Se muestra el resultado de la distancia recorrida en cm
    System.out.println("La distancia recorrida es: " + distancia + " cm");

    // Se cierra el objeto Scanner para liberar los recursos utilizados
    sc.close();
  }
}
