package creational.simplefactory

/**
 * 抽象工厂
 */

abstract class Factory {
    abstract fun <T: Computer> createComputer(clazz: Class<T>): T
}