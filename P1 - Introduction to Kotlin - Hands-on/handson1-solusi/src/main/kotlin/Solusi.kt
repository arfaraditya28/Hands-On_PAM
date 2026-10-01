// Hands-on 1: Variabel, Fungsi & String Template
// Solusi: Menangani umur nullable dengan safe call (?.) dan Elvis operator (?:)

fun describeProfile(
    nama: String, umur: Int?, kota: String = "Tidak diketahui"): String {

    // Jika umur tidak null, tampilkan umur dalam tahun.
    // Jika null, tampilkan "umur tidak diketahui".
    val umurText = umur?.let { "$it tahun" } ?: "umur tidak diketahui"

    // Menggunakan string template untuk menggabungkan data profil.
    return "Nama: $nama, Umur: $umurText, Kota: $kota"
}

fun main() {
    println(describeProfile("Andi", 20, "Bandar Lampung"))
    println(describeProfile("Budi", null))
    println(describeProfile(nama = "Citra", umur = 19))
}