package structural.facade

/**
 * 智能手机实体类
 */
class SmartPhone {

    private val phone = PhoneImpl()
    private val camera = CameraImpl()

    fun dail(){
        phone.dail()
    }

    fun videoChat(){
        camera.open()
        phone.dail()
    }

    fun hangup(){
        phone.hangup()
    }

    fun takePicture(){
        camera.open()
        camera.takePicture()
    }

    fun close(){
        camera.close()
    }
}