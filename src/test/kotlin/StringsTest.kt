import kotlin.test.Test
import kotlin.test.assertEquals

class StringsTest {

    @Test
    fun testCapitalizeSentenceWithOneWord(){
        val stringsOperations = Strings()
        val result = stringsOperations.capitalizeSentence("hello")
        assertEquals(result, "Hello")
    }

    @Test
    fun testCapitalizeSentence(){
        val stringsOperations = Strings()
        val result = stringsOperations.capitalizeSentence("this is a house")
        assertEquals(result, "This Is A House")
    }
}