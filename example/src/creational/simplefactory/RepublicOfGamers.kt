package creational.simplefactory

class RepublicOfGamers private constructor(): Computer() {
    override fun work() {
        println("你正在使用的是玩家国度..")
    }
}