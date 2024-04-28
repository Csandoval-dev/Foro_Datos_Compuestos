//Arreglo de una dimensión 
function datosCompuesto() {
    const NUM = 8; 
    const nums = new Array(NUM).fill(0);
    let total = 0; 

    for (let i = 0; i < NUM; i++) {
        nums[i] = parseInt(prompt("Por favor, introduzca el número:"), 10); 
        total += nums[i]; 
    }

    console.log("El total de números es:", total);
}
datosCompuesto();

//Arreglo de dos dimensiones 
function arregloDosDimensiones() {
    const N = 2; 
    const M = 4; 
    const discos = Array.from({ length: N }, () => new Array(M).fill(0)); 

    for (let fila = 0; fila < N; fila++) {
        for (let col = 0; col < M; col++) {
            discos[fila][col] = parseFloat(prompt(`Introduzca el valor para discos[${fila}][${col}]:`)); 
        }
    }

    for (let fila = 0; fila < N; fila++) {
        let filaString = `Precio fila ${fila}\t`; 
        for (let col = 0; col < M; col++) {
            filaString += `${discos[fila][col]}\t`; 
        }
        console.log(filaString); 
    }
}
arregloDosDimensiones();

//Arreglo como parámetro
function leerArray(a, n) {
    console.log("Introduzca datos. Para terminar, pulsar 0:");
    n[0] = 0; 
    while (true) {
        let valor = parseFloat(prompt(`Dato ${n[0]}: `)); 
        if (valor === 0) break; 
        a[n[0]] = valor; 
        n[0] += 1; 
    }
}

function imprimirArray(a, n) {
    console.log("El arreglo tiene", n, "elementos:");
    for (let i = 0; i < n; i++) {
        console.log(`\t${i} : ${a[i]}`); 
    }
}

function main() {
    const LONG = 100; 
    const a = new Array(LONG).fill(0); 
    const n = [0]; 

    leerArray(a, n); 
    imprimirArray(a, n[0]); 
}
main();

//Estructura de Objetos

class Empleado {
    constructor(id, nombre, apellido, salario, edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.edad = edad;
    }

    mostrarInformacion() {
        console.log("ID:", this.id);
        console.log("Nombre:", this.nombre, this.apellido);
        console.log("Salario:", this.salario);
        console.log("Edad:", this.edad);
    }
}


function main() {
  
    const empleado = new Empleado(1, "Juan", "Pérez", 2500.50, 30);
    
    empleado.mostrarInformacion();
}

main();

//Enumeraciones

const Color = {
    BLANCO: 'BLANCO',
    AZUL: 'AZUL',
    VERDE: 'VERDE',
    ROJO: 'ROJO'
};

function main() {
    console.log("Colores disponibles:", Object.values(Color)); 

    const colorInput = prompt("Seleccione un color (BLANCO, AZUL, VERDE, ROJO): ").toUpperCase(); 
    
    try {
        const rotulador = Color[colorInput]; 
        console.log("El color seleccionado es:", rotulador);

        
        if (rotulador === Color.ROJO) {
            console.log("El rotulador es rojo");
        } else if (rotulador === Color.VERDE) {
            console.log("El rotulador es verde");
        } else if (rotulador === Color.AZUL) {
            console.log("El rotulador es azul");
        } else if (rotulador === Color.BLANCO) {
            console.log("El rotulador es blanco");
        }
    } catch (error) {
        console.log("Error: Color no válido. Asegúrese de usar uno de los valores disponibles.");
    }
}


main();
