package command

class ConcreteCommand : Command {

    private lateinit var receiver: Receiver

    override fun execute() {
        receiver.funcation()
    }

    fun setReceiver(receiver: Receiver){
        this.receiver = receiver
    }
}