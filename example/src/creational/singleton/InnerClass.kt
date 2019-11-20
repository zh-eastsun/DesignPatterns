package creational.singleton

/*
    内部类形式的单例
 */

class InnerClass private constructor(){
    companion object{
        val instance = InnerClassHolder.holder
    }

    private object InnerClassHolder{
        val holder: InnerClass = InnerClass()
    }

    fun funcation(){
        println("静态内部类形式的funcation方法...")
    }
}