class Strings {

    fun capitalizeSentence(str: String): String {
        return str.split(" ").joinToString(" ") { it.capitalize() }
    }
}