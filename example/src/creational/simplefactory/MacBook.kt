package creational.simplefactory

/**
 * 具体的产品类
 */
class MacBook private constructor(): Computer() {
    override fun work() {
        println("你正在使用的是MacBook")
    }
}