internal class Perkalian(
        angka1: Int,
        angka2: Int
    ) : Perhitungan(
        angka1, angka2
    ) {
        private var perkalian: Int = angka1 * angka2

        override fun tulis() {
            println("Hasil perkalain kedua Bilangan tersebut adalah ${perkalian}")
        }
    }