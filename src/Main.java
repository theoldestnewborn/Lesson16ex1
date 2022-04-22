import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(10);
        for (int i = 0; i<10; i++){
        intList.add(i,(int) (Math.random()*10));
        }
        Stream <Integer> intStream = intList.stream();
//        - Удалить дубликаты
        System.out.println(intStream.distinct().collect(Collectors.toList()));
//                - Вывести все четные элементы в диапазоне от 7 до 17
//        (включительно)
        System.out.println(intList.stream().filter((s) -> s<17).filter((s) -> s>7).
                filter((s) -> s%2==0).collect(Collectors.toList()));
//                - Каждый элемент умножить на 2
        System.out.println(intList.stream().map((s) -> s*2).collect(Collectors.toList()));
//                - Отсортировать и вывести на экран первых 4 элемента
        System.out.println(intList.stream().sorted().limit(4).collect(Collectors.toList()));
//                - Вывести количество элементов в стриме
        System.out.println(intList.stream().count());
//        - Вывести среднее арифметическое всех чисел в стриме
        System.out.println(intList.stream().mapToInt(s -> s).average());

//        2. Создать коллекцию класса ArrayList со значениями имен всех студентов
//        в группе
        List <String> javaGroupList = new ArrayList<>();
        javaGroupList = List.of("Alexander", "Olga", "Kirill", "Alex", "Alex",
                "Maria", "Sergei", "Aleksei", "Viktoriya", "Nikita");
        Stream <String> javaGroupStream = javaGroupList.stream();
//        С помощью Stream'ов:
//                - Вернуть количество количество людей с вашим именем (вне
//        зависимости от верхнего/нижнего регистра букв)
        System.out.println(javaGroupStream.filter((a) -> a.equalsIgnoreCase("Aleksei")).count());
//        - Выбрать все имена, начинающиеся на "а" (вне зависимости от
//        верхнего/нижнего регистра букв)
        String keyLetter = "a";
        String keyLetter1 = "A";
        System.out.println (javaGroupList.stream().filter(s -> s.startsWith(keyLetter)||s.startsWith(keyLetter1)).
                collect(Collectors.toList()));
//        - Отсортировать и вернуть первый элемент коллекции или
//        "Empty@, если коллекция пуста
        System.out.println(javaGroupList.stream().sorted().findFirst().orElse("Empty"));

    }
}