class Producto(private val nombre: String, precio: Double, stock: Int) {

    var precio: Double = precio
        private set

    var stock: Int = stock
        private set

    init {
        require(precio > 0) { "El precio debe ser positivo." }
        require(stock >= 0) { "El stock no puede ser negativo." }
    }

    fun vender(cantidad: Int) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad
        } else {
            throw IllegalArgumentException("Cantidad no válida para la venta.")
        }
    }

    fun reabastecer(cantidad: Int) {
        if (cantidad > 0) {
            stock += cantidad
        } else {
            throw IllegalArgumentException("Cantidad no válida para reabastecimiento.")
        }
    }

    override fun toString(): String {
        return "Producto: $nombre, Precio: ${"%.2f".format(precio)}€, Stock: $stock"
    }
}

// Programa principal
fun main() {
    val producto1 = Producto("Laptop", 1500.0, 10)

    producto1.vender(3)
    producto1.reabastecer(5)

    println(producto1)

    try {
        producto1.vender(20)
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }

    println(producto1)
}
