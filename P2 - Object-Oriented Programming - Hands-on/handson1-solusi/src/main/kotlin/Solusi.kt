// Hands-on 1: Class & Inheritance
// Solusi: Membuat inheritance dengan Vehicle sebagai class induk dan Car serta Motorcycle sebagai subclass.

open class Vehicle(val name: String, val maxSpeed: Int) {

    // Fungsi dibuat open agar bisa di-override oleh subclass.
    open fun describe(): String {
        return "$name dapat melaju hingga $maxSpeed km/h"
    }
}

// Car mewarisi property dan fungsi dari Vehicle.
class Car(name: String, val numberOfDoors: Int) : Vehicle(name, 180) {

    // Menambahkan informasi jumlah pintu pada deskripsi.
    override fun describe(): String {
        return "$name dapat melaju hingga $maxSpeed km/h dan punya $numberOfDoors pintu"
    }
}

// Motorcycle mewarisi property dan fungsi dari Vehicle.
class Motorcycle(name: String, val hasSidecar: Boolean) : Vehicle(name, 220) {

    // Menentukan deskripsi berdasarkan ada atau tidaknya sidecar.
    override fun describe(): String {
        val sidecar = if (hasSidecar) "dengan sidecar" else "tanpa sidecar"
        return "$name dapat melaju hingga $maxSpeed km/h ($sidecar)"
    }
}

fun main() {
    val vehicles = listOf<Vehicle>(
        Car("Toyota", numberOfDoors = 4),
        Motorcycle("Ninja", hasSidecar = false)
    )

    // Memanggil describe() sesuai class masing-masing.
    vehicles.forEach { println(it.describe()) }
}