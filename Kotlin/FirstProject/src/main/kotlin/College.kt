class College {
    var collegeName:String = ""
    fun displayClg() {
        println(collegeName)
    }
    inner class Branch {
        var branchName:String = ""
        var branchCode:String = ""
        fun displayBranch() {
            println(branchName)
            println(branchCode)
        }
    }
    inner class Student {
        var studentName:String = ""
        var studentPlace:String = ""
        fun displayStudent() {
            println(studentName)
            println(studentPlace)
        }
    }
}
fun main() {
    val clgObj = College()
    print("Enter College Name : ")
    clgObj.collegeName = readln()
    print("Enter Branch Name : ")
    val branch = clgObj.Branch()
    branch.branchName = readln()
    print("Enter Branch Code : ")
    branch.branchCode = readln()
    val std = clgObj.Student()
    print("Enter Student Name : ")
    std.studentName = readln()
    print("Enter Student Place : ")
    std.studentPlace = readln()

    println("Student's details :-")
    clgObj.displayClg()
    branch.displayBranch()
    std.displayStudent()
}