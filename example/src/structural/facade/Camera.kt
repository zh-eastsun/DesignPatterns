package structural.facade

/**
 * 定义照相机的接口
 */
interface Camera {
    // 打开照相机
    fun open()
    // 照相
    fun takePicture()
    // 关闭照相机
    fun close()
}