package controlador

object Depurar {

    val ROJO = "\u001B[31m"
    val RESET = "\u001B[0m"

    //Lee un número por teclado y repite hasta que sea válido
    fun leerInt (mensaje:String): Int {
        var n : Int? = null;
        do {
            print(mensaje);
            n = readln().replace(",", ".").trim().toIntOrNull();
            if (n == null) {
                println("$ROJO Error: entrada no válida, introduce un número $RESET")
            }
        } while (n == null)
        return n;
    }

    //Lee un número y repite hasta que se encuentre por encima del minimo y por debajo del maximo
    fun leerIntMinMax (mensaje:String, minimo:Int, maximo: Int, mensajeError:String, mensajeError2: String): Int {
        var n : Int = 0;
        do {
            n = leerInt(mensaje);

            if (n <= minimo) {
                println("$ROJO $mensajeError $RESET") //Mensaje de error si esta por debajo del minimo
            }else if (n > maximo){
                println("$ROJO $mensajeError2 $RESET") //Mensaje de error si esta por encima del maximo
            }
        } while (n <= minimo || n > maximo)
        return n;
    }

    //Cantidad que no puede ser negativa (Numeros en este caso)
    fun leerCantidad (mensaje:String ,minimo: Int, maximo: Int): Int {
        return leerIntMinMax(mensaje, minimo, maximo,"Error: la cantidad no puede ser menor a 0", "Error: la cantidad no puede ser mayor a: $maximo");
    }

}