#Arreglo de una dimensión

def datos_compuesto():
    NUM = 8
    nums = [0] * NUM
    total = 0  # Variable para almacenar la suma total

   
    for i in range(NUM):
       
        nums[i] = int(input("Por favor, introduzca el número: "))
        # Sumar el valor ingresado al total
        total += nums[i]

    print("El total de números es:", total)

datos_compuesto()

def arreglo_dos_dimensiones():
    
    N, M = 2, 4
   
    discos = [[0 for _ in range(M)] for _ in range(N)]

    for fila in range(N):
        for col in range(M):
         
            discos[fila][col] = float(input(f"Introduzca el valor para discos[{fila}][{col}]: "))
    
    for fila in range(N):
        # Mostrar el índice de la fila
        print(f"Precio fila {fila}\t", end="")
        # Mostrar todos los elementos de la fila
        for col in range(M):
            print(f"{discos[fila][col]}\t", end="")

        print()
arreglo_dos_dimensiones()

#Arrays como parametros en funciones
def leer_array(a, n):
    n[0] = 0
    print("Introduzca datos. Para terminar, pulsar 0:")
    while True:
        # Leer un valor del usuario
        valor = float(input(f"{n[0]} : "))
        # Si el valor es 0, terminamos la entrada de datos
        if valor == 0:
            break
        # Almacenar el valor en el arreglo y aumentar el contador
        a[n[0]] = valor
        n[0] += 1  # Incrementar el número total de elementos ingresados

def imprimir_array(a, n):
    print("El arreglo tiene", n, "elementos:")
    for i in range(n):
        print("\t", i, ":", a[i])
# Función principal para ejecutar las operaciones
def main():
    # Arreglo para almacenar hasta 100 elementos
    a = [0] * 100
    n = [0]
    leer_array(a, n)
    imprimir_array(a, n[0])
main()

#Estructuras de objetos
class Empleado:
    # Constructor para inicializar las propiedades del empleado
    def __init__(self, id, nombre, apellido, salario, edad):
        self.id = id
        self.nombre = nombre
        self.apellido = apellido
        self.salario = salario
        self.edad = edad
    
    # Método para mostrar la información del empleado
    def mostrar_informacion(self):
        print("ID:", self.id)
        print("Nombre:", self.nombre, self.apellido)
        print("Salario:", self.salario)
        print("Edad:", self.edad)

def main():
    # Crear un empleado con datos iniciales
    empleado = Empleado(1, "Juan", "Pérez", 2500.50, 30)
    # Llamar al método para mostrar la información del empleado
    empleado.mostrar_informacion()

main()

#Enumeracion
# Enum para definir un conjunto de valores posibles
from enum import Enum
class Color(Enum):
    BLANCO = 1
    AZUL = 2
    VERDE = 3
    ROJO = 4

# Función para trabajar con la enumeración y recibir entrada del usuario
def main():
    # Mostrar la lista de colores disponibles
    print("Colores disponibles:", [color.name for color in Color])
    
    # Obtener entrada del usuario y convertir a mayúsculas para hacer coincidir el enum
    color_input = input("Seleccione un color (BLANCO, AZUL, VERDE, ROJO): ").upper()
    
    try:
        # Convertir la entrada a un valor del enum
        rotulador = Color[color_input]
        print("El color seleccionado es:", rotulador)

        # Usar switch para determinar la acción según el color
        if rotulador == Color.ROJO:
            print("El rotulador es rojo")
        elif rotulador == Color.VERDE:
            print("El rotulador es verde")
        elif rotulador == Color.AZUL:
            print("El rotulador es azul")
        elif rotulador == Color.BLANCO:
            print("El rotulador es blanco")
    except KeyError:
        # Manejo de error si el color ingresado no es válido
        print("Error: Color no válido. Asegúrese de usar uno de los valores disponibles.")
main()
