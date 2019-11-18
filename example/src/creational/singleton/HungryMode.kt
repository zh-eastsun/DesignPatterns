package creational.singleton

/*
    饿汉式
    缺点：无法通过初始化的方式注入参数
 */
object HungryMode {
    fun funcation(){
        println("执行了饿汉式的funcation方法...")
    }
}