package creational.singleton

class Client private constructor(){

    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            HungryMode.funcation()
            LazyMode.get("懒汉式").funcation()
            LazyModeSafe.get("懒汉式线程安全").funcation()
            DoubleCheckLock.instance.funcation()
            InnerClass.instance.funcation()
            EnumMode.INSTANCE.funcation()
        }
    }
}