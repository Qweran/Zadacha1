import jdk.incubator.vector.VectorOperators.Conversion
import java.util.Scanner

fun main()
{
    val scan = Scanner(System.`in`)
    println("Введите сумму не меньше 35")
    val amount  = scan.nextInt()
    if(amount > 35)
    {
      val ost =  amount * 0.75
        println(ost.toString() + " " + "ваша коммисия")
    }
    else
        println("< 35")

    println("Введите сумму")
    val a = scan.nextInt()
    println("Введите true || false")

    val b = scan.nextBoolean()
    like(a, b)

    println("Введите кол-во лайков, а я вам слово правильое дам")
    val c = scan.nextInt()
   println( peoplecount(c))
}
fun like(  a: Int , b: Boolean )
{
    val sum = a
 val s: Boolean = b

    if( sum > 1001 && sum < 10000)
    {
        val count = sum - 100

        if(s)
        {

           val countcur = sum * 0.01
            val count1 =  sum - countcur
            if(sum > 10001)
            {
                val count2 = sum * 0.05
                val count3 = sum - count2 - countcur
                println(count3.toString() + "беда")
            }
            println("Сумма покупки" + " " + count1.toString())

        }
else
        println("Сумма покупки" + " " + count.toString())

    }

    else if(sum >= 10001)
    {
        val count2 = sum * 0.05
        val count3 = sum - count2

        println(count3.toString() +" " +  "beda2" )
    }
    else
    {
        println(sum)
    }


}

fun peoplecount(count:Int): String
{
    val words = arrayOf("человек", "человека", "человек")
    val mod10 = count%10
    val mod100 = count%100
    return when {
        mod100 in 11..19 -> "$count ${words[2]}"
        mod10 == 1 -> "$count ${words[0]}"
        mod10 in 2..4 -> "$count ${words[1]}"
else -> "$count ${words[2]}"
    }

}