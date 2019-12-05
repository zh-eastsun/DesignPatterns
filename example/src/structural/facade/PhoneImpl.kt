package structural.facade

/**
 * 手机实现类
 */
class PhoneImpl : Phone {
    override fun dail() {
        println("打电话...")
    }

    override fun hangup() {
         println("挂断电话...")
    }
}