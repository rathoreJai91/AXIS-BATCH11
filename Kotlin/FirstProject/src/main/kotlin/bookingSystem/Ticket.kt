package bookingSystem

import java.time.LocalDate
import java.time.LocalTime

class Ticket {

    var ticketNo:Int = 0
    private var from:String = ""
    private var to:String = ""
    private var date:LocalDate = LocalDate.now()
    private var time:LocalTime = LocalTime.now()
    private var cost:Int = 0
    private var pref:String = ""
    private var seatNo:Int = 0
    private var custId:Int = 0

    fun newTicket(id:Int) : Ticket {
        println("Enter Journey details :-")
        print("From : ")
        this.from = readln()
        print("To : ")
        this.to = readln()
        print("Date (YYYY-MM-DD): ")
        this.date = LocalDate.parse(readln())
        print("Time (HH:MM:SS): ")
        this.time = LocalTime.parse(readln())
        print("Cost : ")
        this.cost = readln().toInt()
        print("Seat Preference : ")
        this.pref = readln()
        print("Seat Number : ")
        this.seatNo = readln().toInt()
        this.custId = id
        return this
    }
    fun printTicket() {
        println("Ticket Number : ${this.ticketNo}")
        println("From : ${this.from}")
        println("To : ${this.to}")
        println("Journey Date : ${this.date}")
        println("Journey Time : ${this.time}")
        println("Journey cost : ${this.cost}")
        println("Preference : ${this.pref}")
        println("Seat Number : ${this.seatNo}")
        println("Customer Id : ${this.custId}")
    }
    fun cancelTicket() {
        this.printTicket()
        println("Confirm cancellation \n 1: No\n 2:Yes")
        val selection:Int = readln().toInt()
        if(selection==2){
            Bookings().ticketList.remove(this.ticketNo)
            println("Ticket Cancelled")
        }else{
            println("Cancellation stopped")
        }
    }

}