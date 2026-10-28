package modelo

data class Usuario( //Data class, hace que ya tenga los getters y setters sin tener que definirlo
    var nombre: String = "",
    var intentos: Int = 0,
)


fun sumarIntento(usuario: Usuario) {
    usuario.intentos += 1 //Sumamos los intentos con esta funcion
}

