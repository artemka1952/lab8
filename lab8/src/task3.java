import java.util.HashMap;
import java.util.Map;

class Cat {

    public String name;
}

/**
 * The Collection программа, реализует приложение, которое создает коллекцию
 * HashMap с типом элементов String, Cat при помощи класса Cat. Добавляет в неё
 * 10 котов, в качетсве ключа используется имя кота. И выводит содержимое
 * коллекции на экран, каждый элемент с новой строки.
 *
 * @author var1541b 
 */
public class task3 {

    public static void main(String[] args) {
        Map<String, Cat> map = new HashMap<String, Cat>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();

        map.put("Вася", cat1);
        map.put("Петя", cat2);
        map.put("Зевс", cat3);
        map.put("Жан", cat4);
        map.put("Едди", cat5);
        map.put("Дастин", cat6);
        map.put("Дантес", cat7);
        map.put("Гарри", cat8);
        map.put("Мурзик", cat9);
        map.put("Барсик", cat10);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
