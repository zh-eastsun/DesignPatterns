package structural.flyweight

class ThinkPad: Computer {

    var model: String? = null

    constructor(model:String){
        this.model = model
    }

    override fun doWork() {
        println("使用ThinkPad-${model}工作..")
    }
}