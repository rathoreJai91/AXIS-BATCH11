package dataBases

import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException

class CRUD {

    var conn:Connection ?= null
    fun createConnection (){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance()
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system ","root","rajputjai91")
        }catch(e:SQLException){
            print(e)
        }
    }

    fun createTable(tableName:String , colNum:Int): ArrayList<String> {
        var preStat:PreparedStatement ?= null
        var colNames:ArrayList<String> = ArrayList()
        var sql = "create table $tableName("
        for(i in 1..colNum){
            print("Enter $i column name : ")
            var currColumnName:String = readln()
            print("Enter column details : ")
            var currAttribute:String = readln()
            sql += "$currColumnName $currAttribute"
            if(i==colNum){
                sql += ");"
            }else {
                sql += ','
            }
            colNames.add(currColumnName)
        }
        try{
            preStat = conn!!.prepareStatement((sql))
            var status =preStat.executeUpdate()
            println("table is created")
        }catch(e:SQLException){
            print(e)
        }
        return colNames
    }

    fun insertIntoTable(tableName:String) {
        var preStat:PreparedStatement ?= null
        var sql = "insert into $tableName (name,age) values(?,?)"
        try{
            preStat = conn!!.prepareStatement(sql)
            print("Enter name :")
            preStat.setString(1, readln())
            print("Enter age :")
            preStat.setInt(2, readln().toInt())
            var status = preStat.executeUpdate()
            println("Data is inserted")
        }catch(e:SQLException) {
            print(e)
        }
    }
    fun searchIntoTables(tableName:String) {
        var preStat:PreparedStatement ?= null
        var res:ResultSet ?= null
        var sql = "select * from $tableName where id=?;"
        try {
            preStat = conn!!.prepareStatement(sql)
            print("Enter id : ")
            preStat.setInt(1, readln().toInt())
            res = preStat!!.executeQuery()
            while(res!!.next()) {
                print("${res.getInt("id")}\t")
                print("${res.getString("name")}\t")
                print("${res.getInt("age")}\t")
                println()
            }
        }catch(e:SQLException) {
            print(e)
        }finally{
            if(res!=null){
                try{
                    res.close()
                    conn!!.close()
                }catch(e:SQLException) {
                    print(e)
                }
            }
        }
    }

}