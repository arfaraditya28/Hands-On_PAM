// Hands-on 1: Higher-Order Function
// Solusi: Menggunakan higher-order function untuk menjalankan operasi tambah, kurang, dan kali melalui lambda.

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {

    // Menjalankan operation dengan a dan b.
    return operation(a, b)
}

fun main() {

    // Menggunakan lambda untuk penjumlahan.
    val tambah = calculate(10, 4) { x, y -> x + y }
    println("Tambah: $tambah")

    // Menggunakan lambda untuk pengurangan.
    val kurang = calculate(10, 4) { x, y -> x - y }
    println("Kurang: $kurang")

    // Menggunakan lambda untuk perkalian.
    val kali = calculate(10, 4) { x, y -> x * y }
    println("Kali: $kali")
}