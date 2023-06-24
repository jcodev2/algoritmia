/* Sistema de reserva de un hotel */

/*
  Implementar un sistema de reserva de habitaciones de un hotel. El sistema debe permitir:

  - Ingresar datos de N habitaciones de hotel (se realiza una sola vez) IdHabitación (int 2 dígitos), Nombre Habitación (String), Tipo Habitación (char) ‘S’=simple, ‘D’=doble, ‘T’=triple, estado (char) que inicialmente es Libre (L), N° Total Servicios (int) inicialmente igual a cero, Ingreso total por Habitación (double) inicialmente igual a cero. Una habitación simple cuesta 100 soles, una habitación doble cuesta 150 soles y una habitación triple cuesta 250 soles.

  - Reportar todos los datos (se realiza solo si hay datos ingresados).

  - Agregar datos (se puede hacer siempre que haya espacio en los arreglos)

  - Modificar datos por IdHabitación (se realiza solo si hay datos ingresados)

  - Eliminar datos Nombre Habitación (se realiza solo si hay datos ingresados). Solo se puede eliminar si su estado es Libre (L). Si se elimina un IdHabitación, se elimina todos sus datos.

  - Consultar por nombre de habitación (se realiza solo si hay datos ingresados).

  - Consultar por IdHabitación (se realiza solo si hay datos ingresados)

  - Ordenar los datos alfabéticamente en forma ascendente por nombre de habitación (se realiza solo si hay datos ingresados)

  - Ordenar en forma descendente por IdHabitación (se realiza solo si hay datos ingresados)

  - Reserva de habitación (se realiza solo si hay datos ingresados). Cuando se reserva una habitación, primero se debe preguntar qué tipo de habitación se requiere, y fecha; en base a la respuesta se muestran todas las habitaciones disponibles, luego se pide que se selecciones la habitación deseada y se cambia su estado a Ocupada. Luego se debe ingresar Nombre Cliente (string), Ciudad Origen (String), costo habitación (double), fecha e IdHabitación.

  - Fin de servicio se hace en base al IdHabitación, significa que un servicio a terminado por lo tanto el estado de la habitación cambia a Libre Luego reportar todos los NT servicios realizados, indicando nombres de clientes. Ciudad de origen con el Id habitación y monto pagado. Además el monto total recaudado.

  - Terminar el programa.
*/

import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    bienvenida();

    menu();
  }

  public static void bienvenida() {
    Scanner input = new Scanner(System.in);

    System.out.println("\n***** Bienvenido al sistema de reservas del hotel *****");
    System.out.println("Presione Enter para continuar...");
    input.nextLine();

    // Limpia la pantalla
    limpiarPantalla();
  }

  public static void limpiarPantalla() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void menu() {
    Scanner input = new Scanner(System.in);

    int opcion;

    System.out.println("Menú de opciones");
    System.out.println("1. Ingresar datos de N habitaciones de hotel");
    System.out.println("2. Reportar todos los datos");
    System.out.println("3. Agregar datos");
    System.out.println("4. Modificar datos por IdHabitación");
    System.out.println("5. Eliminar datos Nombre Habitación");
    System.out.println("6. Consultar por nombre de habitación");
    System.out.println("7. Consultar por IdHabitación");
    System.out.println("8. Ordenar los datos alfabéticamente en forma ascendente por nombre de habitación");
    System.out.println("9. Ordenar en forma descendente por IdHabitación");
    System.out.println("10. Reserva de habitación");
    System.out.println("11. Fin de servicio");
    System.out.println("12. Terminar el programa");
    System.out.println("\nIngrese una opción: ");

    do {
      while (!input.hasNextInt()) {
        System.out.println("La opción ingresada no es válida");
        System.out.println("Ingrese una opción nuevamente: ");
        input.next();
      }

      opcion = input.nextInt();

      if (opcion < 1 || opcion > 12) {
        System.out.println("La opción ingresada no es válida");
        System.out.println("Ingrese una opción nuevamente: ");
      }
    } while (opcion < 1 || opcion > 12);

    // Continuar con el programa

    limpiarPantalla();

    switch (opcion) {
      case 1:
        ingresarDatos();
        break;
      case 2:
        // reportarDatos();
        break;
      case 3:
        // agregarDatos();
        break;
      case 4:
        // modificarDatos();
        break;
      case 5:
        // eliminarDatos();
        break;
      case 6:
        // consultarNombreHabitacion();
        break;
      case 7:
        // consultarIdHabitacion();
        break;
      case 8:
        // ordenarAlfabeticamente();
        break;
      case 9:
        // ordenarDescendentemente();
        break;
      case 10:
        // reservarHabitacion();
        break;
      case 11:
        // finServicio();
        break;
      case 12:
        // terminarPrograma();
        break;
      default:
        System.out.println("Opción inválida");
        break;
    }
  }

  public static void ingresarDatos() {
    Scanner input = new Scanner(System.in);

    System.out.println("\nIngrese la cantidad de habitaciones: ");
    int cantidadHabitaciones = input.nextInt();

    // Validar que la cantidad de habitaciones sea mayor a 0
    while (cantidadHabitaciones < 1) {
      System.out.println("La cantidad de habitaciones debe ser mayor a 0");
      System.out.println("Ingrese la cantidad de habitaciones nuevamente: ");
      cantidadHabitaciones = input.nextInt();
    }

    int[] idHabitacion = new int[cantidadHabitaciones];
    String[] nombreHabitacion = new String[cantidadHabitaciones];
    char[] tipoHabitacion = new char[cantidadHabitaciones];
    char[] estado = new char[cantidadHabitaciones];
    int[] totalServicios = new int[cantidadHabitaciones];
    double[] ingresoTotal = new double[cantidadHabitaciones];

    for (int i = 0; i < cantidadHabitaciones; i++) {
      System.out.println("\nIngrese el Id de la habitación " + (i + 1) + " (ej: 10): ");
      idHabitacion[i] = input.nextInt();

      // Validar que el Id sea de 2 dígitos
      while (idHabitacion[i] < 10 || idHabitacion[i] > 99) {
        System.out.println("El Id de la habitación debe ser de 2 dígitos");
        System.out.println("Ingrese el Id de la habitación nuevamente: ");
        idHabitacion[i] = input.nextInt();
      }

      // Validar que el Id no se repita
      while (i > 0 && idHabitacion[i] == idHabitacion[i - 1]) {
        System.out.println("El Id de la habitación no puede repetirse");
        System.out.println("Ingrese el Id de la habitación nuevamente: ");
        idHabitacion[i] = input.nextInt();
      }

      System.out.println("\nIngrese el nombre de la habitación " + (i + 1) + " (ej: Junior): ");
      nombreHabitacion[i] = input.next().trim();

      // Validar que el nombre de la habitación tenga entre 2 y 30 caracteres
      while (nombreHabitacion[i].length() < 2 || nombreHabitacion[i].length() > 30) {
        System.out.println("El nombre de la habitación debe tener entre 2 y 30 caracteres");
        System.out.println("Ingrese el nombre de la habitación nuevamente: ");
        nombreHabitacion[i] = input.next();
      }

      // Validar que el nombre no este compuesto solo por espacios
      while (nombreHabitacion[i].trim().length() == 0) {
        System.out.println("El nombre de la habitación no puede estar compuesto solo por espacios");
        System.out.println("Ingrese el nombre de la habitación nuevamente: ");
        nombreHabitacion[i] = input.next();
      }

      // Validar que el nombre no tenga caracteres especiales ni números
      while (!nombreHabitacion[i].matches("[a-zA-Z ]*")) {
        System.out.println("El nombre de la habitación no puede tener caracteres especiales ni números");
        System.out.println("Ingrese el nombre de la habitación nuevamente: ");
        nombreHabitacion[i] = input.next();
      }

    }
  }
}
