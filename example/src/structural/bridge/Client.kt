package structural.bridge

class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var macBookPro = MacBookPro()
            var cpu = IntelCpu()
            macBookPro.setCpuFramework(cpu)
            macBookPro.work()
        }
    }
}