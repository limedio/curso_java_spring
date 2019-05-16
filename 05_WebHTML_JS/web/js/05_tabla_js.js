/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

console.log("Generando tabla...");
generarTabla();
function generarTabla(){
    var table = document.getElementsByTagName("table"); //coge todos los elementos con tag table. Como sólo hay uno, coge el primero, de índice 0
    table = table[0];
    table.innerHTML = " <caption>Lista de vainas</caption>";
    //Añadiendo string templates. Esto lo que hace, es sustituir el contenido del HTML. Sk quiero añadir, le pongo +=:
    //Tambien puedo utilizar variables con ${nombreDeLaVariable}
    var nombrePrecio = "Precio vaina";
    table.innerHTML += `
    <thead>
        <tr>
            <th>Tipo</th>
            <th>Nombre</th>
            <th>${nombrePrecio}</th>
            <th>Cantidad</th>
        </tr>
    </thead> `;
    //Como crear arrays en javascript
    var lista = new Array();
    //Array de dos dimensiones:
    lista = [["Vaina: ", "Peine", "15 €", 7]];
    lista[1]= ["Vaina: ", "Quitapelos", "30 €", 1];
    lista[2]= ["Vaina: ", "Coche", "200 €", 2];
     
    for (var i = 0; i< lista.length; i++){
        var nodoTR = document.createElement("tr");
        table.appendChild(nodoTR);
        for (var columna of lista[i]){
            var nodoCol = document.createElement("td");
            nodoTR.appendChild(nodoCol);
            var textoCol = document.createTextNode(columna);
            nodoCol.appendChild(textoCol);
        }
        
    }
}
