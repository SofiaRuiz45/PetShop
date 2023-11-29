const express = require("express");
const app = express();
const path = require('path');

const Controlador = require('./controlador');

app.use(express.json());
app.use(express.urlencoded({extended : false}));



app.get('/', (req,res)=>{
    //res.send('<h1>Hola Genteeee....!!!');
    res.sendFile(path.join(__dirname,'./static/menu.html'));
})

app.post('/nuevo', (req,res)=>{
    console.log("--post/nuevo--[server]");
    
    req.body.impuestos == undefined ? req.body.impuestos = false : req.body.impuestos = true;
    console.log(req.body);
    Controlador.nuevo(req.body);
    res.sendFile(path.join(__dirname,'./static/menu.html'));
})
const port = 3000;
app.listen(port, ()=>{
    console.log(`express listen en puerto ${port}!`);
    
})

app.get('/buscar', (req, res) => {
    console.log("--get/buscar--[server]");
    const productosGuardados = Controlador.buscar();

    // aca se muestra como una tabla html
    let htmlTable = '<table border="1"><tr><th>Nombre</th><th>Precio</th><th>Categoria</th></tr>';
    productosGuardados.forEach(producto => {
        htmlTable += `<tr><td>${producto.Nombre}</td>
                          <td>${producto.Precio}</td>
                          <td>${producto.Categoria}</td></tr>`;
    });
    htmlTable += '</table>';

    res.send(htmlTable);
});
