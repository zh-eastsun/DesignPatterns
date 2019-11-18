package creational.singleton

class LazyMode private constructor(var name: String) {

    init {
        this.name = name
    }

    companion object {
        private var instance: LazyMode? = null
            /*
                属性访问器
                其中field就代表其上方的属性
             */
            get() {
                if (null == field) {
                    instance = LazyMode(name = "")
                }
                return field
            }

        fun get(name: String): LazyMode {
            this.instance!!.name = name
            return instance!!
        }
    }

    fun funcation() {
        println("${this.name}的funcation方法..")
    }
}