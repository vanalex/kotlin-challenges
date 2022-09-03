import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NumbersTest {

    @Test
    fun testGetOddNumbers(){
        val numbers = Numbers()
        var result = numbers.filterOdd(listOf(1, 2, 3))
        assertEquals(result, listOf(1, 3))

        result = numbers.filterOdd(listOf(4, 6, 8, 7, 9))
        assertEquals(result, listOf(7, 9))
    }

}