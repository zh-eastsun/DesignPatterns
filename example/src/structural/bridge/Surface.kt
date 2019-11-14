package structural.bridge

class Surface : Computer() {
    override fun runOS() {
        println("运行Windows操作系统..")
    }

    fun work(){
        getCpuFramework().runCommand()
        runOS()
    }
}