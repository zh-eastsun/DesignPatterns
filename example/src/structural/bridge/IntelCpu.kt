package structural.bridge

class IntelCpu : CpuFramework {
    override fun runCommand() {
        println("安装的是Intel品牌的CPU，运行x86架构指令集..")
    }
}