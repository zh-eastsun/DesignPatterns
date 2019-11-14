package command

class Client {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            //典型的命令模式组装过程
            var concreteCommand = ConcreteCommand()
            concreteCommand.setReceiver(Receiver())
            var invoker = Invoker()
            invoker.setCommand(concreteCommand)
            invoker.executeCommand()

            var newConcreteCommand = NewConcreteCommand()
            newConcreteCommand.setReceiver(NewReceiver())
            var newInvoker = Invoker()
            invoker.setCommand(newConcreteCommand)
            invoker.executeCommand()
        }
    }
}