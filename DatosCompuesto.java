//Arreglo de una dimension
import java.util.Scanner;

public class DatosCompuesto {
    public static void main(String[] args) {
        final int NUM = 8;
        int[] nums = new int[NUM];
        int total = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < NUM; i++) {
            System.out.println("Por favor, introduzca el número: ");
            nums[i] = scanner.nextInt();
            total += nums[i];
        }
        System.out.println("El total de números es: " + total);
        scanner.close();
    }
}
 
//Arreglo de dos dimensiones

public class DatosCompuesto {
    public static void main(String[] args) {
        // Arreglo de una dimension
        final int NUM = 8;
        int[] nums = new int[NUM];
        int total = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < NUM; i++) {
            System.out.println("Por favor, introduzca el número: ");
            nums[i] = scanner.nextInt();
            total += nums[i];
        }
        System.out.println("El total de números es: " + total);
        scanner.close();

        // Arreglo de dos dimensiones
        final int N = 2;
        final int M = 4;
        float[][] discos = new float[N][M];
        scanner = new Scanner(System.in);
        for (int fila = 0; fila < N; fila++) {
            for (int col = 0; col < M; col++) {
                discos[fila][col] = scanner.nextFloat();
            }
        }

        for (int fila = 0; fila < N; fila++) {
            System.out.print("Precio fila " + fila + "\t");
            for (int col = 0; col < M; col++) {
                System.out.print(discos[fila][col] + "\t");
            }
            System.out.println();
        }
    }
}
//Arrays como parametros en funciones
public class ArrayParams {
    public static final int LONG = 100;

    public static void leerArray(double[] a, int[] n) {
        n[0] = 0;
        System.out.println("Introduzca datos. Para terminar pulsar 0:");
        for (int i = 0; i < LONG; i++) {
            System.out.print(i + " : ");
        }
    }

    public static void imprimirArray(double[] a, int n) {
        System.out.println("El array tiene " + n + " elementos son:");
        for (int i = 0; i < n; i++) {
            System.out.println("\t" + i + " : " + a[i]);
        }
    }

    public static void main(String[] args) {
        double[] a = new double[LONG];
        int[] n = new int[1];
        leerArray(a, n);
        System.out.print("Ingrese un número (0 para terminar): ");
        a[n[0]] = Double.parseDouble(System.console().readLine());
        if (a[n[0]] == 0) {
            System.out.println("Fin del programa");
            return;
        }
        System.out.println("El array tiene " + n[0] + " elementos son:");
        imprimirArray(a, n[0]);
    }
}
//Estructura de Objetos
class Empleado {
    // Atributos de la clase Empleado
    int id;
    String nombre;
    String apellido;
    float salario;
    int edad;

    // Constructor para inicializar los atributos de la clase
    public Empleado(int id, String nombre, String apellido, float salario, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.edad = edad;
    }

    // Método para mostrar información del empleado
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Salario: " + salario);
        System.out.println("Edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Empleado
        Empleado empleado = new Empleado(1, "Juan", "Pérez", 2500.50f, 30);

        // Mostrar la información del empleado
        empleado.mostrarInformacion();
    }
}


//Enumeracion

public class EnumDemo {
    enum Color {
        BLANCO, AZUL, VERDE, ROJO
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Colores disponibles: " + Color.values().length);
        for (Color c : Color.values()) {
            System.out.println(c); // Muestra los valores del enum
        }

        System.out.println("Seleccione un color: ");
        String colorInput = scanner.next().toUpperCase(); 

        try {
            Color rotulador = Color.valueOf(colorInput);
            System.out.println("El color seleccionado es: " + rotulador);

            switch (rotulador) {
                case ROJO:
                    System.out.println("El rotulador es rojo");
                    break;
                case VERDE:
                    System.out.println("El rotulador es verde");
                    break;
                case AZUL:
                    System.out.println("El rotulador es azul");
                    break;
                case BLANCO:
                    System.out.println("El rotulador es blanco");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Color no válido. Asegúrese de usar uno de los valores disponibles.");
        } finally {
            scanner.close();
        }
    }
}

