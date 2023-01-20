open class College {
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
        inner class Student {
            var studentName:String = ""
            var studentPlace:String = ""
            fun displayStudent() {
                println(studentName)
                println(studentPlace)
            }
        }
    }
}
fun main() {
    var clgObj = College()
    print("Enter College Name : ")
    clgObj.collegeName = readln()
    print("Enter Branch Name : ")
    clgObj.Branch().branchName = readln()
    print("Enter Branch Code : ")
    clgObj.Branch().branchCode = readln()
    print("Enter Student Name : ")
    clgObj.Branch().Student().studentName = readln()
    print("Enter Student Place : ")
    clgObj.Branch().Student().studentPlace = readln()

    println("Student's details :-")
    clgObj.displayClg()
    clgObj.Branch().displayBranch()
    clgObj.Branch().Student().displayStudent()
}