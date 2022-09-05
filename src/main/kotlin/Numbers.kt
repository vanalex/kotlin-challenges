class Numbers {
    fun filterOdd(list: List<Int>): List<Int> {
        return list.filter { it % 2 == 1 }
    }

    fun containsRange(range1: IntRange, range2: IntRange) =
        range2.first >= range1.first && range2.last <= range1.last

    fun sum(number: Int) = (1..number).sum()


}