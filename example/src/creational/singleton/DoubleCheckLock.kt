package creational.singleton

/*
    双重校验锁单例写法
 */

class DoubleCheckLock private constructor(var name: String) {
    init {
        this.name = name;
    }

    companion object{
        val instance: DoubleCheckLock by lazy (mode = LazyThreadSafetyMode.SYNCHRONIZED){
            DoubleCheckLock(name = "")
        }
    }

    fun funcation(){
        println("DCL的funcation方法..")
    }
}