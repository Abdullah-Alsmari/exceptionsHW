fun main(args:Array<String>) {

    val a =10
    val b =0
    //we  are dividing a over b
    //if b=0 it will catch the exception that no number can be divided by zero
    val result= try {
        println("inside trying")
        a/b

    } catch (e:ArithmeticException){
        println("cant divide by 0")
        "undefined"
    }
    println("result is $result")

}