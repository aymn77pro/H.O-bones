fun main() {
    println("put your number")
    var n = readLine()!!.toInt()

    //H.W 1
    var myMap= mapOf<Int,String>(11 to "aymn",12 to "ali",13 to "khalid",14 to "ahmed", 15 to "abrahem").toMutableMap()
    myMap.put(16,"aymn")
    println(myMap)
    myMap[1]="kotlin"
    println(myMap)
    myMap.remove(1)
    println(myMap)
    println("------------------------------------------------------------------------")
    // H.W 2
    var myMap2= mapOf("a" to "aymn","k" to "khalid","r" to "rakan").toMutableMap()
    println(myMap2)
    myMap2.putAll(listOf("aymn", "ali", "al shehri").mapIndexed { index, s -> index.toString() to s })
    println(myMap2)
    println("------------------------------------------------------------------------")
    // bones

    for (y in 1..n){
        for (x in 1..y){
            print("1*$x=${x*1}  ")
        }
        println(" ")
    }
}