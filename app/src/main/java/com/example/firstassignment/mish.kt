package com.example.firstassignment

fun main(){

    calculate()
}

fun calculate(){

    println("შეიყვანეთ პრიველი რიცხვი")
    val X = readLine()!!.toInt()

    println("შეიყვანეთ მეორე რიცხვი")
    val Y = readLine()!!.toInt()

    val Z = X + Y
    println("$X-ის და $Y-ს ჯამი არის $Z")

    continueOrNot()

}

fun continueOrNot(){
    println("გსურთ თამაშის გაგრძელება? (ჩაწერეთ Y ან N)")

    when (readLine()) {
        "N" -> {println("ნახვამდის!")}
        "Y" -> {calculate()}
        else -> {println("ჩაწერეთ მხოლოდ N ან Y")}
    }
}




