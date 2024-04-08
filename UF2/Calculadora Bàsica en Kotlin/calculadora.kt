import java.util.Scanner
//Calculadora Bàsica en Kotlin by Joel Jara
class Calculadora {
    fun sumar(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun restar(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multiplicar(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun dividir(num1: Int, num2: Int): Double {
        if (num2 == 0) {
            throw IllegalArgumentException("No se puede dividir por cero")
        }
        return num1.toDouble() / num2
    }
}

fun main() {
    val calculadora = Calculadora()
    val scanner = Scanner(System.`in`)

    print("¿Qué operación quieres hacer?\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\nSelecciona una opción: ")

    val opcion = scanner.nextInt()

    print("Ingresa el primer número: ")
    val num1 = scanner.nextInt()

    print("Ingresa el segundo número: ")
    val num2 = scanner.nextInt()

    when (opcion) {
        1 -> {
            val resultado = calculadora.sumar(num1, num2)
            println("El resultado de la suma es $resultado")
        }
        2 -> {
            val resultado = calculadora.restar(num1, num2)
            println("El resultado de la resta es $resultado")
        }
        3 -> {
            val resultado = calculadora.multiplicar(num1, num2)
            println("El resultado de la multiplicación es $resultado")
        }
        4 -> {
            try {
                val resultado = calculadora.dividir(num1, num2)
                println("El resultado de la división es $resultado")
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
        else -> println("Opción no válida")
    }
}
