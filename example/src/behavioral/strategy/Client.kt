package behavioral.strategy

/**
 * 客户端类，负责调用不同的算法
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var strategy: Strategy? = null
            // 调用A策略解决问题
            strategy = StrategyA()
            strategy.resolve()
            // 调用策略B解决问题
            strategy = StrategyB()
            strategy.resolve()
        }
    }
}