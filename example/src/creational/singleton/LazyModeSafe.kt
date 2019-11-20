package creational.singleton

/*
    线程安全的懒汉式单例写法
 */

class LazyModeSafe private constructor(var name: String) {
    init {
        this.name = name
    }

    companion object {
        private var instance: LazyModeSafe? = null
            get() {
                if (null == field) {
                    field = LazyModeSafe(name = "");
                }
                return field
            }
        @Synchronized
        fun get(name:String): LazyModeSafe{
            instance!!.name = name
            return instance!!
        }
    }

    fun funcation(){
        println("${this.name}调用了funcation方法..")
    }
}