package behavioral.command

class NewConcreteCommand: Command {

    private lateinit var newReceiver: NewReceiver

    override fun execute() {
        newReceiver.funcation()
    }

    fun setReceiver(newReceiver: NewReceiver){
        this.newReceiver = newReceiver
    }
}