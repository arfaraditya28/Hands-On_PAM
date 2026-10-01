// Hands-on 3: Sealed Class untuk State
// Solusi: Menggunakan sealed class untuk merepresentasikan state network dan when untuk menangani setiap kemungkinan state.

sealed class NetworkResult

// Loading tidak membutuhkan data tambahan.
object Loading : NetworkResult()

// Success membawa data berupa String.
data class Success(val data: String) : NetworkResult()

// Error membawa pesan error berupa String.
data class Error(val message: String) : NetworkResult()

fun describe(result: NetworkResult): String {
    // Menangani setiap state menggunakan when tanpa else.
    return when (result) {
        is Loading -> "Sedang memuat..."
        is Success -> "Berhasil: ${result.data}"
        is Error -> "Gagal: ${result.message}"
    }
}

fun main() {
    println(describe(Loading))
    println(describe(Success("Data pengguna berhasil diambil")))
    println(describe(Error("Koneksi terputus")))
}