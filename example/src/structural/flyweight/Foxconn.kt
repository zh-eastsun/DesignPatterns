package structural.flyweight

/**
 * 富士康工厂，生产ThinkPad
 */
class Foxconn {
    companion object {
        private val thinkPad = HashMap<String, Computer>()
        fun getThinkPad(model: String): Computer {
            return if (thinkPad.containsKey(model)) {
                thinkPad[model]!!
            } else {
                thinkPad[model] = ThinkPad(model)
                thinkPad[model]!!
            }
            println("${thinkPad.size}")
        }
    }
}