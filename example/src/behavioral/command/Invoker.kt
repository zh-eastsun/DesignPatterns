package behavioral.command

class Invoker {

    private lateinit var command: Command

    fun executeCommand() {
        command.execute()
    }

    fun setCommand(command: Command) {
        this.command = command
    }
}