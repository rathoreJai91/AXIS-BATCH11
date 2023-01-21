package bookingSystem

class Bookings {

    var custList:HashMap<Int,Customer> = HashMap()
    var ticketList:HashMap<Int,Ticket> = HashMap()


    fun bookTicket(custId:Int) {
        val ticketDetail = Ticket().newTicket(custId)
        ticketDetail.ticketNo = ticketList.size+1
        ticketList[ticketDetail.ticketNo] = ticketDetail
        println("Ticket booked Successfully")
        println("Ticket Number : ${ticketDetail.ticketNo}")
    }
    fun viewTicket() {
        print("Enter ticket no :")
        val ticketNo = readln().toInt()
        if(ticketList.containsKey(ticketNo)){
            val currTicket = ticketList[ticketNo]
            currTicket?.printTicket()
        }else{
            print("Invalid ticket number")
        }
    }
    fun cancelTicket() {
        print("Enter ticket no :")
        val ticketNo = readln().toInt()
        if(ticketList.containsKey(ticketNo)){
            val currTicket = ticketList[ticketNo]
            currTicket?.cancelTicket()
        }else{
            print("Invalid ticket number")
        }
    }
    fun viewCustomers() {
        for(value in this.custList.values){
            value.printCustomer()
            println("------------")
        }
    }
    fun viewTickets() {
        for(value in ticketList.values){
            value.printTicket()
            println("------------")
        }
    }
}
