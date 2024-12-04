fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val doubledList2 = list.mapIndexed { index, i ->
        if (index % 2 == 0) i * 2 else i
    }
    println(doubledList2)
}