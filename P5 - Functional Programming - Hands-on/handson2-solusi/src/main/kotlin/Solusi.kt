// Hands-on 2: Lambda vs Function Reference
// Solusi: Menggunakan lambda dan function reference untuk menghasilkan data yang sama melalui proses filter dan map.

fun isEvenLength(s: String): Boolean = s.length % 2 == 0

fun toUpper(s: String): String = s.uppercase()

fun main() {
    val mahasiswa = listOf("Andi", "Budi", "Citra", "Dewi", "Eka", "Fajar")

    // Menggunakan lambda untuk filter dan map.
    val hasilLambda: List<String> = mahasiswa
        .filter { it.length % 2 == 0 }
        .map { it.uppercase() }

    // Menggunakan function reference untuk filter dan map.
    val hasilReference: List<String> = mahasiswa
        .filter(::isEvenLength)
        .map(::toUpper)

    println("Lambda   : $hasilLambda")
    println("Reference: $hasilReference")
    println("Sama? ${hasilLambda == hasilReference}")
}