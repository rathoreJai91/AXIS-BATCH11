package dataBases

import java.sql.DriverManager
import java.sql.SQLException
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.Statement

class JdbcDemo {
    private var conn:Connection ?= null
    fun createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance()
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system","root","rajputjai91")
        }catch (e:SQLException){
            print(e)
        }
    }

    fun selectQuery() {
        var stm:Statement ?= null
        print("Enter user id :")
        var id = readln().toInt()
        var sql = "select * from account where accountid<$id;"
        var res:ResultSet ?= null
        try {
            stm = conn!!.createStatement()
            res = stm!!.executeQuery(sql)
            while(res!!.next()){
                print("${res.getInt("accountid")}\t")
                print("${res.getLong("accountno")}\t")
                print("${res.getFloat("accountbalance")}\t")
                print("${res.getString("accounttype")}\t")
                print("${res.getString("accountstatus")}\t")
                //print("${res.getInt("bankid")}\t")
                print("${res.getInt("customerid")}\t")
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
    fun executeQueryOfDatabase() {
        var stm:Statement ?= null
        var sql = "show tables;"
        var res:ResultSet ?= null
        try {
            stm = conn!!.createStatement()
            println(res)
            res = stm!!.executeQuery(sql)
            println(res)
            while(res!!.next()){
               println(res.getString("Tables_in_banksystem"))
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

    fun createTable() {
        var prestat:PreparedStatement ?= null
        var sql ="create table demo2(id int not null auto_increment," +
                "name varchar(255),age int not null,primary key(id));"
        try{
            prestat = conn!!.prepareStatement(sql)
            var status = prestat.executeUpdate()
            print(status)
            if(status>0){
                print("table is created")
            }
        }catch(e:SQLException) {
            print(e)
        }
    }
    fun createTableUsingStam() {
        var stm:Statement ?= null
        var sql = "create table demo(id int not null auto_increment," +
                "name varchar(255),age int not null,primary key(id));"
        try{
            stm = conn!!.createStatement()
            stm.execute(sql)
            print("Table created")
        }catch(e:SQLException){
            print(e)
        }
    }
    fun insertIntoTable() {
        var prestat:PreparedStatement ?= null
        var sql = "insert into demo(name,age) values(?,?);"
        try{
            prestat = conn!!.prepareStatement(sql)
            prestat.setString(1, readln())
            prestat.setInt(2, readln().toInt())
            var status = prestat.executeUpdate()
            print(status)
            if(status>0){
                print("Data is inserted")
            }
        }catch(e:SQLException) {
            print(e)
        }
    }
    fun updateTables() {
        var preStat:PreparedStatement ?= null
        var sql = "update demo SET name=? where id=?;"
        try {
            preStat = conn!!.prepareStatement(sql)
            preStat.setString(1, readln())
            preStat.setInt(2, readln().toInt())
            var status = preStat.executeUpdate()
            if(status>0){
              print("table is updated")
            }
        }catch(e:SQLException) {
            print(e)
        }
    }
    fun deleteData() {
        var preStat:PreparedStatement ?= null
        var sql = "DELETE from demo where id=?;"
        try {
            preStat = conn!!.prepareStatement(sql)
            preStat.setInt(1, readln().toInt())
            var status = preStat.executeUpdate()
            if(status>0){
                print("data Deleted")
            }
        }catch(e:SQLException) {
            print(e)
        }
    }
    fun dropTable() {
        var preStat:PreparedStatement ?= null
        var sql = "DROP table ?;"
        try {
            preStat = conn!!.prepareStatement(sql)
            preStat.setString(1, readln())
            var status = preStat.executeUpdate()
            if(status>0){
                print("Table Deleted")
            }
        }catch(e:SQLException) {
            print(e)
        }
    }
    fun truncateTable() {
        var preStat:PreparedStatement ?= null
        var sql = "TRUNCATE table ?;"
        try {
            preStat = conn!!.prepareStatement(sql)
            preStat.setString(1, readln())
            var status = preStat.executeUpdate()
            if(status>0){
                print("All data inside table deleted")
            }
        }catch(e:SQLException) {
            print(e)
        }
    }
}
fun main() {
    var jdbcObj = JdbcDemo()
    jdbcObj.createConnection()
//    jdbcObj.selectQuery()
//    jdbcObj.createTable()
//    jdbcObj.createTableUsingStam()
    jdbcObj.insertIntoTable()
}