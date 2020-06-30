fun main() {
    println("-------------Progam Penjumlahan-------------")
    print("Masukkan Bilangan Pertama : ")
    var input1 = readLine()!!
    print("Masukkan Bilangan Kedua : ")
    var input2 = readLine()!!
    println("--------------------------------------------")
    print("Masukkan operasi perhitungan yang diinginkan: ")
    var input3 = readLine()!!

    if (input1 == "") input1 = "0"
    if (input2 == "") input2 = "0"

    fun cekHasil(input3: String) {
        when (input3) {
            "pertambahan" -> {
                var hasil = Pertambahan(input1.toInt(), input2.toInt())
                hasil.tulis()
            }
            "perkalian" -> {
                var hasil = Perkalian(input1.toInt(), input2.toInt())
                hasil.tulis()
            }
            "" -> {
                println("Anda belum memasukkan operasi yang diinginkan")
                println("--------------------LOOP--------------------")
                print("Masukkan operasi perhitungan yang diinginkan: ")
                var input3 = readLine()!!
                cekHasil(input3)
            }
            else -> {
                println("Perhitungan yang anda inginkan belum terimplementasi")
            }
        }
    }

    cekHasil(input3)
}


