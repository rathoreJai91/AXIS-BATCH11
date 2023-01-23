package dataBases

fun main() {
    var crudObj = CRUD()
    crudObj.createConnection()
    var database:HashMap<String,ArrayList<String>> = HashMap()
    whileloop@while(true){
        println("----Perform CRUD operations----")
        println("select options\n 1:Create Table\n " +
                "2:Insert into Table\n " +
                "3:Search In Table\n 4:Exit")
        when(readln().toInt()){
            1 -> {
                print("Enter table name :")
                var tableName:String = readln()
                if(!database.containsKey(tableName)){
                    print("No of columns in table: ")
                    var colNum:Int = readln().toInt()
                    var colNames:ArrayList<String> = crudObj.createTable(tableName,colNum)
                    database[tableName] = colNames
                }else{
                    println("Table Already Present")
                }

            }
            2 -> {
                print("Enter table name: ")
                var tableName:String = readln()
                if(database.contains(tableName)){
                    crudObj.insertIntoTable(tableName )
                }else{
                    println("Table Absent")
                }
            }
            3 -> {
                print("Enter table name: ")
                var tableName:String = readln()
                if(database.contains(tableName)){
                    crudObj.searchIntoTables(tableName )
                }else{
                    println("Table Absent")
                }
            }
            4 -> break@whileloop
        }

    }
}