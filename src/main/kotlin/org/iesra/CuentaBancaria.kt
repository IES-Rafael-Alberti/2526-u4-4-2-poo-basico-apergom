class CuentaBancaria(private val titular: String) {

    private var saldo: Double = 0.0

    fun ingresar(cantidad: Double) {
        if (cantidad > 0) {
            saldo += cantidad
            println("Ingreso realizado. Saldo actual: $saldo")
        } else {
            throw IllegalArgumentException("Cantidad a ingresar debe ser positiva y mayor que 0.")
        }
    }

    fun retirar(cantidad: Double) {
        if (cantidad > saldo) {
            throw IllegalArgumentException("Saldo insuficiente. Saldo actual: $saldo")
        } else if (cantidad > 0) {
            saldo -= cantidad
           println("Retiro realizado. Saldo actual: $saldo")
        } else {
            throw IllegalArgumentException("Cantidad a retirar debe ser mayor que 0.")
        }
    }
}

// Programa principal
fun main() {
    val cuenta = CuentaBancaria("Juan Pérez")
    cuenta.ingresar(100.0)
    cuenta.retirar(50.0)

    try {
        cuenta.retirar(100.0)
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
