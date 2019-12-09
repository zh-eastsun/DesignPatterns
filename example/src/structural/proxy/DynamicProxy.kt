package structural.proxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

/**
 * 动态代理类
 */
class DynamicProxy constructor(private val subject: Any) : InvocationHandler {
    override fun invoke(proxy: Any?, method: Method?, args: Array<Any>?): Any? {
        return method!!.invoke(subject,*args.orEmpty())
    }
}