package creational.simplefactory

import java.lang.reflect.Constructor

/**
 * 具体的工厂类
 */
class Foxconn: Factory(){
    override fun <T : Computer> createComputer(clazz: Class<T>):T {
        val constructor = clazz.getDeclaredConstructor()
        constructor.isAccessible = true
        return constructor.newInstance()
    }
}