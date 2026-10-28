# 🎯 Adivina el Número

Juego de consola desarrollado en **Kotlin** en el que el usuario debe adivinar un número secreto entre 1 y 100. Tras cada intento, el programa indica si el número introducido es mayor o menor que el secreto, y al acertar muestra el total de intentos empleados.

## 📋 Características

- Pide el nombre del jugador y valida que no esté vacío.
- Genera un número aleatorio entre 1 y 100 en cada partida.
- Valida la entrada del usuario (solo números y dentro del rango permitido).
- Da pistas tras cada intento ("el número es mayor" / "el número es menor").
- Cuenta los intentos y los muestra al ganar.
- Mensajes de error en color rojo mediante códigos ANSI.

## 🗂️ Estructura del proyecto

```
├── Main.kt            # Punto de entrada: llama a partida.jugar()
├── controlador
│   ├── partida.kt     # Lógica principal del juego
│   └── Depurar.kt     # Lectura y validación de entradas por teclado
└── modelo
    └── Usuario.kt     # Data class del jugador y función sumarIntento()
```

### `Main.kt`
Punto de entrada del programa. Se encarga de lanzar la partida llamando a `partida.jugar()`.

### `controlador.partida`
Contiene el flujo del juego:
- `jugar()`: pide el nombre, crea el `Usuario`, genera el número secreto y repite el bucle hasta que se acierta.
- `comprobarNum()`: suma un intento, compara el número con el secreto y muestra la pista correspondiente. Devuelve `true` si el jugador ha ganado.

### `controlador.Depurar`
Utilidades para leer datos de forma segura:
- `leerInt()`: lee un entero y repite hasta que la entrada sea válida.
- `leerIntMinMax()`: lee un entero y comprueba que esté dentro de un rango.
- `leerCantidad()`: versión específica para cantidades con mensajes de error propios.

### `modelo.Usuario`
- `data class Usuario(nombre, intentos)`: almacena los datos del jugador.
- `sumarIntento(usuario)`: incrementa el contador de intentos.

## ▶️ Cómo ejecutarlo

1. Clona el repositorio:
   ```bash
   git clone https://github.com/tu-usuario/tu-repositorio.git
   ```
2. Ábrelo con **IntelliJ IDEA** (o tu IDE de Kotlin preferido).
3. Ejecuta el archivo `Main.kt`.

## 🕹️ Ejemplo de uso

```
Bienvenido usuario
Escriba su nombre para empezar a jugar
Antonio
===Bienvenido Antonio===
===Numero aleatorio creado===
Introduzca un numero entre (1-100)50
El numero es mayor, buen intento
Introduzca un numero entre (1-100)75
El numero es menor, buen intento
Introduzca un numero entre (1-100)62
Ha ganado!!, Has tardado: 3 intentos
```

## 🛠️ Tecnologías

- Kotlin
- Consola / terminal

## 👤 Autor

**Antonio Manuel González Martínez**
