public class Main {
    public static void main(String[] args) {
        // Создаём кеш с максимальной ёмкостью 3
        Cache<String> cache = new Cache<>(3);

        // Добавляем элементы
        cache.add("apple");
        cache.add("banana");
        cache.add("cherry");
        cache.printContents();

        // Добавляем ещё один элемент, самый старый (apple) удалится
        cache.add("date");
        cache.printContents();

        // Проверка методов
        System.out.println("Существует ли 'banana'? " + cache.exists("banana"));
        System.out.println("Существует ли 'apple'? " + cache.exists("apple"));
        System.out.println("Первый элемент: " + cache.getFirst());
        System.out.println("Последний элемент: " + cache.getLast());
        System.out.println("Элемент по индексу 1: " + cache.getItemByIndex(1));

        // Удаляем элемент
        cache.remove("banana");
        cache.printContents();

        // Попытка получить элемент по несуществующему индексу
        System.out.println("Элемент по индексу 5: " + cache.getItemByIndex(5));
    }
}
