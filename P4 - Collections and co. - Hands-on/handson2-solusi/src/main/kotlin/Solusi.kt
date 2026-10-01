// Hands-on 2: Grouping & Aggregation
// Solusi: Mengelompokkan transaksi berdasarkan kategori untuk menghitung total, lalu membuat Map berdasarkan ID transaksi.

data class Transaksi(val id: String, val kategori: String, val nominal: Int)

fun totalPerKategori(transaksi: List<Transaksi>): Map<String, Int> {

    // Mengelompokkan transaksi berdasarkan kategori lalu menjumlahkan nominalnya.
    return transaksi
        .groupBy { it.kategori }
        .mapValues { (_, transaksi) -> transaksi.sumOf { it.nominal } }
}

fun transaksiById(transaksi: List<Transaksi>): Map<String, Transaksi> {

    // Mengubah List menjadi Map dengan ID transaksi sebagai key.
    return transaksi.associateBy { it.id }
}

fun main() {
    val transaksi = listOf(
        Transaksi("TRX01", "Makanan", 50_000),
        Transaksi("TRX02", "Transportasi", 20_000),
        Transaksi("TRX03", "Makanan", 35_000),
        Transaksi("TRX04", "Hiburan", 100_000),
        Transaksi("TRX05", "Transportasi", 15_000)
    )

    println("Total per kategori: ${totalPerKategori(transaksi)}")

    val byId = transaksiById(transaksi)
    println("Cari TRX03: ${byId["TRX03"]}")
}