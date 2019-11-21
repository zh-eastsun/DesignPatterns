package creational.builder

abstract class Builder {
    abstract fun setCpu(cpu: String): Builder
    abstract fun setOs(os: String): Builder
    abstract fun build(): Computer
}