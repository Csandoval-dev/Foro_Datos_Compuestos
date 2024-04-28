//Arreglo de una dimensión
import 'dart:io';

void datosCompuesto() {
  final int NUM = 8; 
  List<int> nums = List.filled(NUM, 0); 
  int total = 0; 

  for (int i = 0; i < NUM; i++) {
    print("Por favor, introduzca el número:");
    nums[i] = int.parse(stdin.readLineSync()!); 
    total += nums[i]; 
  }

  print("El total de números es: $total");
}
void main() {
  datosCompuesto(); 
}

//Arreglo de dos dimesiones

void arregloDosDimensiones() {
  final int N = 2; 
  final int M = 4; 

  List<List<double>> discos = List.generate(N, (_) => List.filled(M, 0.0));

  for (int fila = 0; fila < N; fila++) {
    for (int col = 0; col < M; col++) {
      print("Introduzca el valor para discos[$fila][$col]:");
      discos[fila][col] = double.parse(stdin.readLineSync()!); 
    }
  }

 
  for (int fila = 0; fila < N; fila++) {
    String filaString = "Precio fila $fila\t";
    for (int col = 0; col < M; col++) {
      filaString += "${discos[fila][col]}\t";
    }
    print(filaString); 
  }
}

//Arreglo como parámetro


void leerArray(List<double> a, List<int> n) {
  n[0] = 0; 
  print("Introduzca datos. Para terminar, pulsar 0:");
  while (true) {
    print("${n[0]} :");
    double valor = double.parse(stdin.readLineSync()!); 
    if (valor == 0) break; 
    a[n[0]] = valor; 
    n[0]++; 
  }
}

void imprimirArray(List<double> a, int n) {
  print("El arreglo tiene $n elementos:");
  for (int i = 0; i < n; i++) {
    print("\t$i : ${a[i]}"); 
  }
}

void main1() {
  final int LONG = 100; 
  List<double> a = List.filled(LONG, 0.0);
  List<int> n = [0]; 

  leerArray(a, n); 
  imprimirArray(a, n[0]); 
}

//Estructura de Objetos

class Empleado {
  int id;
  String nombre;
  String apellido;
  double salario;
  int edad;

  
  Empleado(this.id, this.nombre, this.apellido, this.salario, this.edad);

  void mostrarInformacion() {
    print("ID: $id");
    print("Nombre: $nombre $apellido");
    print("Salario: $salario");
    print("Edad: $edad");
  }
}

void main2() {

  Empleado empleado = Empleado(1, "Juan", "Pérez", 2500.50, 30);

  empleado.mostrarInformacion();
}

//Enumeraciones
enum Color {
  BLANCO,
  AZUL,
  VERDE,
  ROJO
}

void main3() {
  print("Colores disponibles: ${Color.values}"); 

  print("Seleccione un color (BLANCO, AZUL, VERDE, ROJO):");
  String colorInput = stdin.readLineSync()!.toUpperCase();
  
  try {
    Color rotulador = Color.values.firstWhere(
      (c) => c.name == colorInput,
      orElse: () => throw Exception("Color no válido"),
    );

    print("El color seleccionado es:", rotulador);

    switch (rotulador) {
      case Color.ROJO:
        print("El rotulador es rojo");
        break;
      case Color.VERDE:
        print("El rotulador es verde");
        break;
      case Color.AZUL:
        print("El rotulador es azul");
        break;
      case Color.BLANCO:
        print("El rotulador es blanco");
        break;
    }
  } catch (e) {
    print("Error: $e");
  }
}
