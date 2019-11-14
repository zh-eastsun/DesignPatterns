package structural.bridge

abstract class Computer {

    private lateinit var cpuFramework: CpuFramework

    fun setCpuFramework(cpuFramework: CpuFramework) {
        this.cpuFramework = cpuFramework
    }

    fun getCpuFramework(): CpuFramework {
        return this.cpuFramework
    }

    abstract fun runOS()
}