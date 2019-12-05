package structural.facade

/**
 * 照相机实现类
 */
class CameraImpl : Camera{
    override fun open() {
        println("打开摄像机...")
    }

    override fun takePicture() {
        println("照相...")
    }

    override fun close() {
        println("关闭照相机...")
    }

}