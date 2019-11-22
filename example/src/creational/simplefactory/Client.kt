package creational.simplefactory

class Client {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val gameComputer = Foxconn().createComputer(RepublicOfGamers::class.java)
            gameComputer.work()
            val officialComputer = Foxconn().createComputer(MacBook::class.java)
            officialComputer.work()
        }
    }
}