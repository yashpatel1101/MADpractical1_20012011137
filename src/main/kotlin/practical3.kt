fun main(){
    print("Enter number : ")
    var x = readLine()!!.toLong()

    print("Enter your name : ")
    var y= readLine()!!.toString()

    print("Enter your Branch : ")
    var Branch= readLine()!!.toString()

    print("Enter your Class : ")
    var clas= readLine()!!.toString()

    print("Enter your Batch : ")
    var batch= readLine()!!.toString()

    print("Enter your College name : ")
    var clg= readLine()!!.toString()

    print("Enter your University name : ")
    var uni= readLine()!!.toString()

    print("Enter your Age : ")
    var age= readLine()!!.toInt()

    println("*********************")
    println("Student number is $x")
    println("Student name is $y")
    println("Student branch $Branch")
    println("Student class $clas")
    println("Student batch $batch")
    println("Student collage $clg")
    println("Student University $uni")
    println("Student age $age")
}