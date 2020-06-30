internal class Pertambahan(
    angka1: Int,
    angka2: Int
) : Perhitungan(
    angka1, angka2
) {
    private var pertambahan: Int = angka1 + angka2

    override fun tulis() {
        println("Hasil penjumlahan kedua Bilangan tersebut adalah ${pertambahan}")
    }
}