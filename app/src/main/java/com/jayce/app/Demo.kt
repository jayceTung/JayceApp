package com.jayce.app

/**
 * Create by jayce.dong on 2022/5/26
 */
fun main() {
    val length = "derry".count()
    println(length)

    val length2 = "derry".count {
        it == 'r'
    }
    println(length2)

    val methodAction : (Int, Int, Int) -> String = { number1, number2, number3 ->
        val index = number1
        "${index}, ${number2}, ${number3}"
    }

    println(methodAction(1, 2, 3))

    val number: Int? = "666.3".toIntOrNull()
    println(number)
}

class Demo {

}

object MyShop {

}