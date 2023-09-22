import kotlin.random.Random
fun main(args: Array<String>) {
    //одномерный массив
    val a = arrayOf(1, 2, 3, 4, 5)
    var sign = 1
    var sum = 0
    for (i in a.indices) {
        sum += sign * a[i]
        sign *= -1
    }
    print("Знакопеременная сумма: $sum")
    println()
    //двумерный массив

    val mas: Array<Array<Int>> = Array(23, { Array(40, { Random.nextInt(0, 2) }) })
    for (row in mas) {
        for (cell in row) {
            print("$cell \t")
        }
        println()
    }
    var free = 0
    for (i in mas.indices) {
        for (j in mas[i].indices) {
            if (mas[i][j] == 0) {
                free++
            }
        }
    }
    println("Общее число свободных мест: $free")
}