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
  static Scanner input = new Scanner(System.in);

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
    int opcion;
    boolean salir = false;
    int cantidadHabitaciones = 0;
    boolean datosIngresados = false; // agregamos esta variable

    int[] idHabitacion = new int[100];
    String[] nombreHabitacion = new String[100];
    char[] tipoHabitacion = new char[100];
    char[] estado = new char[100];
    int[] nTotalServicios = new int[100];
    double[] ingresoTotalHabitacion = new double[100];

    while (!salir) {
      System.out.println("\n***** Menú *****");
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

      System.out.print("\nIngrese una opción: ");
      opcion = input.nextInt();

      switch (opcion) {
        case 1:
          if (!datosIngresados) { // verificamos si los datos ya fueron ingresados
            ingresarDatos(idHabitacion, nombreHabitacion, tipoHabitacion, estado, nTotalServicios,
                ingresoTotalHabitacion,
                cantidadHabitaciones);
            datosIngresados = true; // cambiamos el valor de datosIngresados a true
          } else {
            System.out.println("Ya ingresó los datos. Intente con otra opción.");
          }
          break;
        case 2:
          reportarDatos();
          break;
        case 3:
          agregarDatos();
          break;
        case 4:
          modificarDatos();
          break;
        case 5:
          eliminarDatos();
          break;
        case 6:
          consultarPorNombre();
          break;
        case 7:
          consultarPorId();
          break;
        case 8:
          ordenarAlfabeticamente();
          break;
        case 9:
          ordenarDescendentemente();
          break;
        case 10:
          reservarHabitacion();
          break;
        case 11:
          finDeServicio();
          break;
        case 12:
          salir = true;
          break;
        default:
          System.out.println("Opción inválida");
          break;
      }
    }
  }

  public static void ingresarDatos(int[] idHabitacion, String[] nombreHabitacion, char[] tipoHabitacion, char[] estado,
      int[] nTotalServicios, double[] ingresoTotalHabitacion, int cantidadHabitaciones) {
    limpiarPantalla();

    System.out.print("Ingrese la cantidad de habitaciones: ");
    cantidadHabitaciones = input.nextInt();

    for (int i = 0; i < cantidadHabitaciones; i++) {
      System.out.print("\nIngrese el Id de la habitación: ");
      idHabitacion[i] = input.nextInt();

      System.out.print("Ingrese el nombre de la habitación: ");
      nombreHabitacion[i] = input.next();

      System.out.print("Ingrese el tipo de habitación (S, D, T): ");
      tipoHabitacion[i] = input.next().charAt(0);

      System.out.print("Ingrese el estado de la habitación (L, O): ");
      estado[i] = input.next().charAt(0);

      System.out.print("Ingrese el número total de servicios: ");
      nTotalServicios[i] = input.nextInt();

      System.out.print("Ingrese el ingreso total de la habitación: ");
      ingresoTotalHabitacion[i] = input.nextDouble();
    }
  }

  public static void reportarDatos() {

  }

  public static void agregarDatos() {

  }

  public static void modificarDatos() {

  }

  public static void eliminarDatos() {

  }

  public static void consultarPorNombre() {

  }

  public static void consultarPorId() {

  }

  public static void ordenarAlfabeticamente() {

  }

  public static void ordenarDescendentemente() {

  }

  public static void reservarHabitacion() {

  }

  public static void finDeServicio() {

  }
}
