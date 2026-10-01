// Hands-on 3: Loops, Ranges & Null Safety
// Solusi: Menyaring skor null, menentukan skor kelulusan, dan mencetak bilangan ganjil.

class ScoreBoard(private val skorMentah: List<Int?>) {

    // Menghilangkan nilai null dari skorMentah.
    val skorValid: List<Int> = skorMentah.filterNotNull()

    fun skorKelulusan(batasLulus: Int): List<Int> {
        // Mengambil skor yang memenuhi batas lulus lalu mengurutkannya menurun.
        return skorValid.filter { it >= batasLulus }.sortedDescending()
    }
}

fun cetakRentangGanjil(sampai: Int) {

    // Mencetak bilangan ganjil dari 1 sampai sampai dengan step 2.
    for (i in 1..sampai step 2) {
        print("$i ")
    }
    println()
}

fun main() {
    val papan = ScoreBoard(listOf(85, null, 72, 90, null, 55, 100))
    println("Skor lulus (>= 70): ${papan.skorKelulusan(70)}")

    cetakRentangGanjil(10)
}