package structural.flyweight

/**
 * 富士康工厂，生产ThinkPad
 */
class Foxconn {
    companion object {
        private val thinkPad = HashMap<String, ThinkPad>()
        fun getThinkPad(model: String): ThinkPad {
            if (thinkPad.containsKey(model)) {
                return thinkPad.get(model)!!
            } else run {
                var newThinkPad = ThinkPad(model)
                thinkPad.put(model, ThinkPad(model))
                return newThinkPad
            }
        }
    }
}