package behavioral.strategy

/**
 * 具体解决问题的策略A
 */
class StrategyA: Strategy {
    override fun resolve() {
        println("调用策略A解决了问题...")
    }

}