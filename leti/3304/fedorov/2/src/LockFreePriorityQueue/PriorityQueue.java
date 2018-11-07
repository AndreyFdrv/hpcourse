package LockFreePriorityQueue;
/**
 * Lock-Free очередь с приоритетами
 * @param <T> Тип элементов
 */
public interface PriorityQueue<E extends Comparable<E>> {
 
    /**
     * Проверка очереди на пустоту
     *
     * Метод должен быть lock-free (wait-free для уверенных в себе)
     *
     * @return true если очередь пуста, иначе - false
     */
    boolean isEmpty();
}