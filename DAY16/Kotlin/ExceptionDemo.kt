fun main(){
    try{
        var data = 20/0;
    }catch(e:Exception){
        println(e)
    }finally{
        print("complete of program");
    }
}