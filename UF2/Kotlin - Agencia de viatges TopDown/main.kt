import java.util.Scanner
//Agencia de viatges TopDown by Joel Jara

class Viaje(val destino: String, val fecha: String) {
}

class Cliente(val nombre: String, val email: String) {
}

class Reserva(val cliente: Cliente, val viaje: Viaje) {
}

val listaViajes = mutableListOf<Viaje>()
val listaClientes = mutableListOf<Cliente>()
val listaReservas = mutableListOf<Reserva>()

fun main() {
    val scanner = Scanner(System.`in`)

    print("Bienvenido a Agencia de Viajes TopDown\n1. Gestión de viajes\n2. Clientes y reservas\nSelecciona el apartado al que quieres ir: ")

    val opcion = scanner.nextInt()

    when (opcion) {
        1 -> {
            print("Bienvenido al apartado de Gestión de viajes\n1. Añadir viaje a la lista\n2. Obtener información resumida de todos los viajes" +
                    "\n3. Dar información detallada de un viaje en específico\n¿Qué operación quieres hacer?:  ")
            val opcionViaje = scanner.nextInt()
            when (opcionViaje) {
                1 -> {
                    print("Introduce el destino del viaje: ")
                    val destino = scanner.next()
                    print("Introduce la fecha del viaje: ")
                    val fecha = scanner.next()
                    val nuevoViaje = Viaje(destino, fecha)
                    listaViajes.add(nuevoViaje)
                    println("¡Viaje agregado con éxito!")
                }
                2 -> {
                    println("Información resumida de todos los viajes:")
                    listaViajes.forEachIndexed { index, viaje ->
                        println("${index + 1}. Destino: ${viaje.destino}, Fecha: ${viaje.fecha}")
                    }
                }
                3 -> {
                    print("Introduce el número de viaje del cual quieres información detallada: ")
                    val numViaje = scanner.nextInt()
                    if (numViaje in 1..listaViajes.size) {
                        val viajeSeleccionado = listaViajes[numViaje - 1]
                        println("Información detallada del viaje:")
                        println("Destino: ${viajeSeleccionado.destino}")
                        println("Fecha: ${viajeSeleccionado.fecha}")
                    } else {
                        println("Número de viaje inválido")
                    }
                }
                else -> println("Opción no válida")
            }
        }
        2 -> {
            print(
                "Bienvenido al apartado de Clientes y reservas\n1. Registrarte como cliente\n2. Hacer una reserva" +
                        "\n3. Dar información detallada de una reserva\n" +
                        "¿Qué operación quieres hacer?:  "
            )
            val opcionCliente = scanner.nextInt()
            when (opcionCliente) {
                1 -> {
                    print("Introduce tu nombre: ")
                    val nombre = scanner.next()
                    print("Introduce tu email: ")
                    val email = scanner.next()
                    val nuevoCliente = Cliente(nombre, email)
                    listaClientes.add(nuevoCliente)
                    println("¡Cliente registrado con éxito!")
                }
                2 -> {
                    println("Selecciona el cliente que realizará la reserva:")
                    listaClientes.forEachIndexed { index, cliente ->
                        println("${index + 1}. Nombre: ${cliente.nombre}, Email: ${cliente.email}")
                    }
                    print("Introduce el número de cliente que realizará la reserva: ")
                    val numCliente = scanner.nextInt()
                    if (numCliente in 1..listaClientes.size) {
                        val clienteSeleccionado = listaClientes[numCliente - 1]
                        println("Selecciona el viaje para hacer la reserva:")
                        listaViajes.forEachIndexed { index, viaje ->
                            println("${index + 1}. Destino: ${viaje.destino}, Fecha: ${viaje.fecha}")
                        }
                        print("Introduce el número de viaje para hacer la reserva: ")
                        val numViaje = scanner.nextInt()
                        if (numViaje in 1..listaViajes.size) {
                            val viajeSeleccionado = listaViajes[numViaje - 1]
                            val nuevaReserva = Reserva(clienteSeleccionado, viajeSeleccionado)
                            listaReservas.add(nuevaReserva)
                            println("¡Reserva realizada con éxito!")
                        } else {
                            println("Número de viaje inválido")
                        }
                    } else {
                        println("Número de cliente inválido")
                    }
                }
                3 -> {
                    println("Información detallada de todas las reservas:")
                    listaReservas.forEachIndexed { index, reserva ->
                        println("${index + 1}. Cliente: ${reserva.cliente.nombre}, Destino: ${reserva.viaje.destino}, Fecha: ${reserva.viaje.fecha}")
                    }
                }
                else -> println("Opción no válida")
            }
        }
        else -> println("Opción no válida")
    }
}
