package structural.facade

class Client{
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val smartPhone = SmartPhone()
            smartPhone.dail()
            smartPhone.hangup()
            smartPhone.videoChat()
            smartPhone.takePicture()
            smartPhone.close()
        }
    }
}