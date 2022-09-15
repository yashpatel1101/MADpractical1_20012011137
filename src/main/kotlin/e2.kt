open class Product(name: String,quantity: Int){
    var p:Int=-1
    init {
        println("Product name :$name")
        println("Quantity: $quantity")

    }
    constructor(name: String,quantity: Int,p: Int) : this(name,quantity){
        this.p=p
        println("Price :$p per piece")
    }
}
class Laptop(name: String,quantity: Int,price : Int,cpu_n:String,RAM_s:String):Product(name,quantity,price){
    var hdd:String=""
    init{
        println("CPU name:$cpu_n")
        println("RAM_Size:$RAM_s")

    }
    constructor(name: String,quantity:Int,price: Int,cpu_n: String,RAM_s: String,hdd:String):this(name,quantity,price,cpu_n,RAM_s){
        this.hdd=hdd
        println("HDD_Size:$hdd")
        println("---------------")
    }

}

fun main(){
    var l1=Laptop("Hp",2,80000,"8Core","8GB","512")
    var l2=Laptop("Lenovo",3,550000,"8Core","16GB","256")
    var l3=Laptop("Asus",1,45000,"8Core","4GB","512")
    var l4=Laptop("Dell",1,50000,"8Core","8GB","256")
    var l5=Laptop("Apple",2,12000,"8Core","16GB","512")
}