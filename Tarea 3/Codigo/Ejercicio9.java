/* Un hombre desea saber cuánto dinero se genera por concepto de intereses con la cantidad que
tiene depositada en el banco. El decidirá reinvertir los intereses solo si superan a $1000, y en ese
caso desea saber cuánto dinero tendrá finalmente en su cuenta. Ingrese cantidad de dinero
depositada y porcentaje de interés que le paga el banco. Debe reportar si decide reinvertir los
intereses o No. Y cuanto dinero tendrá en su cuenta en total. */

// importamos la libreria Scanner
import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    // creamos un objeto de tipo Scanner
    Scanner sc = new Scanner(System.in);

    // variables
    double dinero, interes, intereses, total;

    // pedimos los datos al usuario
    System.out.print("Ingrese el dinero depositado: ");
    dinero = sc.nextDouble();

    System.out.print("Ingrese el porcentaje de interes: ");
    interes = sc.nextDouble();

    // validamos los datos
    if (dinero > 0 && interes > 0) {
      // calculamos los intereses
      intereses = dinero * (interes / 100);

      // validamos si los intereses son mayores a 1000
      if (intereses > 1000) {
        // calculamos el total
        total = dinero + intereses;

        // mostramos el resultado
        System.out.println("Se reinvertiran los intereses");
        System.out.println("El total es: " + total);
      } else {
        // mostramos el resultado
        System.out.println("No se reinvertiran los intereses");
        System.out.println("El total es: " + dinero);
      }
    } else {
      System.out.println("Los datos ingresados no son validos");
    }

    // cerramos el objeto Scanner
    sc.close();
  }
}