function saltarLinea() {
    document.write("<br>");	
    document.write("<br>");	
    document.write("<br>");	
}  

function imprimir(frase) {
    document.write(frase);
    
    saltarLinea();
}

function calcularImc(peso,altura) {
    return (peso / (altura * altura));
}

nombre = prompt("infome su nombre")
pesoInformado = prompt(nombre + ", infome su peso")
alturaInformado = prompt(nombre + ",infome su altura")

imcCalculado = calcularImc(pesoInformado,alturaInformado)

imprimir(nombre + ", su imc calculado es: " + imcCalculado);
