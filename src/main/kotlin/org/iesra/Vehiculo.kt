class Vehiculo(private val marca: String, private val modelo: String) {

    private var kilometraje: Double = 0.0

    fun registrarViaje(kilometros: Double) {
        if (kilometros > 0) {
            kilometraje += kilometros
        } else {
            throw IllegalArgumentException("Los kilómetros registrados deben ser mayores que 0.")
        }
    }

    fun detalles(): String {
        return "Vehículo: $marca, Modelo: $modelo, Kilometraje: $kilometraje km"
    }
}

// Programa principal
fun main() {
    val vehiculo = Vehiculo("Toyota", "Corolla")
    vehiculo.registrarViaje(100.0)
    println(vehiculo.detalles())
}
