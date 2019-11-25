package structural.flyweight

/**
 * 负责调用的客户端类
 */
class Client{
    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            var thinkPadX1 = Foxconn.getThinkPad("ThinkPad-X1")
            thinkPadX1.doWork()
            var thinkPadX280 = Foxconn.getThinkPad("ThinkPad-X280")
            thinkPadX280.doWork()
            var thinkPadX = Foxconn.getThinkPad("ThinkPad-X1")
            println("${thinkPadX1 == thinkPadX}")

        }
    }
}