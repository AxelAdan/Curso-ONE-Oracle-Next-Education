function saltarLinea() {
    document.write("<br>");	
}  

function imprimir(frase) {
    document.write(frase);
    
    saltarLinea();
}


for(var lineas = 1; lineas <= 3; lineas++) {
    for (var columnas = 1; columnas <= 10; columnas++){
        document.write("*");
    }

    saltarLinea();
} 

saltarLinea();
saltarLinea();
    
imprimir("fin");
