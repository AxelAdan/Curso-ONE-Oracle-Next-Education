var secretos = [3, 5, 7, 9];
var input = document.querySelector("input");

input.focus();

function verificar() {
    var encontrado = false;

    for (var posicion = 0; posicion < secretos.length; posicion++) {
        if (parseInt(input.value) == secretos[posicion]) {
            alert("Usted acertó");
            encontrado = true;

            break;

        }
    }

    if (encontrado == false) {
        alert("Uster erró");
    }

    input.value = "";

    input.focus();
}

var button = document.querySelector("button");
button.onclick = verificar;
