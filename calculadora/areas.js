//Crear las funciones areaTriangulo(), areaCuadrado() y areaCirculo() en el cli REPL
module.exports={
    triangulo: function(b,a){
        return ((b*a)/2);
    },
    cuadrado: function(a){
        return a*a;
    },
    circulo: function(r){
        return ((r*r)*3.1416);
    }
}