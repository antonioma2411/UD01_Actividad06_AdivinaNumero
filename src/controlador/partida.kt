package controlador


import controlador.Depurar.leerCantidad
import modelo.Usuario
import modelo.sumarIntento

object partida {

    val ROJO = "\u001B[31m" //colores para los errores
    val RESET = "\u001B[0m"

    fun jugar(){
        var nombre="" //Nombre del usuario
        var resultado=0 //Este es el numero que ira proband el usuario
        println("Bienvenido usuario")
        do{
            println("Escriba su nombre para  empezar a jugar") //Le pedimos el nombre para guardarlo en la clase usuario
            nombre=readln();
            if(nombre.trim().isEmpty()){ //Comprobamos que no esta vacio
                println("$ROJO El nombre de usuario no puede estar vacio$RESET")
            }
        }while(nombre.trim().isEmpty())

        val usuario=Usuario(nombre) //Creamos el objeto usuario
        println("===Bienvenido ${usuario.nombre}===")
        println("===Numero aleatorio creado===")
        val numeroSecreto = (1..100).random()       //hacemor el random que esté del uno al 100


        do {
            resultado= leerCantidad("Introducza un numero entre (1-100)", 1,100) //Depuramos el input del usuario
        }while(!comprobarNum(resultado, numeroSecreto, usuario))




    }

    fun comprobarNum(numero:Int, numGanador: Int, usuario: Usuario) : Boolean{
        sumarIntento(usuario)
        if (numero == numGanador ){
            println("Ha ganado!!, Has tardado: ${usuario.intentos} intentos")
            return true
        }else if(numero >= numGanador){
            println("El numero es menor, buen intento")
            return false
        }else {
            println("El numero es mayor, buen intento")
            return false
        }
    }
}