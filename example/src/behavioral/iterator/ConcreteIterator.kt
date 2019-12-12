package behavioral.iterator

/**
 * 具体的迭代器类
 */
class ConcreteIterator<E> : Iterator<E> {

    private var list = ArrayList<E>()
    private var index = 0

    constructor(list: ArrayList<E>) {
        this.list = list
    }

    /**
     * 判断是否有下一个元素
     * @return if next element exists return true, else return false.
     */
    override fun hasNext(): Boolean {
        return index != list.size && index >= 0
    }

    /**
     * 获取下一个元素
     * @return next element
     */
    override fun next(): E {
        return if (this.hasNext()) this.list[index++] else this.list[index]
    }
}