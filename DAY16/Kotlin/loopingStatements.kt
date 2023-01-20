
fun main(){

    // for(i in (1..5)){
    //     println(i);
    // }
    // output : 1
    //          2
    //          3
    //          4
    //          5

    // for(i in 1..10 step 2){ //print odd numbers
    //     println(i);
    // }
    // for(i in 10 downTo 1){ //print 10 to 1
    //     println(i);
    // }

    // for(i in 1..10){
    //     println(i);
    // }

    loop1@ for(i in 1..5){
        for(j in 1..5){
            println("i value $i and j value $j")
            if(j==2){
                break@loop1;
            }
        }
    }
    println(add());
    add1(5,4);
}
fun add():Int{
    return 1+2+2;
}
fun add1(num:Int,num1:Int){
    println(num+num1);
}