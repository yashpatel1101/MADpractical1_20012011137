open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age
        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age: Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }

}
fun main(){
    var s1=Student("Yash","Patel",18,20012011098,"CE","C","AB8")
    var s2=Student("Jay","Patel",19,20012011150,"CE","C","AB6")
    var s3=Student("Dhyan","Raval",21,20012011190,"IT","B","AB2")
    var s4=Student("Jaimin","Desai",20,20012011086,"CE","A","AB4")
    var s5=Student("Meet","Mehta",21,20012010012,"AI","A","AB3")

}