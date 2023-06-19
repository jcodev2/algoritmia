/*
 * Una empresa tiene tres categorías de trabajadores: Funcionarios,
 * Administrativos y Obreros. Cada uno de ellos tiene formas de pago diferentes.
 * Un funcionario recibe 100 soles por hora. Un administrativo recibe 50 soles
 * por hora y los obreros ganan 20 soles por hora. Ingresar la categoría del
 * trabajador y el número de horas laboradas Determinar su sueldo neto, si sobre
 * su sueldo básico se le descuenta el 18 % por impuestos.
 * 
 * - Sueldo Básico = Pago por hora * N° de horas Laboradas
 * - Descuento = Sueldo Básico * % Impuestos
 * - Sueldo Neto = Sueldo Básico – Descuento
 */

// Importamos la clase Scanner
import java.util.Scanner;

public class ejercicio12 {
  public static void main(String[] args) {
    // Creamos un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // Declaramos las variables
    String categoria;
    int horas;
    double sueldoBasico, descuento, sueldoNeto;

    // Leemos los datos
    System.out.print("Ingrese la categoría del trabajador: ");
    categoria = sc.nextLine();
    System.out.print("Ingrese el número de horas laboradas: ");
    horas = sc.nextInt();

    // Validamos los datos
    if (horas < 0) {
      System.out.println("El número de horas no puede ser negativo");
      sc.close();
      return;
    } else if (horas == 0) {
      System.out.println("El número de horas no puede ser cero");
      sc.close();
      return;
    }

    // Calculamos el sueldo básico
    switch (categoria) {
      case "Funcionario":
        sueldoBasico = horas * 100;
        break;
      case "Administrativo":
        sueldoBasico = horas * 50;
        break;
      case "Obrero":
        sueldoBasico = horas * 20;
        break;
      case "funcionario":
        sueldoBasico = horas * 100;
        break;
      case "administrativo":
        sueldoBasico = horas * 50;
        break;
      case "obrero":
        sueldoBasico = horas * 20;
        break;
      default:
        System.out.println("La categoría ingresada no es válida");
        sc.close();
        return;
    }

    // Calculamos el descuento
    descuento = sueldoBasico * 0.18;

    // Calculamos el sueldo neto
    sueldoNeto = sueldoBasico - descuento;

    // Mostramos el resultado
    System.out.println("El sueldo básico es: " + sueldoBasico);
    System.out.println("El descuento es: " + descuento);
    System.out.println("El sueldo neto es: " + sueldoNeto);

    // Cerramos el objeto Scanner
    sc.close();
  }
}