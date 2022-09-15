fun main() {

    println("With using third variable:")
    var a = 10
    var b = 20
    println("--Before swapping--")
    print("a = $a")
    println("b = $b")
    val temporary = a
    a = b
    b = temporary
    println("--After swapping--")
    println("a = $a")
    println("b = $b")

    println("Without using third variable")
    var a1 = 10
    var a2 = 20

    println("--Before swap--")
    println("a = $a1")
    println("b = $a2")

    a1 = a1 - a2
    a2 = a1 + a2
    a1 = a2 - a1

    println("--After swap--")
    println("a = $a1")
    println("b = $a2")
}