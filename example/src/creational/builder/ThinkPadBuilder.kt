package creational.builder

class ThinkPadBuilder : Builder() {

    private var thinkPad = ThinkPad()

    override fun setCpu(cpu: String): Builder {
        thinkPad.configCpu(cpu)
        return this
    }

    override fun setOs(os: String): Builder {
        thinkPad.configOs(os)
        return this
    }

    override fun build(): Computer {
        return this.thinkPad
    }
}