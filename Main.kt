import java.util.*

fun main(vararg args: String ) {
    print( "hello what is your name: " )

    val name = readLine( )

    val reader = Scanner( System.`in` )
    print( "how old are you: " )

    val age:Int = reader.nextInt( )

    print( "do you have any animals(y/n): " )
    val animals = readLine( )

    var numberOfAnimals = 0
    if( animals.equals( "yes" ) || animals.equals( "y" ) ) {
        print( "how many: " )
        numberOfAnimals = reader.nextInt()
    }

    println( "hello $name" )
    println( "you are $age" )
    if( numberOfAnimals >= 1 )
        println( "you have $numberOfAnimals animal(s)" )
}