package behavioral.iterator

/**
 * 具体的容器类
 * @author zh_east_sun
 */
class ConcreteAggregate <E> : Aggregate<E>{

    /**
     * Array list to save data.
     */
    private val data = ArrayList<E>()

    /**
     * Add an element of class E.
     * @param element An element of waiting for adding.
     */
    override fun add(element: E) {
        data.add(element)
    }

    /**
     * Remove an element of class E.
     * @param element An element of waiting for removing.
     */
    override fun remove(element: E) {
        data.remove(element)
    }

    /**
     * To get an iterator of array list.
     * @return An iterator of class E.
     */
    override fun iterator(): Iterator<E> {
        return ConcreteIterator(data)
    }

    /**
     * Override the toString method to print the elements of data array.
     * @return The array list element string.
     */
    override fun toString(): String {
        val result = StringBuilder()
        val iterator = data.iterator()
        while (iterator.hasNext())
            result.append("${iterator.next()}\t")
        return result.toString()
    }

}