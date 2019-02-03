import java.lang.IllegalArgumentException

fun <T : Any> getAnimalType(animal: T) = animal.hashCode()


fun printSum(someCollection : Collection<*>){
   val intSum:List<Int> = someCollection as? List<Int> ?: throw IllegalArgumentException("Something went wrong")
}

inline fun <reified T> isCorrectValueType(value : Any) = value is T

fun main(vararg args: String) {
    println(isCorrectValueType<String>("String"))
    println(isCorrectValueType<String>(123))
}