package structural.flyweight

import kotlin.system.exitProcess

/**
 * 负责调用的客户端类
 */
class Client{
    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            val thinkPadX1 = Foxconn.getThinkPad("ThinkPad-X1")
            thinkPadX1.doWork()
            val thinkPadX280 = Foxconn.getThinkPad("ThinkPad-X280")
            thinkPadX280.doWork()
            // 第二次使用时与第一次使用的是同一个对象
            val thinkPadX = Foxconn.getThinkPad("ThinkPad-X1")
            thinkPadX.doWork()
            println("${thinkPadX1 === thinkPadX}")

            exitProcess(0)

        }
    }
}