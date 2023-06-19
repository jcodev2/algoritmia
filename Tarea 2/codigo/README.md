# ALGORITMOS SELECTIVOS O CONDICIONALES 🧠

Presentar **informe**, que incluye para cada pregunta, **análisis del problema, diseño de un algoritmo utilizando diagrama N-S y código en java.**

[![Tech image](https://unsplash.com/photos/04X1Yp9hNH8/download?force=true&w=640)](https://unsplash.com/photos/04X1Yp9hNH8/download?force=true&w=640)

## Ejercicios 📝

1. [x] Leer un número N Entero positivo. Si es par reportar su cuadrado, sino reportar su cubo.

- **codigo:** [ejercicio1.java](ejercicio1.java)

```java
  // importar la clase Scanner
  import java.util.Scanner;

  public class ejercicio1 {
    public static void main(String[] args) {
      // crear un objeto Scanner
      Scanner sc = new Scanner(System.in);

      // declarar variables
      int n;

      // leer un número entero
      System.out.print("Ingrese un número entero: ");
      n = sc.nextInt();

      // verificar si positivo
      if (n > 0) {
        // verificar si es par
        if (n % 2 == 0) {
          System.out.println("El cuadrado de " + n + " es " + (n * n));
        } else {
          System.out.println("El cubo de " + n + " es " + (n * n * n));
        }
      } else {
        System.out.println("El número es negativo o cero");
      }

      // cerrar el objeto Scanner
      sc.close();
    }
  }
```

- **salida:**

```bash
  Ingrese un número entero: 4
  El cuadrado de 4 es 16

  Ingrese un número entero: 5
  El cubo de 5 es 125
```

2. [x] Leer un numero entero N. Si es positivo, calcular su cuadrado y su cubo. Sino escribir un mensaje: “El número es negativo o cero”.

- **codigo:** [ejercicio2.java](ejercicio2.java)

```java
  // importar la clase Scanner
  import java.util.Scanner;

  public class ejercicio2 {
    public static void main(String[] args) {
      // crear un objeto Scanner
      Scanner sc = new Scanner(System.in);

      // declarar variables
      int n;

      // leer un número entero
      System.out.print("Ingrese un número entero: ");
      n = sc.nextInt();

      // verificar si es positivo
      if (n > 0) {
        System.out.println("El cuadrado de " + n + " es " + (n * n));
        System.out.println("El cubo de " + n + " es " + (n * n * n));
      } else {
        System.out.println("El número es negativo o cero");
      }

      // cerrar el objeto Scanner
      sc.close();
    }
  }
```

- **salida:**

```bash
  Ingrese un número entero: 5
  El cuadrado de 5 es 25
  El cubo de 5 es 125
```

3. [x] Leer un N° diferente de cero. Si N es positivo calcular **2 \* N** sino calcular **5 \* N.**

- **codigo:** [ejercicio3.java](ejercicio3.java)

```java
// importar la clase Scanner
import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
    // crear un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declarar variables
    int n;

    // leer un número entero
    System.out.print("Ingrese un número entero: ");
    n = sc.nextInt();

    // verificar si es positivo
    if (n != 0) {
      if (n > 0) {
        System.out.println("2 * " + n + " = " + (2 * n));
      } else {
        System.out.println("5 * " + n + " = " + (5 * n));
      }
    } else {
      System.out.println("El número es cero");
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}
```

- **salida:**

```bash
  Ingrese un número entero: 5
  2 * 5 = 10

  Ingrese un número entero: -5
  5 * -5 = -25
```

4. [x] Leer un número entero N entero positivo. Si N es divisible entre 5 calcular **N + N**, sino calcular **N \* N.**

- **codigo:** [ejercicio4.java](ejercicio4.java)

```java
// importar la clase Scanner
import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {
    // crear un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declarar variables
    int n;

    // leer un número entero
    System.out.print("Ingrese un número entero: ");
    n = sc.nextInt();

    // verificar si es positivo
    if (n > 0) {
      if (n % 5 == 0) {
        System.out.println(n + " + " + n + " = " + (n + n));
      } else {
        System.out.println(n + " * " + n + " = " + (n * n));
      }
    } else if (n < 0) {
      System.out.println("El número es negativo");
    } else {
      System.out.println("El número es cero");
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}
```

- **salida:**

```bash
  Ingrese un número entero: 5
  5 + 5 = 10

  Ingrese un número entero: 4
  4 * 4 = 16
```

5. [x] Leer 2 edades e1 y e2. Si ambas son mayores de edad reportar el producto de las edades. Sino calcular y reportar la suma de las edades.

- **codigo:** [ejercicio5.java](ejercicio5.java)

```java
// importar la clase Scanner
import java.util.Scanner;

public class ejercicio5 {
  public static void main(String[] args) {
    // crear un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declarar variables
    int e1, e2;

    // leer un número entero
    System.out.print("Ingrese la edad 1: ");
    e1 = sc.nextInt();

    // leer un número entero
    System.out.print("Ingrese la edad 2: ");
    e2 = sc.nextInt();

    // verificar si las edades son válidas
    if (e1 > 0 && e2 > 0 && e1 < 120 && e2 < 120) {
      if (e1 >= 18 && e2 >= 18) {
        System.out.println(e1 + " * " + e2 + " = " + (e1 * e2));
      } else {
        System.out.println(e1 + " + " + e2 + " = " + (e1 + e2));
      }
    } else {
      System.out.println("Las edades no son válidas");
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}
```

- **salida:**

```bash
  Ingrese la edad 1: 18
  Ingrese la edad 2: 18
  18 * 18 = 324

  Ingrese la edad 1: 17
  Ingrese la edad 2: 17
  17 + 17 = 34
```

6. [x] Leer 2 números enteros. Si ambos son positivos calcular su suma. Si ambos son negativos calcular su producto. Sino escribir: “Error”.

- **codigo:** [ejercicio6.java](ejercicio6.java)

```java
// importar la clase Scanner
import java.util.Scanner;

public class ejercicio6 {
  public static void main(String[] args) {
    // crear un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declarar variables
    int n1, n2;

    // leer un número entero
    System.out.print("Ingrese el número 1: ");
    n1 = sc.nextInt();

    // leer un número entero
    System.out.print("Ingrese el número 2: ");
    n2 = sc.nextInt();

    // verificar si los números son válidos
    if (n1 > 0 && n2 > 0) {
      System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
    } else if (n1 < 0 && n2 < 0) {
      System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
    } else {
      System.out.println("Error");
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}
```

- **salida:**

```bash
  Ingrese el número 1: 5
  Ingrese el número 2: 5
  5 + 5 = 10

  Ingrese el número 1: -5
  Ingrese el número 2: -5
  -5 * -5 = 25
```

7. [x] Leer 2 N° enteros positivos N1 y N2 e indicar si N1 es divisible entre N2.

- **codigo:** [ejercicio7.java](ejercicio7.java)

```java
// importar la clase Scanner
import java.util.Scanner;

public class ejercicio7 {
  public static void main(String[] args) {
    // crear un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declarar variables
    int n1, n2;

    // leer un número entero
    System.out.print("Ingrese el número 1: ");
    n1 = sc.nextInt();

    // leer un número entero
    System.out.print("Ingrese el número 2: ");
    n2 = sc.nextInt();

    // verificar si son positivos
    if (n1 > 0 && n2 > 0) {
      if (n1 % n2 == 0) {
        System.out.println(n1 + " es divisible entre " + n2);
      } else {
        System.out.println(n1 + " no es divisible entre " + n2);
      }
    } else if (n1 < 0 || n2 < 0) {
      System.out.println("Los números deben ser positivos");
    } else {
      System.out.println("Los números son cero");
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}
```

- **salida:**

```bash
  Ingrese el número 1: 5
  Ingrese el número 2: 5
  5 es divisible entre 5

  Ingrese el número 1: 5
  Ingrese el número 2: 4
  5 no es divisible entre 4
```

8. [x] Leer 2 notas N1, N2. Si alguna de ellas es aprobatoria calcular y reportar su producto, sino calcular y reportar su suma.

- **codigo:** [ejercicio8.java](ejercicio8.java)

```java
// importar la clase Scanner
import java.util.Scanner;

public class ejercicio8 {
  public static void main(String[] args) {
    // crear un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declarar variables
    double n1, n2;

    // leer un número entero
    System.out.print("Ingrese la nota 1: ");
    n1 = sc.nextDouble();

    // leer un número entero
    System.out.print("Ingrese la nota 2: ");
    n2 = sc.nextDouble();

    // verificar si son positivos y menores o iguales a 20
    if (n1 > 0 && n2 > 0 && n1 <= 20 && n2 <= 20) {
      if (n1 >= 11 || n2 >= 11) {
        System.out.println("El producto de las notas es: " + n1 + " * " + n2 + " = " + (n1 * n2));
      } else {
        System.out.println("La suma de las notas es: " + n1 + " + " + n2 + " = " + (n1 + n2));
      }
    } else if (n1 < 0 || n2 < 0) {
      System.out.println("Las notas deben ser positivas");
    } else {
      System.out.println("Las notas deben ser mayores a 0 y menores o iguales a 20");
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}
```

- **salida:**

```bash
  Ingrese la nota 1: 15
  Ingrese la nota 2: 15
  El producto de las notas es: 15.0 * 15.0 = 225.0

  Ingrese la nota 1: 10
  Ingrese la nota 2: 10
  La suma de las notas es: 10.0 + 10.0 = 20.0
```

9. [x] Diseñe un algoritmo que permita leer los 3 lados de un triángulo L1,L2 y L3, y que, determine el tipo de triangulo que se tiene (Escaleno=Tres lados diferentes, Isósceles = dos lados iguales, equilátero = Tres lados iguales).

- **codigo:** [ejercicio9.java](ejercicio9.java)

```java
// importar la clase Scanner
import java.util.Scanner;

public class ejercicio9 {
  public static void main(String[] args) {
    // crear un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declarar variables
    double l1, l2, l3;

    // leer los datos
    System.out.print("Ingrese el lado 1: ");
    l1 = sc.nextDouble();
    System.out.print("Ingrese el lado 2: ");
    l2 = sc.nextDouble();
    System.out.print("Ingrese el lado 3: ");
    l3 = sc.nextDouble();

    // determinar si los datos ingresados son válidos
    if (l1 <= 0 || l2 <= 0 || l3 <= 0) {
      System.out.println("Los datos ingresados no son válidos");
    } else {
      // determinar el tipo de triángulo
      if (l1 == l2 && l2 == l3) {
        System.out.println("El triángulo es equilátero");
      } else if (l1 == l2 || l2 == l3 || l1 == l3) {
        System.out.println("El triángulo es isósceles");
      } else {
        System.out.println("El triángulo es escaleno");
      }
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}
```

- **salida:**

```bash
  Ingrese el lado 1: 5
  Ingrese el lado 2: 5
  Ingrese el lado 3: 5
  El triángulo es equilátero

  Ingrese el lado 1: 5
  Ingrese el lado 2: 5
  Ingrese el lado 3: 6
  El triángulo es isósceles

  Ingrese el lado 1: 5
  Ingrese el lado 2: 6
  Ingrese el lado 3: 7
  El triángulo es escaleno
```

10. [x] Leer 2 notas de un alumno N1, N2 y obtener su promedio, Si el alumno obtiene un promedio es ≥ 11, entonces escribir “Aprobado”, sino escribir “Desaprobado”.

- **codigo:** [ejercicio10.java](ejercicio10.java)

```java
// importar la clase Scanner
import java.util.Scanner;

public class ejercicio10 {
  public static void main(String[] args) {
    // crear un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // declarar variables
    double n1, n2, promedio;

    // leer los datos
    System.out.print("Ingrese la nota 1: ");
    n1 = sc.nextDouble();
    System.out.print("Ingrese la nota 2: ");
    n2 = sc.nextDouble();

    // determinar si los datos ingresados son válidos
    if (n1 < 0 || n1 > 20 || n2 < 0 || n2 > 20) {
      System.out.println("Los datos ingresados no son válidos");
    } else {
      // calcular el promedio
      promedio = (n1 + n2) / 2;

      // determinar si el alumno está aprobado o no
      if (promedio >= 11) {
        System.out.println("El alumno está aprobado");
      } else {
        System.out.println("El alumno está desaprobado");
      }
    }

    // cerrar el objeto Scanner
    sc.close();
  }
}
```

- **salida:**

```bash
  Ingrese la nota 1: 15
  Ingrese la nota 2: 15
  El alumno está aprobado

  Ingrese la nota 1: 10
  Ingrese la nota 2: 10
  El alumno está desaprobado
```

11. [x] Un restaurante ofrece sus ofertas de acuerdo a la siguiente escala de consumo. En todos los casos se aplica un impuesto del 18%. Determinar el importe a pagar por lo consumido, mostrando cuanto es el descuento en cada caso.

    | Consumo   | Descuento |
    | --------- | --------- |
    | 250 a más | 20%       |
    | 120 a 249 | 15%       |
    | 30 a 119  | 10%       |
    | Hasta 30  | 5%        |

- **codigo:** [ejercicio11.java](ejercicio11.java)

```java
// Importamos la clase Scanner
import java.util.Scanner;

public class ejercicio11 {
  public static void main(String[] args) {
    // Creamos un objeto Scanner
    Scanner sc = new Scanner(System.in);

    // Declaramos las variables
    double consumo, descuento, impuesto, importe;

    // Leemos los datos
    System.out.print("Ingrese el consumo: ");
    consumo = sc.nextDouble();

    // validamos los datos
    if (consumo < 0) {
      System.out.println("El consumo no puede ser negativo");
      sc.close();
      return;
    } else if (consumo == 0) {
      System.out.println("El consumo no puede ser cero");
      sc.close();
      return;
    }

    // Determinamos el descuento
    if (consumo >= 250) {
      descuento = consumo * 0.20;
    } else if (consumo >= 120) {
      descuento = consumo * 0.15;
    } else if (consumo >= 30) {
      descuento = consumo * 0.10;
    } else {
      descuento = consumo * 0.05;
    }

    // Calculamos el impuesto
    impuesto = consumo * 0.18;

    // Calculamos el importe a pagar
    importe = consumo + impuesto - descuento;

    // Mostramos el resultado
    System.out.println("El impuesto es: " + impuesto);
    System.out.println("El descuento es: " + descuento + " (" + (descuento / consumo) * 100 + "%)");
    System.out.println("El importe a pagar es: " + importe);

    // Cerramos el objeto Scanner
    sc.close();
  }
}
```

- **salida:**

```bash
  Ingrese el consumo: 250
  El impuesto es: 45.0
  El descuento es: 50.0 (20.0%)
  El importe a pagar es: 245.0

  Ingrese el consumo: 120
  El impuesto es: 21.6
  El descuento es: 18.0 (15.0%)
  El importe a pagar es: 121.6

  Ingrese el consumo: 30
  El impuesto es: 5.4
  El descuento es: 3.0 (10.0%)
  El importe a pagar es: 31.4

  Ingrese el consumo: 10
  El impuesto es: 1.8
  El descuento es: 0.5 (5.0%)
  El importe a pagar es: 11.3
```

12. [x] Una empresa tiene tres categorías de trabajadores: Funcionarios, Administrativos y Obreros. Cada uno de ellos tiene formas de pago diferentes. Un funcionario recibe 100 soles por hora. Un administrativo recibe 50 soles por hora y los obreros ganan 20 soles por hora. Ingresar la categoría del trabajador y el número de horas laboradas Determinar su sueldo neto, si sobre su sueldo básico se le descuenta el 18 % por impuestos.
    - Sueldo Básico = Pago por hora \* N° de horas Laboradas
    - Descuento = Sueldo Básico \* % Impuestos
    - Sueldo Neto = Sueldo Básico – Descuento

- **codigo:** [ejercicio12.java](ejercicio12.java)

```java
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
```

- **salida:**

```bash
  Ingrese la categoría del trabajador: Funcionario
  Ingrese el número de horas laboradas: 10
  El sueldo básico es: 1000.0
  El descuento es: 180.0
  El sueldo neto es: 820.0

  Ingrese la categoría del trabajador: Administrativo
  Ingrese el número de horas laboradas: 10
  El sueldo básico es: 500.0
  El descuento es: 90.0
  El sueldo neto es: 410.0

  Ingrese la categoría del trabajador: Obrero
  Ingrese el número de horas laboradas: 10
  El sueldo básico es: 200.0
  El descuento es: 36.0
  El sueldo neto es: 164.0

  Ingrese la categoría del trabajador: Funcionario
  Ingrese el número de horas laboradas: 0
  El número de horas no puede ser cero

  Ingrese la categoría del trabajador: Funcionario
  Ingrese el número de horas laboradas: -10
  El número de horas no puede ser negativo

  Ingrese la categoría del trabajador: Funcionarios
  El sueldo básico es: 1000.0
  El descuento es: 180.0
  El sueldo neto es: 820.0
```

<!-- fin de la pagina -->

## Gracias por leer 💗

[![Cute cat](https://images.unsplash.com/photo-1503416997304-7f8bf166c121?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1632&q=80)](https://unsplash.com/photos/7YJZQYQYq0U)
