import java.util.LinkedList;

public class Cache<T> {
    private final int capacity;
    private final LinkedList<T> items;

    public Cache(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Capacity должен быть положительным");
        }
        this.capacity = n;
        this.items = new LinkedList<>();
    }

    // Добавление элемента
    public void add(T item) {
        items.addLast(item);
        if (items.size() > capacity) {
            // Удаляем самый старый элемент
            items.removeFirst();
        }
    }

    // Удаление элемента, возвращает true если был удалён
    public boolean remove(T item) {
        return items.remove(item);
    }

    // Проверка существования элемента
    public boolean exists(T item) {
        return items.contains(item);
    }

    // Получение первого элемента (самого старого)
    public T getFirst() {
        return items.isEmpty() ? null : items.getFirst();
    }

    // Получение последнего элемента
    public T getLast() {
        return items.isEmpty() ? null : items.getLast();
    }

    // Получение элемента по индексу
    public T getItemByIndex(int i) {
        if (i < 0 || i >= items.size()) {
            return null;
        }
        return items.get(i);
    }

    // Вывод
    public void printContents() {
        System.out.println("Кэш содержимое:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("[" + i + "]: " + items.get(i));
        }
        System.out.println();
    }
}