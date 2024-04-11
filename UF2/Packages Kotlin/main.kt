//Biblioteca en Kotlin by Joel Jara
import java.util.Scanner

class Libro(var titulo: String, var autor: String, var ejemplaresDisponibles: Int) {

    fun prestar() {
        if (ejemplaresDisponibles > 0) {
            ejemplaresDisponibles--
            println("Libro prestado: $titulo, Autor: $autor")
        } else {
            println("No hay ejemplares disponibles de $titulo")
        }
    }

    fun devolver() {
        ejemplaresDisponibles++
        println("Libro devuelto: $titulo, Autor: $autor")
    }

    fun informacion() {
        println("Título: $titulo, Autor: $autor, Ejemplares disponibles: $ejemplaresDisponibles")
    }
}

class Socio(var nombre: String, var apellido: String, var numeroSocio: Int) {

    fun solicitarPrestamo(libro: Libro, fechaPrestamo: String) {
        println("Préstamo solicitado por $nombre $apellido, Número de Socio: $numeroSocio")
        val prestamo = Prestamo(libro, this)
        prestamo.registrarPrestamo(fechaPrestamo)
    }

    fun devolverPrestamo(libro: Libro) {
        println("Devolución de préstamo por $nombre $apellido, Número de Socio: $numeroSocio")
        val prestamo = Prestamo(libro, this)
        prestamo.devolverPrestamo()
    }

    fun informacion() {
        println("Nombre: $nombre, Apellido: $apellido, Número de Socio: $numeroSocio")
    }
}

class Prestamo(val libro: Libro, val socio: Socio) {
    fun registrarPrestamo(fechaPrestamo: String) {
        println("Préstamo registrado - Libro: ${libro.titulo}, Socio: ${socio.nombre} ${socio.apellido}, Fecha: $fechaPrestamo")
        libro.prestar()
    }

    fun devolverPrestamo() {
        println("Devolución de préstamo - Libro: ${libro.titulo}, Socio: ${socio.nombre} ${socio.apellido}")
        libro.devolver()
    }

    fun informacion() {
        println("Libro: ${libro.titulo}, Socio: ${socio.nombre} ${socio.apellido}")
    }
}

class App {
    fun exec() {
        val scanner = Scanner(System.`in`)

        // Creamos el libro 1
        println("Introduce los detalles del primer libro:")
        var tituloLibro1 = ""
        var autorLibro1 = ""
        var ejemplaresDisponiblesLibro1 = 0
        while (tituloLibro1.isEmpty()) {
            print("Título: ")
            tituloLibro1 = scanner.nextLine()
        }
        while (autorLibro1.isEmpty()) {
            print("Autor: ")
            autorLibro1 = scanner.nextLine()
        }
        while (ejemplaresDisponiblesLibro1 <= 0) {
            print("Ejemplares Disponibles: ")
            ejemplaresDisponiblesLibro1 = scanner.nextInt()
            scanner.nextLine()
        }
        val libro1 = Libro(tituloLibro1, autorLibro1, ejemplaresDisponiblesLibro1)
        // Creamos el libro 2
        println("Introduce los detalles del segundo libro:")
        var tituloLibro2 = ""
        var autorLibro2 = ""
        var ejemplaresDisponiblesLibro2 = 0
        while (tituloLibro2.isEmpty()) {
            print("Título: ")
            tituloLibro2 = scanner.nextLine()
        }
        while (autorLibro2.isEmpty()) {
            print("Autor: ")
            autorLibro2 = scanner.nextLine()
        }
        while (ejemplaresDisponiblesLibro2 <= 0) {
            print("Ejemplares Disponibles: ")
            ejemplaresDisponiblesLibro2 = scanner.nextInt()
            scanner.nextLine()
        }
        val libro2 = Libro(tituloLibro2, autorLibro2, ejemplaresDisponiblesLibro2)

        // Creamos el socio 1
        println("Introduce los detalles del primer socio:")
        var nombreSocio1 = ""
        var apellidoSocio1 = ""
        var numeroSocio1 = 0
        while (nombreSocio1.isEmpty()) {
            print("Nombre: ")
            nombreSocio1 = scanner.nextLine()
        }
        while (apellidoSocio1.isEmpty()) {
            print("Apellido: ")
            apellidoSocio1 = scanner.nextLine()
        }
        while (numeroSocio1 <= 0) {
            print("Número de Socio: ")
            numeroSocio1 = scanner.nextInt()
            scanner.nextLine()
        }
        val socio1 = Socio(nombreSocio1, apellidoSocio1, numeroSocio1)
        // Creamos el socio 2
        println("Introduce los detalles del segundo socio:")
        var nombreSocio2 = ""
        var apellidoSocio2 = ""
        var numeroSocio2 = 0
        while (nombreSocio2.isEmpty()) {
            print("Nombre: ")
            nombreSocio2 = scanner.nextLine()
        }
        while (apellidoSocio2.isEmpty()) {
            print("Apellido: ")
            apellidoSocio2 = scanner.nextLine()
        }
        while (numeroSocio2 <= 0) {
            print("Número de Socio: ")
            numeroSocio2 = scanner.nextInt()
            scanner.nextLine()
        }
        val socio2 = Socio(nombreSocio2, apellidoSocio2, numeroSocio2)

        var opcion: Int
        do {
            println("Selecciona una acción: \n1. Solicitar Préstamo\n2. Devolver Préstamo\n3. Información\n4. Salir\nOpción: ")
            opcion = scanner.nextInt()
            when (opcion) {
                1 -> {
                    println("Selecciona el socio que solicitará el préstamo:")
                    println("1. ${socio1.nombre} ${socio1.apellido}")
                    println("2. ${socio2.nombre} ${socio2.apellido}")
                    print("Introduce una opción: ")
                    val opcionSocio = scanner.nextInt()
                    val socioSeleccionado = if (opcionSocio == 1) socio1 else socio2

                    println("Selecciona el libro que se prestará:")
                    println("1. ${libro1.titulo}")
                    println("2. ${libro2.titulo}")
                    print("Introduce una opción: ")
                    val opcionLibro = scanner.nextInt()
                    val libroSeleccionado = if (opcionLibro == 1) libro1 else libro2

                    println("Introduce la fecha del préstamo (YYYY-MM-DD): ")
                    val fechaPrestamo = scanner.next()

                    socioSeleccionado.solicitarPrestamo(libroSeleccionado, fechaPrestamo)
                }
                2 -> {
                    println("Selecciona el socio que devolverá el préstamo:")
                    println("1. ${socio1.nombre} ${socio1.apellido}")
                    println("2. ${socio2.nombre} ${socio2.apellido}")
                    print("Introduce una opción: ")
                    val opcionSocio = scanner.nextInt()
                    val socioSeleccionado = if (opcionSocio == 1) socio1 else socio2

                    println("Selecciona el libro que se devolverá:")
                    println("1. ${libro1.titulo}")
                    println("2. ${libro2.titulo}")
                    print("Introduce una opción: ")
                    val opcionLibro = scanner.nextInt()
                    val libroSeleccionado = if (opcionLibro == 1) libro1 else libro2

                    socioSeleccionado.devolverPrestamo(libroSeleccionado)
                }
                3 -> {
                    println("Selecciona la información a consultar:\n1. Información de Libros\n2. Información de Socios\nIntroduce una opción: ")
                    val opcionInfo = scanner.nextInt()
                    when (opcionInfo) {
                        1 -> {
                            println("Información de Libros:")
                            libro1.informacion()
                            libro2.informacion()
                        }
                        2 -> {
                            println("Información de Socios:")
                            socio1.informacion()
                            socio2.informacion()
                        }
                    }
                }
                4 -> println("BYE BYE")
                else -> println("Opción no válida, intenta de nuevo.")
            }
        } while (opcion != 4)
    }
}

fun main() {
    App().exec()
}


