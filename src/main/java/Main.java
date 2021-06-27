import java.util.Random;

public class Main {

    static long startTime, endTime;

    public static void main(String[] args) {

/*
        Задание 8.1
            Пример использования хеш-таблиц:
                - создание базы данных с быстрым поиском предмета по ключу;
                - храниение логинов и паролей


        Задание 8.2
            Ключ – входной массив, идентификатор для доступа/поиска значения в хеш-таблице.
            Ключами могут быть числа, массивы, строки и т.д.
            Например: "Слово", 500.

            Коллизия - ситуация, при которой два или более ключей совпадают с полученным в итоге хешем.


        Задание 8.3. Приведите примеры популярных и эффективных хеш-функций.
            Примеры популярных и эффективных хеш-функций:
                - Суммирование
                - Возведение в степень
*/

//        Задание 8.4
        Item aDataItem;
        int aKey;
        int size = 50;


        startTime = System.nanoTime();
        HashTable hashTable = new HashTable(size);
        Random rand = new Random();
        for (int j = 0; j < 15; j++) {
            aKey = rand.nextInt(500);
            aDataItem = new Item(aKey);
            hashTable.insert(aDataItem);
        }
        endTime = System.nanoTime();
        System.out.println("Время заполнения хеш-таблицы методом линейного пробирования: " + (endTime - startTime) + " нс");

        hashTable.insert(new Item(777));
        hashTable.insert(new Item(123));
        hashTable.insert(new Item(123));   // Коллизия
        hashTable.display();

        System.out.println(hashTable.find(777).getKey());
        hashTable.delete(123);


    }

}
