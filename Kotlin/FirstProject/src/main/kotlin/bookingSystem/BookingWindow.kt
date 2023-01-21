package bookingSystem

fun main() {

    val bookingObj = Bookings()

    println("---Ticket Booking System---")
    whileloop@ while (true) {
        println("Choices \n 1:Add Customer\n 2:Book Ticket\n " +
                "3:View Ticket\n 4:Cancel Ticket\n " +
                "5:View Customers\n 6:View Tickets\n " +
                "7: Exit")
        when(readln().toInt()) {
            1 -> {//adding new customer
                val newCustomer = Customer().addCustomer()
                newCustomer.custId = bookingObj.custList.size+1
                bookingObj.custList[newCustomer.custId] = newCustomer
                println("Added Succesfully")
                println("Customer Id : ${newCustomer.custId}")
            }
            2 -> {
                print("Enter Customer Id: ")
                val currId:Int = readln().toInt()
                if(bookingObj.custList.containsKey(currId)){
                    bookingObj.bookTicket(currId)
                }
            }
            3 -> bookingObj.viewTicket()
            4 -> bookingObj.cancelTicket()
            5 -> bookingObj.viewCustomers()
            6 -> bookingObj.viewTickets()
            7 -> break@whileloop
        }
    }

}