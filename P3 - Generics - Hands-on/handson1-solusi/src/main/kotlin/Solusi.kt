// Hands-on 1: Generic Class — Box<T>
// Solusi: Menggunakan generic untuk menyimpan berbagai tipe data dan map<R> untuk mengubah isi Box menjadi tipe data lain.

class Box<T>(val value: T) {

    // Mengubah isi Box menjadi tipe R tanpa mengubah Box asli.
    fun <R> map(transform: (T) -> R): Box<R> {
        return Box(transform(value))
    }
}

fun main() {
    val intBox = Box(23)
    println("intBox.value = ${intBox.value}")

    val cupBox = Box("cup")
    println("cupBox.value = ${cupBox.value}")

    // Mengubah Box<Int> menjadi Box<String>.
    val stringBox = intBox.map { "Angka: $it" }
    println("stringBox.value = ${stringBox.value}")

    // Mengubah Box<String> menjadi Box<Int>.
    val lengthBox = cupBox.map { it.length }
    println("lengthBox.value = ${lengthBox.value}")
}