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

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
  static Scanner input = new Scanner(System.in);
  static int max = 100;
  static int[] idHabitacion = new int[max];
  static String[] nombreHabitacion = new String[max];
  static char[] tipoHabitacion = new char[max];
  static char[] estado = new char[max];
  static int[] nTotalServicios = new int[max];
  static double[] montoHabitacion = new double[max];
  static String[] nombreCliente = new String[max];
  static String[] ciudadOrigen = new String[max];
  static double[] costoHabitacion = new double[max];
  static String[] fecha = new String[max];
  static int cantidadHabitaciones = 0;
  static double costoFinal = 0;
  static boolean datosIngresados = false;
  static String[] tiposServicios = { "Desayuno", "Almuerzo", "Cena", "Lavandería", "Bar", "Cochera", "Spa", "Gimnasio",
      "Piscina", "Sauna" };
  static int[] serviciosSeleccionados = new int[10];
  static int[][] serviciosPorHabitacion = new int[max][10];

  public static void main(String[] args) throws Exception {
    boolean salir = false;

    while (!salir) {
      int opcion = menu();

      switch (opcion) {
        case 1:
          if (!datosIngresados) {
            cantidadHabitaciones = ingresarDatos(cantidadHabitaciones);
          } else {
            System.out.println("\nLos datos ya fueron ingresados");
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
          consultarPorNombreHabitacion();
          break;
        case 7:
          consultarPorIdHabitacion();
          break;
        case 8:
          ordenarAlfabeticamentePorNombreHabitacion();
          break;
        case 9:
          ordenarDescendentementePorIdHabitacion();
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
          System.out.println("\nOpción inválida");
          break;
      }
    }
  }

  /**
   * Displays a menu of options for a hotel management system.
   * 
   * @return the user's selected option
   */
  public static int menu() {
    StringBuilder menuOptions = new StringBuilder();
    menuOptions.append("\n*----------------- Hotel -----------------*\n");
    menuOptions.append("1. Ingresar datos de N habitaciones de hotel\n");
    menuOptions.append("2. Reportar todos los datos\n");
    menuOptions.append("3. Agregar datos\n");
    menuOptions.append("4. Modificar datos por IdHabitación\n");
    menuOptions.append("5. Eliminar datos Nombre Habitación\n");
    menuOptions.append("6. Consultar por nombre de habitación\n");
    menuOptions.append("7. Consultar por IdHabitación\n");
    menuOptions.append("8. Ordenar los datos alfabéticamente en forma ascendente por nombre de habitación\n");
    menuOptions.append("9. Ordenar en forma descendente por IdHabitación\n");
    menuOptions.append("10. Reserva de habitación\n");
    menuOptions.append("11. Fin de servicio\n");
    menuOptions.append("12. Terminar el programa\n");
    menuOptions.append("Ingrese una opción: ");

    System.out.print(menuOptions.toString());

    // Validate that the input is a positive integer between 1 and 12
    int opcion = validarEnteroPositivoEntre(1, 12, "Ingrese una opción: ");

    return opcion;
  }

  /**
   * Clears the console screen.
   */
  public static void limpiarPantalla() {
    // Use ANSI escape codes to clear the screen
    System.out.print("\033[H\033[2J");

    // Flush the console output buffer to ensure that any buffered output is written
    // to the console
    System.out.flush();
  }

  /**
   * Prompts the user to enter the number of hotel rooms.
   * 
   * @return the number of hotel rooms entered by the user
   */
  public static int leerCantidadDeHabitaciones() {
    int cantidadHabitaciones = 0;

    System.out.print("Ingrese la cantidad de habitaciones: ");

    // Validate that the input is a positive integer between 1 and 100
    cantidadHabitaciones = validarEnteroPositivoEntre(1, 100, "Ingrese la cantidad de habitaciones: ");

    return cantidadHabitaciones;
  }

  /**
   * Prompts the user to enter an integer value between min and max (inclusive).
   * 
   * @param min the minimum value allowed
   * @param max the maximum value allowed
   * @return the integer value entered by the user
   */
  private static int validarEnteroPositivoEntre(int min, int max, String message) {
    int valor = 0;
    boolean esValido = false;

    do {
      try {
        valor = input.nextInt();
        if (valor >= min && valor <= max) {
          esValido = true;
        } else {
          System.out.printf("El valor debe estar entre %d y %d%n", min, max);
          System.out.print(message);
        }
      } catch (InputMismatchException e) {
        System.out.println("El valor debe ser un número entero");
        System.out.print(message);
        input.nextLine();
      }
    } while (!esValido);

    return valor;
  }

  public static int ingresarDatos(int cantidadHabitaciones) {
    limpiarPantalla();

    if (datosIngresados) {
      System.out.println("\nLos datos ya fueron ingresados");
    } else {
      cantidadHabitaciones = leerCantidadDeHabitaciones();

      for (int i = 0; i < cantidadHabitaciones; i++) {
        ingresarDatosHabitacion(i);
      }

      datosIngresados = true;

      mensaje(datosIngresados);
    }

    return cantidadHabitaciones;
  }

  private static void ingresarDatosHabitacion(int index) {
    System.out.print("\nIngrese el Id de la habitación (2 dígitos): ");
    idHabitacion[index] = validarEnteroPositivoEntre(10, 99, "Ingrese el Id de la habitación (2 dígitos): ");

    validarIdHabitacionUnico(index);

    System.out.print("Ingrese el nombre de la habitación: ");
    nombreHabitacion[index] = validarNombreHabitacion("Ingrese el nombre de la habitación: ");

    validarNombreHabitacionUnico(index);

    System.out.print("Ingrese el tipo de habitación (S = simple, D = doble, T = triple): ");
    tipoHabitacion[index] = validarTipoHabitacion(
        "Ingrese el tipo de habitación (S = simple, D = doble, T = triple): ");

    System.out.print("Ingrese el número total de servicios: ");
    nTotalServicios[index] = validarEnteroPositivoEntre(0, 10, "Ingrese el número total de servicios: ");

    if (nTotalServicios[index] > 0) {
      seleccionarServicios(index);
    }

    calcularMontoHabitacion(index);

    estado[index] = 'L';
  }

  private static void validarIdHabitacionUnico(int index) {
    boolean idUnico = true;
    do {
      for (int j = 0; j < index; j++) {
        if (idHabitacion[index] == idHabitacion[j]) {
          System.out.println("El Id de la habitación ya existe");
          System.out.print("Ingrese el Id de la habitación (2 dígitos): ");
          idHabitacion[index] = input.nextInt();
          input.nextLine();

          while (idHabitacion[index] < 10 || idHabitacion[index] > 99) {
            System.out.println("El Id de la habitación debe ser mayor o igual a 10 y menor a 100");
            System.out.print("Ingrese el Id de la habitación (2 dígitos): ");
            idHabitacion[index] = input.nextInt();
            input.nextLine();
          }
          idUnico = false;
          break;
        }
      }
      if (idUnico) {
        break;
      }
      idUnico = true;
    } while (true);
  }

  private static String validarNombreHabitacion(String prompt) {
    String nombre = input.next().toUpperCase().trim();

    while (nombre.length() < 2 || nombre.length() > 30) {
      System.out.println("El nombre de la habitación debe tener entre 2 y 30 caracteres");
      System.out.print(prompt);
      nombre = input.next().toUpperCase().trim();
    }

    return nombre;
  }

  private static void validarNombreHabitacionUnico(int index) {
    for (int j = 0; j < index; j++) {
      while (nombreHabitacion[index].equals(nombreHabitacion[j])) {
        System.out.println("El nombre de la habitación ya existe");
        nombreHabitacion[index] = validarNombreHabitacion("Ingrese el nombre de la habitación: ");
      }
    }
  }

  private static char validarTipoHabitacion(String prompt) {
    char tipo = input.next().toUpperCase().charAt(0);

    while (tipo != 'S' && tipo != 'D' && tipo != 'T') {
      System.out.println("El tipo de habitación debe ser S, D o T");
      System.out.print(prompt);
      tipo = input.next().toUpperCase().charAt(0);
    }

    return tipo;
  }

  private static void seleccionarServicios(int index) {
    System.out.println("\nTipos de servicios");
    for (int j = 0; j < tiposServicios.length; j++) {
      System.out.println((j + 1) + ". " + tiposServicios[j]);
    }

    for (int j = 0; j < nTotalServicios[index]; j++) {
      System.out.print("Ingrese el tipo de servicio " + (j + 1) + ": ");
      serviciosSeleccionados[j] = validarEnteroPositivoEntre(1, 10, "Ingrese el tipo de servicio " + (j + 1) + ": ");

      validarServicioUnico(index, j);

      serviciosPorHabitacion[index][j] = serviciosSeleccionados[j];
    }

    System.out.println("\nServicios seleccionados para la habitación");
    for (int j = 0; j < nTotalServicios[index]; j++) {
      System.out.println((j + 1) + ". " + tiposServicios[serviciosSeleccionados[j] - 1]);
    }
  }

  private static void validarServicioUnico(int index, int j) {
    for (int k = 0; k < j; k++) {
      while (serviciosSeleccionados[k] == serviciosSeleccionados[j]) {
        System.out.println("El tipo de servicio ya fue seleccionado");
        serviciosSeleccionados[k] = validarEnteroPositivoEntre(1, 10, "Ingrese el tipo de servicio " + (k + 1) + ": ");
      }
    }
  }

  private static void calcularMontoHabitacion(int index) {
    switch (tipoHabitacion[index]) {
      case 'S':
        if (nTotalServicios[index] == 0) {
          montoHabitacion[index] = 100;
        } else {
          montoHabitacion[index] = 100 + (nTotalServicios[index] * 50);
        }
        break;
      case 'D':
        if (nTotalServicios[index] == 0) {
          montoHabitacion[index] = 150;
        } else {
          montoHabitacion[index] = 150 + (nTotalServicios[index] * 50);
        }
        break;
      case 'T':
        if (nTotalServicios[index] == 0) {
          montoHabitacion[index] = 250;
        } else {
          montoHabitacion[index] = 250 + (nTotalServicios[index] * 50);
        }
        break;
    }
  }

  /**
   * Displays a report of the hotel room data that has been entered into the
   * system.
   */
  public static void reportarDatos() {
    limpiarPantalla();

    if (cantidadHabitaciones == 0) {
      System.out.println("\nNo se han ingresado datos");
    } else {
      StringBuilder report = new StringBuilder();
      report.append("\nReporte de habitaciones\n");

      for (int i = 0; i < cantidadHabitaciones; i++) {
        report.append("\nHabitación ").append(i + 1).append(": ");
        report.append("\n- Id de la habitación: ").append(idHabitacion[i]);
        report.append("\n- Nombre de la habitación: ").append(nombreHabitacion[i]);
        report.append("\n- Tipo de habitación: ").append(tipoHabitacion[i]);
        report.append("\n- Estado de la habitación: ").append(estado[i]);
        report.append("\n- Número total de servicios: ").append(nTotalServicios[i]);
        report.append("\n- Servicios seleccionados: ");

        for (int j = 0; j < nTotalServicios[i]; j++) {
          String service = tiposServicios[serviciosPorHabitacion[i][j] - 1];
          report.append("\n  ").append(j + 1).append(". ").append(service).append(" $50");
        }

        report.append("\n- Costo de la habitación: ").append(montoHabitacion[i]);
      }

      System.out.println(report.toString());
    }
  }

  public static void agregarDatos() {
    if (cantidadHabitaciones == 100) {
      System.out.println("\nNo se pueden ingresar más datos");
    } else {
      ingresarDatosHabitacion(cantidadHabitaciones);

      cantidadHabitaciones++;

      mensaje(true);
    }
  }

  public static void modificarDatos() {
    if (cantidadHabitaciones == 0) {
      mensaje(false);
    } else {
      System.out.print("\nIngrese el Id de la habitación a modificar (2 dígitos): ");
      int id = input.nextInt();

      while (id < 10 || id > 99) {
        System.out.println("El Id de la habitación debe ser mayor o igual a 10 y menor a 100");
        System.out.print("Ingrese el Id de la habitación (2 dígitos): ");
        id = input.nextInt();
      }

      int i = 0;
      while (i < cantidadHabitaciones && id != idHabitacion[i]) {
        i++;
      }

      if (i == cantidadHabitaciones) {
        System.out.println("\nEl Id de la habitación no existe");
      } else {
        System.out.println("\n- Id de la habitación: " + idHabitacion[i]);
        System.out.println("- Nombre de la habitación: " + nombreHabitacion[i]);
        System.out.println("- Tipo de habitación: " + tipoHabitacion[i]);
        System.out.println("- Estado de la habitación: " + estado[i]);
        System.out.println("- Número total de servicios: " + nTotalServicios[i]);
        System.out.println("- Servicios seleccionados: ");
        for (int j = 0; j < nTotalServicios[i]; j++) {
          System.out.println((j + 1) + ". " + tiposServicios[serviciosPorHabitacion[i][j] - 1] + " $50");
        }
        System.out.println("- Costo de la habitación: " + montoHabitacion[i]);

        System.out.print("\nIngrese el nuevo nombre de la habitación: ");
        nombreHabitacion[i] = input.next().toUpperCase().trim();

        while (nombreHabitacion[i].length() < 2 || nombreHabitacion[i].length() > 30) {
          System.out.println("El nombre de la habitación debe tener entre 2 y 30 caracteres");
          System.out.print("Ingrese el nuevo nombre de la habitación: ");
          nombreHabitacion[i] = input.next().toUpperCase().trim();
        }

        for (int j = 0; j < cantidadHabitaciones; j++) {
          while (nombreHabitacion[i].equals(nombreHabitacion[j]) && i != j) {
            System.out.println("El nombre de la habitación ya existe");
            System.out.print("Ingrese el nuevo nombre de la habitación: ");
            nombreHabitacion[i] = input.next().toUpperCase().trim();
          }
        }

        System.out.print("Ingrese el nuevo tipo de habitación (S = simple, D = doble, T = triple): ");
        tipoHabitacion[i] = input.next().toUpperCase().charAt(0);

        while (tipoHabitacion[i] != 'S' && tipoHabitacion[i] != 'D' && tipoHabitacion[i] != 'T') {
          System.out.println("El tipo de habitación debe ser S, D o T");
          System.out.print("Ingrese el nuevo tipo de habitación (S = simple, D = doble, T = triple): ");
          tipoHabitacion[i] = input.next().toUpperCase().charAt(0);
        }

        System.out.print("Ingrese el número total de servicios: ");
        nTotalServicios[i] = input.nextInt();

        while (nTotalServicios[i] < 0 || nTotalServicios[i] > 10) {
          System.out.println("El número total de servicios debe ser mayor o igual a 0 y menor a 10");
          System.out.print("Ingrese el número total de servicios: ");
          nTotalServicios[i] = input.nextInt();
        }

        if (nTotalServicios[i] > 0) {
          System.out.println("\nTipos de servicios");
          for (int j = 0; j < tiposServicios.length; j++) {
            System.out.println((j + 1) + ". " + tiposServicios[j]);
          }

          for (int j = 0; j < nTotalServicios[i]; j++) {
            System.out.print("Ingrese el tipo de servicio " + (j + 1) + ": ");
            serviciosSeleccionados[j] = input.nextInt();

            while (serviciosSeleccionados[j] < 1 || serviciosSeleccionados[j] > 10) {
              System.out.println("El tipo de servicio debe ser mayor o igual a 1 y menor o igual a 10");
              System.out.print("Ingrese el tipo de servicio " + (j + 1) + ": ");
              serviciosSeleccionados[j] = input.nextInt();
            }

            for (int k = 0; k < j; k++) {
              while (serviciosSeleccionados[k] == serviciosSeleccionados[j]) {
                System.out.println("El tipo de servicio ya fue seleccionado");
                System.out.print("Ingrese el tipo de servicio " + (k + 1) + ": ");
                serviciosSeleccionados[k] = input.nextInt();

                while (serviciosSeleccionados[k] < 1 || serviciosSeleccionados[k] > 10) {
                  System.out.println("El tipo de servicio debe ser mayor o igual a 1 y menor o igual a 10");
                  System.out.print("Ingrese el tipo de servicio " + (k + 1) + ": ");
                  serviciosSeleccionados[k] = input.nextInt();
                }
              }
            }
          }

          // almacenar los servicios seleccionados en el arreglo serviciosPorHabitacion
          for (int j = 0; j < nTotalServicios[i]; j++) {
            serviciosPorHabitacion[i][j] = serviciosSeleccionados[j];
          }

          System.out.println("\nServicios seleccionados para la habitación " + (cantidadHabitaciones + 1));
          for (int j = 0; j < nTotalServicios[i]; j++) {
            System.out.println((j + 1) + ". " + tiposServicios[serviciosSeleccionados[j] - 1]);
          }
        }

        switch (tipoHabitacion[i]) {
          case 'S':
            // si hay 0 servicios, el monto de cada habitación simple es 100
            if (nTotalServicios[i] == 0) {
              montoHabitacion[i] = 100;
            } else {
              // si hay 1 o más servicios, el monto de cada habitación simple es 100 + 50 por
              // cada servicio
              montoHabitacion[i] = 100 + (nTotalServicios[i] * 50);
            }
            break;
          case 'D':
            // si hay 0 servicios, el monto de cada habitación doble es 150
            if (nTotalServicios[i] == 0) {
              montoHabitacion[i] = 150;
            } else {
              // si hay 1 o más servicios, el monto de cada habitación doble es 150 + 50 por
              // cada servicio
              montoHabitacion[i] = 150 + (nTotalServicios[i] * 50);
            }
            break;
          case 'T':
            // si hay 0 servicios, el monto de cada habitación triple es 250
            if (nTotalServicios[i] == 0) {
              montoHabitacion[i] = 250;
            } else {
              // si hay 1 o más servicios, el monto de cada habitación triple es 250 + 50 por
              // cada servicio
              montoHabitacion[i] = 250 + (nTotalServicios[i] * 50);
            }
            break;
        }

        reportarDatos();
      }
    }
  }

  public static void eliminarDatos() {
    if (cantidadHabitaciones == 0) {
      mensaje(false);
    } else {
      System.out.print("\nIngrese el Nombre de la habitación a eliminar: ");
      String nombre = input.next().toUpperCase().trim();

      while (nombre.length() < 2 || nombre.length() > 30) {
        System.out.println("El nombre de la habitación debe tener entre 2 y 30 caracteres");
        System.out.print("Ingrese el Nombre de la habitación a eliminar: ");
        nombre = input.next().toUpperCase().trim();
      }

      int i = 0;

      while (i < cantidadHabitaciones && !nombre.equals(nombreHabitacion[i])) {
        i++;
      }

      if (i == cantidadHabitaciones) {
        System.out.println("\nEl nombre de la habitación no existe");
      } else {
        for (int j = i; j < cantidadHabitaciones - 1; j++) {
          idHabitacion[j] = idHabitacion[j + 1];
          nombreHabitacion[j] = nombreHabitacion[j + 1];
          tipoHabitacion[j] = tipoHabitacion[j + 1];
          estado[j] = estado[j + 1];
          nTotalServicios[j] = nTotalServicios[j + 1];
          montoHabitacion[j] = montoHabitacion[j + 1];
        }

        cantidadHabitaciones--;

        System.out.println("\nHabitación eliminada");

        reportarDatos();
      }
    }
  }

  public static void consultarPorNombreHabitacion() {
    if (cantidadHabitaciones == 0) {
      mensaje(false);
    } else {
      System.out.print("\nIngrese el nombre de la habitación a consultar: ");
      String nombre = input.next().toUpperCase().trim();

      while (nombre.length() < 2 || nombre.length() > 30) {
        System.out.println("El nombre de la habitación debe tener entre 2 y 30 caracteres");
        System.out.print("Ingrese el nombre de la habitación a consultar: ");
        nombre = input.next().toUpperCase().trim();
      }

      int i = 0;
      while (i < cantidadHabitaciones && !nombre.equals(nombreHabitacion[i])) {
        i++;
      }

      if (i == cantidadHabitaciones) {
        System.out.println("\nEl nombre de la habitación no existe");
      } else {
        System.out.println("\n- Id de la habitación: " + idHabitacion[i]);
        System.out.println("- Nombre de la habitación: " + nombreHabitacion[i]);
        System.out.println("- Tipo de habitación: " + tipoHabitacion[i]);
        System.out.println("- Estado de la habitación: " + estado[i]);
        System.out.println("- Número total de servicios: " + nTotalServicios[i]);
        System.out.println("- Servicios seleccionados: ");
        for (int j = 0; j < nTotalServicios[i]; j++) {
          System.out.println((j + 1) + ". " + tiposServicios[serviciosPorHabitacion[i][j] - 1] + " $50");
        }
        System.out.println("- Costo de la habitación: " + montoHabitacion[i]);
      }
    }
  }

  public static void consultarPorIdHabitacion() {
    if (cantidadHabitaciones == 0) {
      mensaje(false);
    } else {
      System.out.print("\nIngrese el Id de la habitación a consultar (2 dígitos): ");
      int id = input.nextInt();

      while (id < 10 || id > 99) {
        System.out.println("El Id de la habitación debe ser mayor o igual a 10 y menor a 100");
        System.out.print("Ingrese el Id de la habitación (2 dígitos): ");
        id = input.nextInt();
      }

      int i = 0;
      while (i < cantidadHabitaciones && id != idHabitacion[i]) {
        i++;
      }

      if (i == cantidadHabitaciones) {
        System.out.println("\nEl Id de la habitación no existe");
      } else {
        System.out.println("\n- Id de la habitación: " + idHabitacion[i]);
        System.out.println("- Nombre de la habitación: " + nombreHabitacion[i]);
        System.out.println("- Tipo de habitación: " + tipoHabitacion[i]);
        System.out.println("- Estado de la habitación: " + estado[i]);
        System.out.println("- Número total de servicios: " + nTotalServicios[i]);
        System.out.println("- Servicios seleccionados: ");
        for (int j = 0; j < nTotalServicios[i]; j++) {
          System.out.println((j + 1) + ". " + tiposServicios[serviciosPorHabitacion[i][j] - 1] + " $50");
        }
        System.out.println("- Costo de la habitación: " + montoHabitacion[i]);
      }
    }
  }

  public static void ordenarAlfabeticamentePorNombreHabitacion() {
    limpiarPantalla();

    if (cantidadHabitaciones == 0) {
      mensaje(false);
    } else {
      for (int i = 0; i < cantidadHabitaciones - 1; i++) {
        for (int j = 0; j < cantidadHabitaciones - i - 1; j++) {
          if (nombreHabitacion[j].compareTo(nombreHabitacion[j + 1]) > 0) {
            int auxId = idHabitacion[j];
            idHabitacion[j] = idHabitacion[j + 1];
            idHabitacion[j + 1] = auxId;

            String auxNombre = nombreHabitacion[j];
            nombreHabitacion[j] = nombreHabitacion[j + 1];
            nombreHabitacion[j + 1] = auxNombre;

            char auxTipo = tipoHabitacion[j];
            tipoHabitacion[j] = tipoHabitacion[j + 1];
            tipoHabitacion[j + 1] = auxTipo;

            char auxEstado = estado[j];
            estado[j] = estado[j + 1];
            estado[j + 1] = auxEstado;

            int auxNTotalServicios = nTotalServicios[j];
            nTotalServicios[j] = nTotalServicios[j + 1];
            nTotalServicios[j + 1] = auxNTotalServicios;

            double auxmontoHabitacion = montoHabitacion[j];
            montoHabitacion[j] = montoHabitacion[j + 1];
            montoHabitacion[j + 1] = auxmontoHabitacion;
          }
        }
      }

      System.out.println("\nHabitaciones ordenadas alfabéticamente");

      reportarDatos();
    }
  }

  public static void ordenarDescendentementePorIdHabitacion() {
    limpiarPantalla();

    if (cantidadHabitaciones == 0) {
      mensaje(false);
    } else {
      for (int i = 0; i < cantidadHabitaciones - 1; i++) {
        for (int j = 0; j < cantidadHabitaciones - i - 1; j++) {
          if (idHabitacion[j] < idHabitacion[j + 1]) {
            int auxId = idHabitacion[j];
            idHabitacion[j] = idHabitacion[j + 1];
            idHabitacion[j + 1] = auxId;

            String auxNombre = nombreHabitacion[j];
            nombreHabitacion[j] = nombreHabitacion[j + 1];
            nombreHabitacion[j + 1] = auxNombre;

            char auxTipo = tipoHabitacion[j];
            tipoHabitacion[j] = tipoHabitacion[j + 1];
            tipoHabitacion[j + 1] = auxTipo;

            char auxEstado = estado[j];
            estado[j] = estado[j + 1];
            estado[j + 1] = auxEstado;

            int auxNTotalServicios = nTotalServicios[j];
            nTotalServicios[j] = nTotalServicios[j + 1];
            nTotalServicios[j + 1] = auxNTotalServicios;

            double auxmontoHabitacion = montoHabitacion[j];
            montoHabitacion[j] = montoHabitacion[j + 1];
            montoHabitacion[j + 1] = auxmontoHabitacion;
          }
        }
      }

      System.out.println("\nHabitaciones ordenadas descendentemente por Id");

      reportarDatos();
    }
  }

  public static void reservarHabitacion() {
    limpiarPantalla();

    if (cantidadHabitaciones == 0) {
      mensaje(false);
    } else {
      System.out.println("\nIngrese el tipo de habitación que desea (S: Simple, D: Doble, T: Triple): ");
      char tipoHabitacionDeseada = input.next().toUpperCase().charAt(0);

      while (tipoHabitacionDeseada != 'S' && tipoHabitacionDeseada != 'D' && tipoHabitacionDeseada != 'T') {
        System.out.println("\nTipo de habitación inválido");
        System.out.println("\nIngrese el tipo de habitación que desea (S: Simple, D: Doble, T: Triple): ");
        tipoHabitacionDeseada = input.next().toUpperCase().charAt(0);
      }

      System.out.println("\nIngrese la fecha de reserva (dd/mm/yyyy): ");
      String fechaReserva = input.next();

      int habitacionesDisponibles = 0;
      for (int i = 0; i < cantidadHabitaciones; i++) {
        if (tipoHabitacion[i] == tipoHabitacionDeseada && estado[i] == 'L') {
          System.out.println("\nId de la habitación: " + idHabitacion[i]);
          System.out.println("Nombre de la habitación: " + nombreHabitacion[i]);
          System.out.println("Tipo de habitación: " + tipoHabitacion[i]);
          System.out.println("Estado de la habitación: " + estado[i]);
          System.out.println("Número total de servicios: " + nTotalServicios[i]);
          System.out.println("Costo de la habitación: " + montoHabitacion[i]);
          habitacionesDisponibles++;
        }
      }

      if (habitacionesDisponibles == 0) {
        System.out.println("\nNo hay habitaciones disponibles para el tipo de habitación deseada");
      } else {
        int idHabitacionDeseada = 0;
        boolean idValido = false;
        while (!idValido) {
          System.out.println("\nIngrese el Id de la habitación deseada: ");
          idHabitacionDeseada = input.nextInt();

          int i = 0;
          while (i < cantidadHabitaciones && (idHabitacion[i] != idHabitacionDeseada
              || tipoHabitacion[i] != tipoHabitacionDeseada || estado[i] != 'L')) {
            i++;
          }

          if (i == cantidadHabitaciones) {
            System.out.println("\nEl Id de la habitación no existe");
          } else {
            idValido = true;
            estado[i] = 'O';

            costoHabitacion[i] += montoHabitacion[i];

            System.out.println("\nIngrese el nombre del cliente: ");
            nombreCliente[i] = input.next();
            System.out.println("\nIngrese la ciudad de origen del cliente: ");
            ciudadOrigen[i] = input.next();

            System.out.println("\nReserva realizada con éxito");
            System.out.println("\nId de la habitación: " + idHabitacion[i]);
            System.out.println("Nombre de la habitación: " + nombreHabitacion[i]);
            System.out.println("Tipo de habitación: " + tipoHabitacion[i]);
            System.out.println("Estado de la habitación: " + estado[i]);
            System.out.println("Número total de servicios: " + nTotalServicios[i]);
            System.out.println("Nombre del cliente: " + nombreCliente[i]);
            System.out.println("Ciudad de origen del cliente: " + ciudadOrigen[i]);
            System.out.println("Costo de la habitación: " + costoHabitacion[i]);
            System.out.println("Fecha de reserva: " + fechaReserva);
          }
        }
      }
    }
  }

  public static void finDeServicio() {
    limpiarPantalla();

    if (cantidadHabitaciones == 0) {
      mensaje(false);
    } else {
      System.out.println("\nIngrese el Id de la habitación: ");
      int idHabitacionDeseada = input.nextInt();

      int i = 0;
      while (i < cantidadHabitaciones && idHabitacion[i] != idHabitacionDeseada) {
        i++;
      }

      if (i == cantidadHabitaciones) {
        System.out.println("\nEl Id de la habitación no existe");
      } else {
        if (estado[i] == 'L') {
          System.out.println("\nLa habitación no está ocupada");
        } else {
          estado[i] = 'L';

          // Se calcula el costo final solo de la habitación que se liberó
          for (int j = 0; j < cantidadHabitaciones; j++) {
            if (idHabitacion[j] == idHabitacionDeseada) {
              costoFinal += costoHabitacion[j];
            }
          }

          System.out.println("\nFin de servicio realizado con éxito");
          System.out.println("\nId de la habitación: " + idHabitacion[i]);
          System.out.println("Nombre de la habitación: " + nombreHabitacion[i]);
          System.out.println("Nombre del cliente: " + nombreCliente[i]);
          System.out.println("Ciudad de origen del cliente: " + ciudadOrigen[i]);
          System.out.println("Cantidad de servicios: " + nTotalServicios[i]);
          System.out.println("Monto pagado: " + costoHabitacion[i]);
          System.out.println("Monto total recaudado: " + costoFinal);
        }
      }
    }
  }

  public static void mensaje(boolean condicion) {
    if (condicion) {
      System.out.println("\nDatos ingresados correctamente");
    } else {
      System.out.println("\nNo hay datos ingresados");
    }
  }

}
