import java.util.HashMap;
import java.util.Map;

/**
 * The Collection программа, реализует приложение, которое создает коллекцию
 * HashMap с типом элементов String и Object. Добавляет в неё 10 строк. И
 * выводит содержимое коллекции на экран, каждый элемент с новой строки.
 *
 * @author var1541b 
 */
public class task6 {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        Object obj5 = new Object();
        Object obj6 = new Object();
        Object obj7 = new Object();
        Object obj8 = new Object();
        Object obj9 = new Object();
        Object obj10 = new Object();

        map.put("Арбуз", obj1);
        map.put("Банан", obj2);
        map.put("Вишня", obj3);
        map.put("Груша", obj4);
        map.put("Дыня", obj5);
        map.put("Ежевика", obj6);
        map.put("Жень-шень", obj7);
        map.put("Земляника", obj8);
        map.put("Ирис", obj9);
        map.put("Картофель", obj10);

        for (Map.Entry<String, Object> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
