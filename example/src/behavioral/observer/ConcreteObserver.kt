package behavioral.observer

import java.util.*


/**
 * 具体的观察者对象
 */
class ConcreteObserver internal constructor(private var name: String) : Observer {

    private var message: String? = null

    // 收到被观察者更新消息时执行的方法
    override fun update(o: Observable?, arg: Any?) {
        this.message = arg as String?
        read()
    }

    private fun read() {
        println("$name 收到推送消息... $message")
    }
}