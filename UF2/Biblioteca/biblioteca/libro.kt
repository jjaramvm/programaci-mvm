package biblioteca

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