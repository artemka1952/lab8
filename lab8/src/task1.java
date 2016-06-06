import java.util.HashSet;
import java.util.Set;

/**
 * The Collection программа, реализует приложение, которое создает коллекцию
 * HashSet с типом элементов String. Добавляет в неё 10 строк: арбуз, банан,
 * вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель. И выводит
 * содержимое коллекции на экран, каждый элемент с новой строки.
 *
 * @author var1541b 
 */
public class task1 {

    public static void main(String[] args) {
        Set<String> plants = new HashSet<String>();
        plants.add("Арбуз");
        plants.add("Банан");
        plants.add("Вишня");
        plants.add("Груша");
        plants.add("Дыня");
        plants.add("Ежевика");
        plants.add("Жень-шень");
        plants.add("Земляника");
        plants.add("Ирис");
        plants.add("Картофель");

        for (String text : plants) {
            System.out.println(text);
        }
    }
}
