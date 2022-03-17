fun jarak1(x1: Int = 2, y1: Int = 3, x2: Int = 8, y2: Int = 7): Double {
    val jumlah1 = x2 - x1
    val jumlah2 = y2 - y1
    val jarak1 = (jumlah1 * jumlah1) + (jumlah2 * jumlah2)
    val hasil = Math.sqrt(jarak1.toDouble())
    return hasil
}

fun jarak2(x1_2: Int = 5, y1_2: Int = 3, x2_2: Int = -8, y2_2: Int = -4): Double {
    val jumlah3 = x2_2 - x1_2
    val jumlah4 = y2_2 - y1_2
    val jarak2 = (jumlah3 * jumlah3) + (jumlah4 * jumlah4)
    val hasil = Math.sqrt(jarak2.toDouble())
    return hasil
}

fun main(){
    println("jarak dari (2,3) ke (8,7) : ${jarak1()}")
    println("jarak dari (5,3) ke (-8,-4) : ${jarak2()}")
}

