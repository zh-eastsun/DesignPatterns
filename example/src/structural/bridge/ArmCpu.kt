package structural.bridge

class ArmCpu : CpuFramework {
    override fun runCommand() {
        println("安装的是Arm品牌CPU，运行Arm架构微指令集..")
    }
}