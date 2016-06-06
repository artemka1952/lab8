import java.util.HashMap;
import java.util.Map;

/**
 * The Collection программа, реализует приложение, которое создает коллекцию
 * HashMap с типом элементов String, String. Добавляет в неё 10 строк: арбуз -
 * ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, ежевика -
 * куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель -
 * клубень. И выводит содержимое коллекции на экран, каждый элемент с новой
 * строки.
 *
 * @author var1541b 
 */
public class task2 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Арбуз", "ягода");
        map.put("Банан", "трава");
        map.put("Вишня", "ягода");
        map.put("Груша", "фрукт");
        map.put("Дыня", "овощ");
        map.put("Ежевика", "куст");
        map.put("Жень-шень", "корень");
        map.put("Земляника", "ягода");
        map.put("Ирис", "цветок");
        map.put("Картофель", "клубень");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
