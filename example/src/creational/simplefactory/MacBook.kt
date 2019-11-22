package creational.simplefactory

/**
 * 具体的产品类
 */
class MacBook : Computer() {
    override fun work() {
        println("你正在使用的是MacBook")
    }
}