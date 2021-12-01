class Pila<T> {
    var lista = mutableListOf<T>()

    fun tope() = if (!lista.isEmpty()) lista.get(lista.size) else 0

    fun push(o:T) = lista.add(lista.size, o)

    fun pop() = lista.removeAt(lista.size)

    fun vacia() = tope()==0||lista.size==0
}

fun<T> reverse(lista: MutableList<T>):MutableList<T>{
    var p:Pila<T> = Pila()
    val ite = lista.listIterator(lista.size)

    while (ite.hasPrevious()){
        p.push(ite.previous())
    }
    return p.lista
}

fun main(){
    var numbers = listOf("one", "two", "three", "four")
    var numbersRev = reverse(numbers.toMutableList())
    if (!listOf("four", "three", "two", "one").equals(numbersRev))
        println("Error")
    else
        println("Correcto")
    println(numbersRev)
}