package creational.singleton

class Client private constructor(){

    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            HungryMode.funcation()
            LazyMode.get("懒汉式").funcation()
        }
    }
}