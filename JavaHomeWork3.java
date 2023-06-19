//Урок 3. Задание
//        Пусть дан произвольный список из 100 целых чисел.
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение

import java.util.*;

public class JavaHomeWork3 {
    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new Random().nextInt(0, 1000));// создаем произвольный список из 100 целых чисел
        }
        list.removeIf(num -> num % 2 ==0);// удаляем из списка четные числа

        System.out.println(list);
        System.out.println(Collections.max(list));//максимальное значение
        System.out.println(Collections.min(list));//минимальное значение
    }
}