package behavioral.observer

import java.util.*

/**
 * 具体的被观察者对象
 */
class ConcreteObservable : Observable() {

    // 存放观察者的集合
    private val observers: MutableList<Observer> = ArrayList()
    private var message: String = "default message"

    // 当有消息推送时通知所有注册的观察者
    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(this, message)
        }
    }

    override fun notifyObservers(arg: Any?) {
        for (observer in observers) {
            observer.update(this, arg)
        }
    }

    // 观察者注册
    override fun addObserver(o: Observer?) {
        if (null != o) {
            observers.add(o)
        }
    }

    // 所有观察者解除绑定
    override fun deleteObservers() {
        observers.clear()
    }

    // 某一观察者解除绑定
    override fun deleteObserver(o: Observer?) {
        if (null != o) {
            observers.remove(o)
        }
    }

    // 更新消息
    internal fun updateMessage(message: String) {
        this.message = message
        println("message is updating..$message")
    }
}