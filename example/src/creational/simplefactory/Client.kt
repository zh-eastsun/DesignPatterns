package creational.simplefactory

class Client {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            // 实例化一个游戏本
            val gameComputer = Foxconn().createComputer(RepublicOfGamers::class.java)
            gameComputer.work()
            // 实例化一个办公本
            val officialComputer = Foxconn().createComputer(MacBook::class.java)
            officialComputer.work()
        }
    }
}