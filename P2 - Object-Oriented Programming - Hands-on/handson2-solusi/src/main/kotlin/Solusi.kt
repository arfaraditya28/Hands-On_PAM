// Hands-on 2: Interface & Data Class
// Solusi: Mengimplementasikan interface Payable pada data class Employee serta menggunakan fitur copy(), equals(), dan toString().

interface Payable {

    // Mendeklarasikan fungsi yang wajib diimplementasikan oleh Employee.
    fun calculateSalary(): Double
}

// Data class otomatis menyediakan equals(), hashCode(), toString(), dan copy().
data class Employee(
    val name: String,
    val baseSalary: Double,
    val bonus: Double
) : Payable {

    // Menghitung gaji dari base salary dan bonus.
    override fun calculateSalary(): Double {
        return baseSalary + bonus
    }
}

fun main() {
    val alice = Employee(
        "Alice",
        baseSalary = 5_000_000.0,
        bonus = 500_000.0
    )

    // Membuat object baru dari alice dengan name yang berbeda.
    val bob = alice.copy(name = "Bob")

    println("Gaji ${alice.name}: ${alice.calculateSalary()}")
    println("Gaji ${bob.name}: ${bob.calculateSalary()}")

    // Membuat object dengan data yang sama seperti alice.
    val aliceDuplicate = alice.copy()
    println("alice == aliceDuplicate? ${alice == aliceDuplicate}")

    // Menampilkan isi object menggunakan toString() bawaan data class.
    println(alice)
}