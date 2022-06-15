package com.example.firstassignment

import java.lang.NumberFormatException
import java.util.*



fun main(){
    calculate()
}

fun calculate(){

    println("შეიყვანეთ პრიველი რიცხვი")
    var X = readLine()!!.toInt()
    println("შეიყვანეთ მეორე რიცხვი")
    var Y = readLine()!!.toInt()
    var Z = X + Y
    println("$X-ის და $Y-ს ჯამი არის $Z")

    continueOrNot()

}

fun continueOrNot(){
    println("გსურთ თამაშის გაგრძელება? (ჩაწერეთ Y ან N)")

    var answer = readLine()

    if(answer == "N"){
        println("ნახვამდის!")
    }else if (answer == "Y"){
        calculate()
    }else{
        println("ჩაწერეთ მხოლოდ N ან Y")
    }
}




