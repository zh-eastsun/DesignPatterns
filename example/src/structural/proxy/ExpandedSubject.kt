package structural.proxy

/**
 * 扩展的ExpandedSubject
 */
class ExpandedSubject : Subject {
    override fun visit() {
        println("调用了ExpandedSubject中的visit方法...")
    }
}