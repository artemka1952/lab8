import java.util.HashMap;
import java.util.Map;

/**
 * The Collection программа, реализует приложение, которое создает коллекцию
 * HashMap с типом элементов String. Добавляет в неё 10 различных строк. И
 * выводит список ключей на экран, каждый элемент с новой строки.
 *
 * @author var1541b 
 */
public class task4 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Вася", "Пупкин");
        map.put("Рома", "Ерема");
        map.put("Дима", "Иванов");
        map.put("Петя", "Сидоров");
        map.put("Женя", "Абрикосов");
        map.put("Саша", "Куст");
        map.put("Ваня", "Петров");
        map.put("Леша", "Остроухов");
        map.put("Коля", "Степанов");
        map.put("Олег", "Митель");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            System.out.println(pair.getKey());
        }
    }
}
