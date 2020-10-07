import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        int size = Integer.parseInt(Util.requestString("Введите размер списка:"));
        int maxValue = Integer.parseInt(Util.requestString("Введите верхнюю границу для значений:"));
        logger.log("Создаём и наполняем список");
        List<Integer> source = createSourseList(size, maxValue);
        System.out.println("Вот случайный список: " + source);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        int f = Integer.parseInt(Util.requestString("Введите порог для фильтра: "));
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> result = filter.filterOut(source);
        logger.log("Прошло фильтр " + result.size() +" элемента из " + size);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершаем программу");


    }

    public static List<Integer> createSourseList(int size, int maxValue) {
        List<Integer> sourse = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            sourse.add(random.nextInt(maxValue));
        }
        return sourse;
    }
}
