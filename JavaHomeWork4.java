//Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
//        Организовать ввод и хранение данных пользователей. ФИО возраст и пол
//        вывод в формате Фамилия И.О. возраст пол
//        добавить возможность выхода или вывода списка отсортированного по возрасту!)

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        outputList(inputList());// вывод в формате Фамилия И.О. возраст пол
        System.out.println();
        outputList(sortList(inputList()));//вывод в формате Фамилия И.О. возраст пол(отсортированно по возрасту)
    }

    public static List<String> inputList() {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Сколько человек Вы хотите добавить: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Введите фамилию: ");
            String family = scanner.nextLine();
            System.out.println("Введите имя: ");
            String name = scanner.nextLine();
            System.out.println("Введите отчество: ");
            String surname = scanner.nextLine();
            System.out.println("Введите возраст: ");
            String age = scanner.nextLine();
            System.out.println("Введите пол: ");
            String gender = scanner.nextLine();

            list.add(family + " " + name + " " + surname + " " + age + " " + gender);
        }
        scanner.close();
        System.out.println(list);
        return list;
    }

    public static List<String> outputList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String[] array = list.get(i).split(" ");
            System.out.println(array[0] + " " + array[1].toUpperCase().charAt(0) + "." + array[2].toUpperCase().charAt(0) + "." + array[3] + " " + array[4]);
        }
        return list;
    }

    public static List<String> sortList(List<String> list) {
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1.split(" ")[3]) - Integer.parseInt(o2.split(" ")[3]);
            }
        });
        return list;
    }
}