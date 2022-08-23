fun main() {
    val a = arrayOf(25,30,23,72,20)
    println("The given array is: ")
    for (i in 0..a.size-1)
    {
        print(" " + a[i])
    }
    println()

    var maxele = a[0]
    for (i in a)
    {
        if (maxele < i)
        {
            maxele = i
        }
    }
    println("The maximum number is: $maxele")
}