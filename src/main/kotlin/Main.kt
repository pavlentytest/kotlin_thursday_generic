fun main(args: Array<String>) {
    val ivan = Person(34534, "Ivan")
    val petr = Person("N23424", "Petr")
    ivan.checkTypeId()
    petr.checkTypeId()
    ivan.checkVal(456)
    petr.checkVal("SDsd")

    val word1: Word<String, String> = Word("test1","test2")
    val word2: Word<String, Int> = Word("tttt",2222)

    toShow("123123")
    toShow(111)
    toShow(true)

}
// обобщенная функция
fun <T> toShow(obj: T) {
    println(obj)
}
class Word<K, V>(val param1: K, val param2: V)
class Person<T>(val id: T, val name: String) {
    fun checkTypeId() {
        when(id) {
            is Int -> println("id is an Integer")
            is String -> println("id is a String")
        }
    }
    fun checkVal(id22: T) {
        if(id == id22) {
            println("Valid")
        } else {
            println("Invalid")
        }
    }

}