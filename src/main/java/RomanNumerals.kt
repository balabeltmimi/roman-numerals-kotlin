class RomanNumerals {
    fun convert(number: Int): String {
        val numbers = arrayOf("I", "II", "III", "IV")
        return numbers[number - 1]
    }

}
