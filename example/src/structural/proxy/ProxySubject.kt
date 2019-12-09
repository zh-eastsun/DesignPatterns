package structural.proxy

/**
 * 供客户端调用的代理类
 */
class ProxySubject constructor(val subject: Subject) : Subject {
    override fun visit() {
        subject.visit()
    }
}