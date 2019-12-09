package structural.proxy

/**
 * 实现抽象主题的真实主题类
 */
class RealSubject : Subject {
    override fun visit() {
        println("调用了RealSubject中的visit方法..")
    }
}