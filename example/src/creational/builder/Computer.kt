package creational.builder

abstract class Computer {
    lateinit var name: String
    lateinit var cpu: String
    lateinit var os: String

    abstract fun configCpu(cpu: String)
    abstract fun configOs(os: String)

    fun work() {
        println("这台计算机的名称为${this.name},配置的CPU为${this.cpu},运行的操作系统为${this.os}")
    }
}