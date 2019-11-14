package bridge

class MacBookPro : Computer() {
    override fun runOS() {
        println("MacBookPro运行的是MacOS系统..")
    }

    fun work() {
        getCpuFramework().runCommand()
        runOS()
    }
}