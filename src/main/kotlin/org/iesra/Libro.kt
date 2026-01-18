class Libro(val titulo: String, val autor: String, val numPaginas: Int = 100) {

    private var leido: Boolean = false

    init {
        require(titulo.isNotBlank()) { "El título no puede estar vacío." }
        require(autor.isNotBlank()) { "El autor no puede estar vacío." }
        require(numPaginas > 0 && numPaginas <= 5000) { "El número de páginas debe ser mayor que 0 y menor o igual a 5000." }
    }

    override fun toString(): String {
        val leidoStr = if (leido) "Sí" else "No"
        return "Libro: $titulo por $autor, Páginas: $numPaginas, Leído: $leidoStr"
    }

    fun marcarComoLeido() {
        leido = true
    }
}

// Programa principal
fun main() {
    val libro1 = Libro("1984", "George Orwell", 328)
    val libro2 = Libro("Cien años de soledad", "Gabriel García Márquez")

    libro2.marcarComoLeido()

    println(libro1)
    println(libro2)

    try {
        val libroInvalido = Libro("", "Autor Desconocido")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
