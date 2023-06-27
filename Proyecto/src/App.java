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
  static int[] idHabitacion = new int[100];
  static String[] nombreHabitacion = new String[100];
  static char[] tipoHabitacion = new char[100];
  static char[] estado = new char[100];
  static int[] nTotalServicios = new int[100];
  static double[] montoHabitacion = new double[100];
  static double[] ingresoTotalHabitacion = new double[100];
  static String[] nombreCliente = new String[100];
  static String[] ciudadOrigen = new String[100];
  static double[] costoHabitacion = new double[100];
  static String[] fecha = new String[100];
  static int cantidadHabitaciones = 0;
  static int costoFinal = 0;

  public static void main(String[] args) throws Exception {
    boolean salir = false;

    while (!salir) {
      System.out.println("\nSistema de reserva de un hotel");
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
      int opcion = input.nextInt();

      switch (opcion) {
        case 1:
          if (cantidadHabitaciones == 0) {
            cantidadHabitaciones = ingresarDatos(cantidadHabitaciones);
          } else {
            System.out.println("\nLos datos ya han sido ingresados");
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
          // finDeServicio();
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

  public static int ingresarDatos(int cantidadHabitaciones) {
    System.out.print("\nIngrese la cantidad de habitaciones que desea ingresar: ");
    cantidadHabitaciones = input.nextInt();

    while (cantidadHabitaciones < 1 || cantidadHabitaciones > 100) {
      System.out.println("La cantidad de habitaciones debe ser mayor a 0 y menor a 100");
      System.out.print("Ingrese la cantidad de habitaciones que desea ingresar: ");
      cantidadHabitaciones = input.nextInt();
    }

    for (int i = 0; i < cantidadHabitaciones; i++) {
      System.out.print("\nIngrese el Id de la habitación (2 dígitos): ");
      idHabitacion[i] = input.nextInt();

      while (idHabitacion[i] < 10 || idHabitacion[i] > 99) {
        System.out.println("El Id de la habitación debe ser mayor o igual a 10 y menor a 100");
        System.out.print("Ingrese el Id de la habitación (2 dígitos): ");
        idHabitacion[i] = input.nextInt();
      }

      for (int j = 0; j < i; j++) {
        while (idHabitacion[i] == idHabitacion[j]) {
          System.out.println("El Id de la habitación ya existe");
          System.out.print("Ingrese el Id de la habitación (2 dígitos): ");
          idHabitacion[i] = input.nextInt();
        }
      }

      System.out.print("Ingrese el nombre de la habitación: ");
      nombreHabitacion[i] = input.next().toUpperCase().trim();

      while (nombreHabitacion[i].length() < 2 || nombreHabitacion[i].length() > 30) {
        System.out.println("El nombre de la habitación debe tener entre 2 y 30 caracteres");
        System.out.print("Ingrese el nombre de la habitación: ");
        nombreHabitacion[i] = input.next().toUpperCase().trim();
      }

      for (int j = 0; j < i; j++) {
        while (nombreHabitacion[i].equals(nombreHabitacion[j])) {
          System.out.println("El nombre de la habitación ya existe");
          System.out.print("Ingrese el nombre de la habitación: ");
          nombreHabitacion[i] = input.next().toUpperCase().trim();
        }
      }

      System.out.print("Ingrese el tipo de habitación (S = simple, D = doble, T = triple): ");
      tipoHabitacion[i] = input.next().toUpperCase().charAt(0);

      while (tipoHabitacion[i] != 'S' && tipoHabitacion[i] != 'D' && tipoHabitacion[i] != 'T') {
        System.out.println("El tipo de habitación debe ser S, D o T");
        System.out.print("Ingrese el tipo de habitación (S = simple, D = doble, T = triple): ");
        tipoHabitacion[i] = input.next().toUpperCase().charAt(0);
      }

      System.out.print("Ingrese el estado de la habitación (L = libre, O = ocupada): ");
      estado[i] = input.next().toUpperCase().charAt(0);

      while (estado[i] != 'L' && estado[i] != 'O') {
        System.out.println("El estado de la habitación debe ser L u O");
        System.out.print("Ingrese el estado de la habitación (L = libre, O = ocupada): ");
        estado[i] = input.next().toUpperCase().charAt(0);
      }

      System.out.print("Ingrese el número total de servicios: ");
      nTotalServicios[i] = input.nextInt();

      while (nTotalServicios[i] < 0 || nTotalServicios[i] > 100) {
        System.out.println("El número total de servicios debe ser mayor o igual a 0 y menor a 100");
        System.out.print("Ingrese el número total de servicios: ");
        nTotalServicios[i] = input.nextInt();
      }

      switch (tipoHabitacion[i]) {
        case 'S':
          montoHabitacion[i] = 100;
          break;
        case 'D':
          montoHabitacion[i] = 150;
          break;
        case 'T':
          montoHabitacion[i] = 250;
          break;
      }
    }

    return cantidadHabitaciones;
  }

  public static void reportarDatos() {
    if (cantidadHabitaciones == 0) {
      System.out.println("\nNo hay datos ingresados");
    } else {
      for (int i = 0; i < cantidadHabitaciones; i++) {
        System.out.println("\nId de la habitación: " + idHabitacion[i]);
        System.out.println("Nombre de la habitación: " + nombreHabitacion[i]);
        System.out.println("Tipo de habitación: " + tipoHabitacion[i]);
        System.out.println("Estado de la habitación: " + estado[i]);
        System.out.println("Número total de servicios: " + nTotalServicios[i]);
        System.out.println("Costo de la habitación: " + montoHabitacion[i]);
      }
    }
  }

  public static void agregarDatos() {
    if (cantidadHabitaciones == 100) {
      System.out.println("\nNo se pueden ingresar más datos");
    } else {
      System.out.print("\nIngrese el Id de la habitación (2 dígitos): ");
      idHabitacion[cantidadHabitaciones] = input.nextInt();

      while (idHabitacion[cantidadHabitaciones] < 10 || idHabitacion[cantidadHabitaciones] > 99) {
        System.out.println("El Id de la habitación debe ser mayor o igual a 10 y menor a 100");
        System.out.print("Ingrese el Id de la habitación (2 dígitos): ");
        idHabitacion[cantidadHabitaciones] = input.nextInt();
      }

      for (int i = 0; i < cantidadHabitaciones; i++) {
        while (idHabitacion[cantidadHabitaciones] == idHabitacion[i]) {
          System.out.println("El Id de la habitación ya existe");
          System.out.print("Ingrese el Id de la habitación (2 dígitos): ");
          idHabitacion[cantidadHabitaciones] = input.nextInt();
        }
      }

      System.out.print("Ingrese el nombre de la habitación: ");
      nombreHabitacion[cantidadHabitaciones] = input.next().toUpperCase().trim();

      while (nombreHabitacion[cantidadHabitaciones].length() < 2
          || nombreHabitacion[cantidadHabitaciones].length() > 30) {
        System.out.println("El nombre de la habitación debe tener entre 2 y 30 caracteres");
        System.out.print("Ingrese el nombre de la habitación: ");
        nombreHabitacion[cantidadHabitaciones] = input.next().toUpperCase().trim();
      }

      for (int i = 0; i < cantidadHabitaciones; i++) {
        while (nombreHabitacion[cantidadHabitaciones].equals(nombreHabitacion[i])) {
          System.out.println("El nombre de la habitación ya existe");
          System.out.print("Ingrese el nombre de la habitación: ");
          nombreHabitacion[cantidadHabitaciones] = input.next().toUpperCase().trim();
        }
      }

      System.out.print("Ingrese el tipo de habitación (S = simple, D = doble, T = triple): ");
      tipoHabitacion[cantidadHabitaciones] = input.next().toUpperCase().charAt(0);

      while (tipoHabitacion[cantidadHabitaciones] != 'S' && tipoHabitacion[cantidadHabitaciones] != 'D'
          && tipoHabitacion[cantidadHabitaciones] != 'T') {
        System.out.println("El tipo de habitación debe ser S, D o T");
        System.out.print("Ingrese el tipo de habitación (S = simple, D = doble, T = triple): ");
        tipoHabitacion[cantidadHabitaciones] = input.next().toUpperCase().charAt(0);
      }

      System.out.print("Ingrese el estado de la habitación (L = libre, O = ocupada): ");
      estado[cantidadHabitaciones] = input.next().toUpperCase().charAt(0);

      while (estado[cantidadHabitaciones] != 'L' && estado[cantidadHabitaciones] != 'O') {
        System.out.println("El estado de la habitación debe ser L u O");
        System.out.print("Ingrese el estado de la habitación (L = libre, O = ocupada): ");
        estado[cantidadHabitaciones] = input.next().toUpperCase().charAt(0);
      }

      System.out.print("Ingrese el número total de servicios: ");
      nTotalServicios[cantidadHabitaciones] = input.nextInt();

      while (nTotalServicios[cantidadHabitaciones] < 0 || nTotalServicios[cantidadHabitaciones] > 100) {
        System.out.println("El número total de servicios debe ser mayor o igual a 0 y menor a 100");
        System.out.print("Ingrese el número total de servicios: ");
        nTotalServicios[cantidadHabitaciones] = input.nextInt();
      }

      switch (tipoHabitacion[cantidadHabitaciones]) {
        case 'S':
          montoHabitacion[cantidadHabitaciones] = 100;
          break;
        case 'D':
          montoHabitacion[cantidadHabitaciones] = 150;
          break;
        case 'T':
          montoHabitacion[cantidadHabitaciones] = 250;
          break;
      }

      cantidadHabitaciones++;
    }
  }

  public static void modificarDatos() {
    if (cantidadHabitaciones == 0) {
      System.out.println("\nNo hay datos ingresados");
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
        System.out.println("\nId de la habitación: " + idHabitacion[i]);
        System.out.println("Nombre de la habitación: " + nombreHabitacion[i]);
        System.out.println("Tipo de habitación: " + tipoHabitacion[i]);
        System.out.println("Estado de la habitación: " + estado[i]);
        System.out.println("Número total de servicios: " + nTotalServicios[i]);
        System.out.println("Costo de la habitación: " + montoHabitacion[i]);

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
      }
    }
  }

  public static void eliminarDatos() {
    if (cantidadHabitaciones == 0) {
      System.out.println("\nNo hay datos ingresados");
    } else {
      System.out.print("\nIngrese el Id de la habitación a eliminar (2 dígitos): ");
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
      } else if (estado[i] == 'O') {
        System.out.println("\nLa habitación no se puede eliminar porque está ocupada");
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
      }
    }
  }

  public static void consultarPorNombreHabitacion() {
    if (cantidadHabitaciones == 0) {
      System.out.println("\nNo hay datos ingresados");
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
        System.out.println("\nId de la habitación: " + idHabitacion[i]);
        System.out.println("Nombre de la habitación: " + nombreHabitacion[i]);
        System.out.println("Tipo de habitación: " + tipoHabitacion[i]);
        System.out.println("Estado de la habitación: " + estado[i]);
        System.out.println("Número total de servicios: " + nTotalServicios[i]);
        System.out.println("Costo de la habitación: " + montoHabitacion[i]);
      }
    }
  }

  public static void consultarPorIdHabitacion() {
    if (cantidadHabitaciones == 0) {
      System.out.println("\nNo hay datos ingresados");
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
        System.out.println("\nId de la habitación: " + idHabitacion[i]);
        System.out.println("Nombre de la habitación: " + nombreHabitacion[i]);
        System.out.println("Tipo de habitación: " + tipoHabitacion[i]);
        System.out.println("Estado de la habitación: " + estado[i]);
        System.out.println("Número total de servicios: " + nTotalServicios[i]);
        System.out.println("Costo de la habitación: " + montoHabitacion[i]);
      }
    }
  }

  public static void ordenarAlfabeticamentePorNombreHabitacion() {
    if (cantidadHabitaciones == 0) {
      System.out.println("\nNo hay datos ingresados");
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
    }
  }

  public static void ordenarDescendentementePorIdHabitacion() {
    if (cantidadHabitaciones == 0) {
      System.out.println("\nNo hay datos ingresados");
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
    }
  }

  public static void reservarHabitacion() {
    if (cantidadHabitaciones == 0) {
      System.out.println("\nNo hay datos ingresados");
    } else {
      System.out.println("\nIngrese el tipo de habitación que desea (S: Simple, D: Doble, T: Triple): ");
      char tipoHabitacionDeseada = input.next().toUpperCase().charAt(0);
      System.out.println("\nIngrese la fecha de reserva (dd/mm/yyyy): "); // ejemplo: 01/01/2021
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
        System.out.println("\nIngrese el Id de la habitación deseada: ");
        int idHabitacionDeseada = input.nextInt();

        int i = 0;
        while (i < cantidadHabitaciones && idHabitacionDeseada != idHabitacion[i]) {
          i++;
        }

        if (i == cantidadHabitaciones) {
          System.out.println("\nEl Id de la habitación no existe");
        } else {
          estado[i] = 'O';

          System.out.println("\nIngrese el nombre del cliente: ");
          String nombreCliente = input.next();
          System.out.println("\nIngrese la ciudad de origen del cliente: ");
          String ciudadOrigen = input.next();

          System.out.println("\nReserva realizada con éxito");
          System.out.println("\nId de la habitación: " + idHabitacion[i]);
          System.out.println("Nombre de la habitación: " + nombreHabitacion[i]);
          System.out.println("Tipo de habitación: " + tipoHabitacion[i]);
          System.out.println("Estado de la habitación: " + estado[i]);
          System.out.println("Número total de servicios: " + nTotalServicios[i]);
          System.out.println("Costo de la habitación: " + montoHabitacion[i]);
          System.out.println("Nombre del cliente: " + nombreCliente);
          System.out.println("Ciudad de origen del cliente: " + ciudadOrigen);
          System.out.println("Costo de la habitación: " + costoHabitacion);
          System.out.println("Fecha de reserva: " + fechaReserva);
        }
      }
    }
  }
}
