//Arreglo de una dimensión
using System;

public class DatosCompuesto
{
    public static void Main()
    {
        const int NUM = 8;
        int[] nums = new int[NUM];
        int total = 0;

        Console.WriteLine("Por favor, introduzca 8 números:");

        for (int i = 0; i < NUM; i++)
        {
            Console.Write("Número " + (i + 1) + ": ");
            nums[i] = int.Parse(Console.ReadLine());
            total += nums[i];
        }

        Console.WriteLine("El total de los números es: " + total);
    }
}

//Arreglo de dos dimensiones
using System;

public class DatosCompuesto
{
    public static void Main()
    {
    
        const int NUM = 8;
        int[] nums = new int[NUM];
        int total = 0;

        Console.WriteLine("Por favor, introduzca 8 números:");
        for (int i = 0; i < NUM; i++)
        {
            Console.Write("Número " + (i + 1) + ": ");
            nums[i] = int.Parse(Console.ReadLine());
            total += nums[i];
        }
        Console.WriteLine("El total de los números es: " + total);

        const int N = 2;
        const int M = 4;
        float[,] discos = new float[N, M];

        Console.WriteLine("Ingrese datos para una matriz de 2x4:");
        for (int fila = 0; fila < N; fila++)
        {
            for (int col = 0; col < M; col++)
            {
                Console.Write("Disco [" + fila + ", " + col + "]: ");
                discos[fila, col] = float.Parse(Console.ReadLine());
            }
        }

        for (int fila = 0; fila < N; fila++)
        {
            Console.Write("Precios fila " + fila + ": ");
            for (int col = 0; col < M; col++)
            {
                Console.Write(discos[fila, col] + "\t");
            }
            Console.WriteLine();
        }
    }
}
//Arrays como parámetros 
using System;

public class ArrayParams
{
    public const int LONG = 100;

    public static void LeerArray(double[] a, ref int n)
    {
        Console.WriteLine("Introduzca datos. Para terminar, pulse 0:");
        int count = 0;

        while (count < LONG)
        {
            Console.Write(count + " : ");
            a[count] = double.Parse(Console.ReadLine());
            if (a[count] == 0)
            {
                break;
            }
            count++;
        }

        n = count;
    }

    public static void ImprimirArray(double[] a, int n)
    {
        Console.WriteLine("El array tiene " + n + " elementos:");
        for (int i = 0; i < n; i++)
        {
            Console.WriteLine("\t" + i + " : " + a[i]);
        }
    }

    public static void Main()
    {
        double[] a = new double[LONG];
        int n = 0;

        LeerArray(a, ref n);
        ImprimirArray(a, n);
    }
}
//Estructura de Objetos 
using System;

public class Empleado
{
    public int Id { get; set; }
    public string Nombre { get; set; }
    public string Apellido { get; set; }
    public float Salario { get; set; }
    public int Edad { get; set; }

    public Empleado(int id, string nombre, string apellido, float salario, int edad)
    {
        Id = id;
        Nombre = nombre;
        Apellido = apellido;
        Salario = salario;
        Edad = edad;
    }

    public void MostrarInformacion()
    {
        Console.WriteLine("ID: " + Id);
        Console.WriteLine("Nombre: " + Nombre + " " + Apellido);
        Console.WriteLine("Salario: " + Salario);
        Console.WriteLine("Edad: " + Edad);
    }
}

public class MainProgram
{
    public static void Main()
    {
        Empleado empleado = new Empleado(1, "Juan", "Pérez", 2500.50f, 30);
        empleado.MostrarInformacion();
    }
}

//Enumeraciones
using System;

public class EnumDemo
{
    public enum Color
    {
        BLANCO,
        AZUL,
        VERDE,
        ROJO
    }

    public static void Main()
    {
        Console.WriteLine("Colores disponibles:");
        foreach (var color in Enum.GetNames(typeof(Color)))
        {
            Console.WriteLine(color);
        }

        Console.Write("Seleccione un color: ");
        string colorInput = Console.ReadLine().ToUpper();

        try
        {
            Color rotulador = (Color)Enum.Parse(typeof(Color), colorInput);
            Console.WriteLine("El color seleccionado es: " + rotulador);

            switch (rotulador)
            {
                case Color.ROJO:
                    Console.WriteLine("El rotulador es rojo.");
                    break;
                case Color.VERDE:
                    Console.WriteLine("El rotulador es verde.");
                    break;
                case Color.AZUL:
                    Console.WriteLine("El rotulador es azul.");
                    break;
                case Color.BLANCO:
                    Console.WriteLine("El rotulador es blanco.");
                    break;
            }
        }
        catch (ArgumentException)
        {
            Console.WriteLine("Error: Color no válido.");
        }
    }
}
