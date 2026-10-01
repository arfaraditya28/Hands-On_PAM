// Hands-on 3: Variance — declaration-site "out"
// Solusi: Menggunakan out pada T agar Container<Cat> dapat digunakan sebagai Container<Animal>.

open class Animal(val name: String)
class Cat(name: String) : Animal(name)

// T hanya digunakan sebagai nilai keluaran, sehingga menggunakan out.
interface Container<out T> {
    fun get(): T
}

class CatContainer(private val cat: Cat) : Container<Cat> {
    override fun get(): Cat = cat
}

fun printAnimalName(container: Container<Animal>) {
    println("Nama hewan: ${container.get().name}")
}

fun main() {
    val catContainer: Container<Cat> = CatContainer(Cat("Whiskers"))

    // Container<Cat> dapat digunakan sebagai Container<Animal>.
    printAnimalName(catContainer)
}