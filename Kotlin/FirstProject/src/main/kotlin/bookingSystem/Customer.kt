package bookingSystem

class Customer {
    var custId:Int = 0
    private var custName:String = ""
    private var custAge:Int = 0
    private var custPlace:String = ""

    fun addCustomer():Customer {
        println("Enter Customer Details")
        print("Name : ")
        this.custName = readln()
        print("Age : ")
        this.custAge = readln().toInt()
        print("Place : ")
        this.custPlace = readln()
        return this
    }
    fun printCustomer() {
        println("Id = ${this.custId}")
        println("Name = ${this.custName}")
        println("Age = ${this.custAge}")
        println("Place = ${this.custPlace}")
    }
}