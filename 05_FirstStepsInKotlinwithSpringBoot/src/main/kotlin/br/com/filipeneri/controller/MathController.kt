package br.com.filipeneri.controller;

import br.com.filipeneri.converters.NumberConverter.convertToDouble
import br.com.filipeneri.converters.NumberConverter.isNumeric
import br.com.filipeneri.exceptions.UnsupportedMathOperationException
import br.com.filipeneri.math.SimpleMath
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


@RestController
class MathController {
    val counter: AtomicLong = AtomicLong()
    private val simpleMath: SimpleMath = SimpleMath()
    @RequestMapping(value = ["/sum/{numberOne}/{numberTwo}"])
    fun sum(@PathVariable(value="numberOne" ) numberOne: String?,
            @PathVariable(value="numberTwo" ) numberTwo: String?
    ): Double {//adicionando os paramentros
        if(!isNumeric(numberOne) || !isNumeric(numberOne)) throw UnsupportedMathOperationException("Please set a numeric value!")
        return simpleMath.sum(convertToDouble(numberOne) , convertToDouble(numberTwo))
    }
    @RequestMapping(value = ["/subtraction/{numberOne}/{numberTwo}"])
    fun subtraction(@PathVariable(value="numberOne" ) numberOne: String?,
            @PathVariable(value="numberTwo" ) numberTwo: String?
    ): Double {//adicionando os paramentros
        if(!isNumeric(numberOne) || !isNumeric(numberOne)) throw UnsupportedMathOperationException("Please set a numeric value!")
        return simpleMath.subtraction(convertToDouble(numberOne) , convertToDouble(numberTwo))
    }
    @RequestMapping(value = ["/multiplication/{numberOne}/{numberTwo}"])
    fun multiplication(@PathVariable(value="numberOne" ) numberOne: String?,
            @PathVariable(value="numberTwo" ) numberTwo: String?
    ): Double {//adicionando os paramentros
        if(!isNumeric(numberOne) || !isNumeric(numberOne)) throw UnsupportedMathOperationException("Please set a numeric value!")
        return simpleMath.multiplication(convertToDouble(numberOne) , convertToDouble(numberTwo))
    }
    @RequestMapping(value = ["/division/{numberOne}/{numberTwo}"])
    fun division(@PathVariable(value="numberOne" ) numberOne: String?,
            @PathVariable(value="numberTwo" ) numberTwo: String?
    ): Double {//adicionando os paramentros
        if(!isNumeric(numberOne) || !isNumeric(numberOne)) throw UnsupportedMathOperationException("Please set a numeric value!")
        return simpleMath.divisor(convertToDouble(numberOne) , convertToDouble(numberTwo))
    }
    @RequestMapping(value = ["/mean/{numberOne}/{numberTwo}"])
    fun mean(@PathVariable(value="numberOne" ) numberOne: String?,
            @PathVariable(value="numberTwo" ) numberTwo: String?
    ): Double {//adicionando os paramentros
        if(!isNumeric(numberOne) || !isNumeric(numberOne)) throw UnsupportedMathOperationException("Please set a numeric value!")
        return simpleMath.mean(convertToDouble(numberOne) , convertToDouble(numberTwo))
    }
    @RequestMapping(value = ["/squareRoot/{number}"])
    fun squareRoot(@PathVariable(value="number" ) number: String?): Double {//adicionando os paramentros
        if(!isNumeric(number)) throw UnsupportedMathOperationException("Please set a numeric value!")
        return simpleMath.squareRoot(convertToDouble(number))
    }

}
