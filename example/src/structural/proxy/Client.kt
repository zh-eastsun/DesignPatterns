package structural.proxy

import java.lang.reflect.Proxy

class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //静态代理调用
            var proxySubject = ProxySubject(RealSubject())
            proxySubject.visit()
            proxySubject = ProxySubject(ExpandedSubject())
            proxySubject.visit()

            //动态代理调用
            var dynamicProxy = DynamicProxy(RealSubject())
            var classLoader = RealSubject::class.java.classLoader
            var realProxy = Proxy.newProxyInstance(classLoader, arrayOf(Subject::class.java),dynamicProxy) as Subject
            realProxy.visit()

            dynamicProxy = DynamicProxy(ExpandedSubject())
            classLoader = ExpandedSubject::class.java.classLoader
            realProxy = Proxy.newProxyInstance(classLoader, arrayOf(Subject::class.java),dynamicProxy) as Subject
            realProxy.visit()
        }
    }
}