var myArray = Array<Int>(10){0};
var myArray1 = arrayOf(1,2,3,4,5);

fun main(){
    for(ele in myArray){
        print("$ele ");
    }
    for(ele in myArray1){
        print("$ele ");
    }
    println(myArray1.size)
    myArray[3] = 10;
    println(myArray.get(5))

    var charList = charArrayOf('c','o','b','r','a')
    var str = String(charList)
    println(str);
    println(str.length);
    
}
