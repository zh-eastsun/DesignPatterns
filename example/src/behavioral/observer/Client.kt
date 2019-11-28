package behavioral.observer

class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val watchServer = ConcreteObservable()
            var observerOne = ConcreteObserver("observerOne")
            var observerTwo = ConcreteObserver("observerTwo")
            var observerThree = ConcreteObserver("observerThree")
            // 注册过程
            watchServer.addObserver(observerOne)
            watchServer.addObserver(observerTwo)
            watchServer.addObserver(observerThree)
            watchServer.updateMessage("更新的内容1....")
            watchServer.notifyObservers()
            println("------------")

            // 删除observerOne的注册
            watchServer.deleteObserver(observerOne)
            watchServer.updateMessage("更新的内容2....")
            watchServer.notifyObservers()
            println("------------")

            // 删除所有observer的注册
            watchServer.deleteObservers()
            watchServer.updateMessage("更新的内容3....")
            watchServer.notifyObservers()
            println("------------")

            // 直接调用带参数的notifyObservers()方法
            watchServer.addObserver(observerOne)
            watchServer.addObserver(observerTwo)
            watchServer.addObserver(observerThree)
            watchServer.notifyObservers("更新的内容4....")
            println("------------")
        }
    }
}