package behavioral.strategy

/**
 * 具体解决问题的策略B
 */
class StrategyB : Strategy {
    override fun resolve() {
        println("调用策略B解决了问题...")
    }
}