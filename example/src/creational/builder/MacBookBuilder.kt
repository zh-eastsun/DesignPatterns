package creational.builder

class MacBookBuilder : Builder() {

    private var macBook: Computer = MacBook()

    override fun setCpu(cpu: String): Builder {
        macBook.configCpu(cpu)
        return this
    }

    override fun setOs(os: String): Builder {
        macBook.configOs(os)
        return this
    }

    override fun build(): Computer {
        return this.macBook
    }
}