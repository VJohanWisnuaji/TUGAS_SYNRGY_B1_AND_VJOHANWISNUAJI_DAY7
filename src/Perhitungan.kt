internal open class Perhitungan(angka1: Int, angka2: Int) {
    var rumus: Int = 0

    open fun tulis() {
        println("Hasil perhitungan kedua Bilangan tersebut adalah ${rumus}")
    }
}