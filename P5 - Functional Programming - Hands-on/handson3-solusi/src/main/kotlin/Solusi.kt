// Hands-on 3: Closure — Counter Factory
// Solusi: Menggunakan closure untuk menyimpan state count yang berbeda pada setiap counter.

fun makeCounter(): () -> Int {
    // Menyimpan nilai hitungan yang akan digunakan oleh closure.
    var count = 0

    // Lambda menangkap variabel count dan menaikkan nilainya setiap dipanggil.
    return {
        count++
        count
    }
}

fun main() {
    val counterA = makeCounter()
    val counterB = makeCounter()

    println(counterA()) // 1
    println(counterA()) // 2
    println(counterA()) // 3

    println(counterB()) // 1
    println(counterB()) // 2
}