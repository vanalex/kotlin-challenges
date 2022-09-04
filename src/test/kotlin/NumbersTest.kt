import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class NumbersTest {

    private val numbers: Numbers = Numbers()

    @Test
    fun testGetOddNumbers(){
        var result = numbers.filterOdd(listOf(1, 2, 3))
        assertEquals(result, listOf(1, 3))

        result = numbers.filterOdd(listOf(4, 6, 8, 7, 9))
        assertEquals(result, listOf(7, 9))
    }

    @Test
    fun testRangeContainsRange(){
        assertTrue(numbers.containsRange(5..7, 5..7))
        assertTrue(numbers.containsRange(1..12, 5..7))
        assertFalse(numbers.containsRange(5..8, 5..9))
    }

}