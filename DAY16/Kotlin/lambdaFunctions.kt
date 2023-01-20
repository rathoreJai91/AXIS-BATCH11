import kotlin.text.*

fun main(){

    //var myFunction : (Int) -> Unit = {i:Int -> println(i)}
    // addAll(10,20,myFunction);
    // myfunctiondemo(15,24)
    dataFormat();
}

var myfunctiondemo : (Int,Int) -> Unit={i:Int,j:Int ->println(i+j)}

fun addAll(num:Int, num1:Int, myFunction:(Int) -> Unit){
    myFunction(num+num1);
}

fun dataFormat(){
    val format1:(String,String)->String={ data1,data2 -> "$ $data1 $ $data2"}
    println(format1("Lchupa","kabra"))
}