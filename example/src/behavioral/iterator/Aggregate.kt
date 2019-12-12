package behavioral.iterator

/**
 * 容器的接口，定义容器的行为
 * @author zh_east_sun
 */
interface Aggregate<E> {

    /**
     * 添加一个元素
     * @param element 待添加的元素
     */
    fun add(element: E)

    /**
     * 删除一个元素
     * @param element 待删除的元素
     */
    fun remove(element: E)

    /**
     * 获取迭代器的方法
     */
    fun iterator(): Iterator<E>
}