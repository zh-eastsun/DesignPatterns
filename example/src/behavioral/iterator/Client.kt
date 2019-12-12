package behavioral.iterator

class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val data = ConcreteAggregate<String>()
            data.add("Java")
            data.add("Kotlin")
            data.add("Android")
            data.add("temp element")
            println(data.toString())

            data.remove("temp element")
            println(data.toString())
            println("------------------------")

            val iterator = data.iterator()
            while (iterator.hasNext()){
                val element = iterator.next()
                print("$element\t")
            }
        }
    }
}