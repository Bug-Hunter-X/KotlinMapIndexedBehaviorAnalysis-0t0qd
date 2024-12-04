fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val doubledList2 = list.mapIndexed { index, i ->
        if (index % 2 == 0) i * 2 else i
    }
    println(doubledList2)

    //Correct way to handle list modification within mapIndexed
    val listCopy = list.toMutableList()
    val doubledList3 = list.mapIndexed { index, i ->
        if (index % 2 == 0) {
            listCopy[index] = i * 2
            i * 2
        } else i
    }
    println(doubledList3)
    println(listCopy)
}