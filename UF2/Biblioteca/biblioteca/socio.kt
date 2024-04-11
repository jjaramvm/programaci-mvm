package biblioteca

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
