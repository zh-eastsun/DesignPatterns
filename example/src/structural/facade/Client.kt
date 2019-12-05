package structural.facade

class Client{
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            // 调用时对外部隐藏了内部实现，提供了统一的接口供外部调用
            val smartPhone = SmartPhone()
            smartPhone.dail()
            smartPhone.hangup()
            smartPhone.videoChat()
            smartPhone.takePicture()
            smartPhone.close()
        }
    }
}