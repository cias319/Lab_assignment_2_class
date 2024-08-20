fun sumof(list:List<Int>):Int{
    var s=0
    for (i in list)
    {
        s=s+i
    }
    return s
}
fun main()
{
    val list = listOf(1,2,3,4,5)
    val sum = list.sum()
    println(sum)
}