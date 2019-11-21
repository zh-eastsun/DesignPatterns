package creational.builder

class ThinkPad : Computer() {
    override fun configCpu(cpu: String) {
        this.cpu = cpu
    }

    override fun configOs(os: String) {
        this.os = os
    }

}