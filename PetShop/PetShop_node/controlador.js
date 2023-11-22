const Clases = require('./clases.js');
const Modelo = require('./modelo.js');

function nuevo(data){
    console.log("--nuevo(data)-->[controlador]");
    console.log(data);
   

    let miProducto = new Clases.Producto(
        data.Nombre, 
        parseInt(data.Precio), 
        data.Categoria
    );

    console.log("aaaaaaaaaaaaaaa");
    console.log(miProducto);
    
    Modelo.guardar(miProducto);
}

function buscar() {
    return Modelo.buscar();
}

module.exports = { nuevo, buscar };
