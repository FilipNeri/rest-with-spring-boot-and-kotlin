package br.com.filipeneri.converters

object NumberConverter {
    fun convertToDouble(strNumber: String?): Double{
        if(strNumber.isNullOrBlank()) return 0.0
        val number = strNumber.replace(",".toRegex(), ".")
        return if(isNumeric(number)) number.toDouble() else 0.0
    }
    fun isNumeric(strNumber:String?): Boolean{
        if(strNumber.isNullOrBlank()) return false
        val number = strNumber.replace(",".toRegex(), ".")
        return  number.matches("""[-+]?[0-9]*\.?[0-9]+""".toRegex())
    }
}