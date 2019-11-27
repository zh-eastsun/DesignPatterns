package structural.flyweight

/**
 * 富士康工厂，生产ThinkPad
 */
class Foxconn {
    companion object {
        private val thinkPad = HashMap<String, ThinkPad>()
        fun getThinkPad(model: String): ThinkPad {
            return if (thinkPad.containsKey(model)) {
                thinkPad[model]!!
            } else {
                val newThinkPad = ThinkPad(model)
                thinkPad[model] = newThinkPad
                newThinkPad
            }
            println("${thinkPad.size}")
        }
    }
}