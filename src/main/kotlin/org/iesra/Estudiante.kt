class Estudiante(private val nombre: String) {

    var nota: Double = 0.0
        set(value) {
            if (value in 0.0..10.0) {
                field = value
            } else {
                throw IllegalArgumentException("La nota debe estar entre 0 y 10.")
            }
        }

    override fun toString(): String {
        return "Estudiante: $nombre, Nota: $nota"
    }
}

// Programa principal
fun main() {
    val estudiante1 = Estudiante("Ana")
    estudiante1.nota = 8.5

    val estudiante2 = Estudiante("Luis")
    try {
        estudiante2.nota = 11.0
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }

    println(estudiante1)
    println(estudiante2)
}
