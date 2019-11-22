package creational.simplefactory

/**
 * 具体的工厂类
 */
class Foxconn: Factory(){
    override fun <T : Computer> createComputer(clazz: Class<T>):T {
        return clazz.newInstance()
    }
}