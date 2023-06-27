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
  static int maxHabitaciones = 100;

  public static void main(String[] args) throws Exception {
    bienvenida();
    menu();
  }

  public static void bienvenida() {
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
    int opcion = 0;
    boolean salir = false;
    int cantidadHabitaciones = 0;
    boolean datosIngresados = false;

    int[] idHabitacion = new int[maxHabitaciones];
    String[] nombreHabitacion = new String[maxHabitaciones];
    char[] tipoHabitacion = new char[maxHabitaciones];
    char[] estado = new char[maxHabitaciones];
    int[] nTotalServicios = new int[maxHabitaciones];
    double[] ingresoTotalHabitacion = new double[maxHabitaciones];

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

      System.out.print("Ingrese una opción: ");
      while (!input.hasNextInt()) {
        System.out.println("Error: Ingrese un número entero válido.");
        System.out.print("Ingrese una opción: ");
        input.next();
      }
      opcion = input.nextInt();

      switch (opcion) {
        case 1:
          if (!datosIngresados) {
            cantidadHabitaciones = ingresarDatos(idHabitacion, nombreHabitacion, tipoHabitacion, estado,
                nTotalServicios, ingresoTotalHabitacion, cantidadHabitaciones);

            datosIngresados = true;
          } else {
            System.out.println("Ya ingresó los datos. Intente con otra opción.");
          }
          break;
        case 2:
          if (datosIngresados) {
            reportarDatos(idHabitacion, nombreHabitacion, tipoHabitacion, estado, nTotalServicios,
                ingresoTotalHabitacion,
                cantidadHabitaciones);
          } else {
            System.out.println("No hay datos ingresados. Intente con otra opción.");
          }
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
          limpiarPantalla();
          System.out.println("Opción inválida. Intente con otra opción.");
          break;
      }
    }
  }

  public static int ingresarDatos(int[] idHabitacion, String[] nombreHabitacion, char[] tipoHabitacion, char[] estado,
      int[] nTotalServicios, double[] ingresoTotalHabitacion, int cantidadHabitaciones) {
    limpiarPantalla();

    System.out.print("Ingrese la cantidad de habitaciones (máximo 100): ");
    while (!input.hasNextInt()) {
      System.out.println("Error: Ingrese un número entero válido.");
      System.out.print("Ingrese la cantidad de habitaciones (máximo 100): ");
      input.next();
    }
    cantidadHabitaciones = input.nextInt();
    while (cantidadHabitaciones <= 0 || cantidadHabitaciones > 100) {
      System.out.println("Error: Ingrese un número entero válido entre 1 y 100.");
      System.out.print("Ingrese la cantidad de habitaciones (máximo 100): ");
      while (!input.hasNextInt()) {
        System.out.println("Error: Ingrese un número entero válido.");
        System.out.print("Ingrese la cantidad de habitaciones (máximo 100): ");
        input.next();
      }
      cantidadHabitaciones = input.nextInt();
    }

    for (int i = 0; i < cantidadHabitaciones; i++) {
      while (true) {
        System.out.print("\nId de la habitación (2 dígitos): ");

        while (!input.hasNextInt()) {
          System.out.println("Error. No ingresó un número entero válido.");
          System.out.print("Id de la habitación (2 dígitos): ");
          input.next();
        }

        int id = input.nextInt();

        if (id < 10 || id >= 100) {
          System.out.println("Error: El Id de la habitación debe tener 2 dígitos.");
          continue;
        }

        boolean idExiste = false;

        for (int j = 0; j < i; j++) {
          if (id == idHabitacion[j]) {
            System.out.println("Error: El Id de la habitación ya existe. Ingrese otro Id");
            idExiste = true;

            break;
          }
        }

        if (!idExiste) {
          idHabitacion[i] = id;
          break;
        }
      }

      while (true) {
        System.out.print("Nombre de la habitación (máximo 30 caracteres): ");
        String habitacionNombre = input.next().toUpperCase().trim();

        if (habitacionNombre.length() < 3 || habitacionNombre.length() > 30) {
          System.out.println("Error: El nombre de la habitación debe tener entre 3 y 30 caracteres.");
          continue;
        }

        boolean esNumero = habitacionNombre.matches("\\d+");

        if (esNumero) {
          System.out.println("Error: El nombre de la habitación no puede contener números. Ingrese otro nombre.");
          continue;
        }

        boolean nombreExiste = false;

        for (int j = 0; j < i; j++) {
          if (habitacionNombre.equals(nombreHabitacion[j])) {
            System.out.println("Error: El nombre de la habitación ya existe. Ingrese otro nombre.");
            nombreExiste = true;
            break;
          }
        }

        if (!nombreExiste) {
          nombreHabitacion[i] = habitacionNombre;
          break;
        }
      }

      while (true) {
        System.out.print("Tipo de habitación (S=Simple, D=Doble, T=Triple): ");
        char habitacionTipo = input.next().toUpperCase().charAt(0);

        if (habitacionTipo != 'S' && habitacionTipo != 'D' && habitacionTipo != 'T') {
          System.out.println("Error: El tipo de habitación debe ser S, D o T.");
          continue;
        }

        tipoHabitacion[i] = habitacionTipo;
        break;
      }

      while (true) {
        System.out.print("Estado de la habitación (L=Libre, O=Ocupada, M=Mantenimiento): ");
        char habitacionEstado = input.next().toUpperCase().charAt(0);

        if (habitacionEstado != 'L' && habitacionEstado != 'O' && habitacionEstado != 'M') {
          System.out.println("Error: El estado de la habitación debe ser L, O o M.");
          continue;
        }

        estado[i] = habitacionEstado;
        break;
      }

      while (true) {
        System.out.print("Número total de servicios: ");

        while (!input.hasNextInt()) {
          System.out.println("Error: Ingrese un número entero válido.");
          System.out.print("Número total de servicios: ");
          input.next();
        }

        int habitacionServicios = input.nextInt();

        if (habitacionServicios < 0 || habitacionServicios > 100) {
          System.out.println("Error: El número total de servicios debe ser mayor o igual a 0 y menor o igual a 100.");
          continue;
        }

        nTotalServicios[i] = habitacionServicios;
        break;
      }

      switch (tipoHabitacion[i]) {
        case 'S':
          ingresoTotalHabitacion[i] += 100;
          break;
        case 'D':
          ingresoTotalHabitacion[i] += 150;
          break;
        case 'T':
          ingresoTotalHabitacion[i] += 250;
          break;
      }
    }

    return cantidadHabitaciones;
  }

  public static void reportarDatos(int[] idHabitacion, String[] nombreHabitacion, char[] tipoHabitacion, char[] estado,
      int[] nTotalServicios, double[] ingresoTotalHabitacion, int cantidadHabitaciones) {
    limpiarPantalla();

    for (int i = 0; i < cantidadHabitaciones; i++) {
      System.out.println("Id de la habitación: " + idHabitacion[i]);
      System.out.println("Nombre de la habitación: " + nombreHabitacion[i]);
      System.out.println("Tipo de habitación: " + tipoHabitacion[i]);
      System.out.println("Estado de la habitación: " + estado[i]);
      System.out.println("Número total de servicios: " + nTotalServicios[i]);
      System.out.println("Ingreso total de la habitación: " + ingresoTotalHabitacion[i]);
      System.out.println();
    }
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
