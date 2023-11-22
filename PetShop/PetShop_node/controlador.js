const Clases = require('./clases.js')
const Modelo = require('./modelo.js')



function nuevo(data){
    console.log("--nuevo(data)-->[controlador]")
    console.log(data);
   
    let miProducto = new Clases.Producto(data.nombre, parseInt(data.precio), data.categoria)
    Modelo.guardar(miProducto);
}

module.exports = {nuevo}
//esto se puede implementar en los otros archivos
//clases
class Producto{
    constructor(nom, prec, cat){
        this.nombre = nom;
        this.precio = prec;
        this.categoria = cat;
    }
}

module.exports = {Producto}
//modelo
const fs = require('fs')
//se le podria cambiar el nombre a la funcion(para que coincida con lo echo en netbeans), pero es lo mismo
function guardar(data){
    console.log("--guardar(data)-->[modelo]")
    console.log(data)

    let str_productos = fs.readFileSync('./db.txt','utf-8')
    let productos = []
    if(str_productos){
        productos = JSON.parse(str_productos)
    }
    
   productos.push(data)
    fs.writeFileSync('./db.txt',JSON.stringify(productos))
}

module.exports = {guardar}
//menu
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>PetShop Pulgitas:</h1>
    <h2>Ingresar un Producto</h2>
    <form action="http://localhost:3000/nuevo" method="POST">
        <p><label>Nombre:</label><input type='text' name="nombre"></p>
        <p><label>Precio:</label><input type='number' name='precio'></p>
        <p><label>Categoria:</label><input type="text" name="categoria"></p>
 
        <input type="submit" value="Enviar">

    </form>
</body>
</html>