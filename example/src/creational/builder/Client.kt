package creational.builder

/*
    客户端
 */

class Client {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var macBook: Computer = MacBookBuilder().setCpu("Intel i5-5200u").setOs("MacOS-X").build()
            macBook.name = "MacBook Pro"
            macBook.work()

            var thinkPad: Computer = ThinkPadBuilder().setCpu("Intel i5-8400").setOs("windows 10 pro").build()
            thinkPad.name = "ThinkPad-X1"
            thinkPad.work()
        }
    }
}