import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class JavaHomeWork5 {
    public static void main(String[] args) {
        HashMap<String, ArrayList> phoneBook = new HashMap<>();
        addPhone(phoneBook, "Ivan", "+7(111)111 11 11");
        addPhone(phoneBook, "Sergei", "+7(666)666 66 66");
        addPhone(phoneBook, "Sveta", "+7(444)444 44 44");
        addPhone(phoneBook, "Sveta", "+7(555)555 55 55");
        addPhone(phoneBook, "Ivan", "+7(333)333 33 33");
        addPhone(phoneBook, "Ivan", "+7(222)222 22 22");
        System.out.println(phoneBook);

        ArrayList<String> list = new ArrayList<>();
        for (String s: phoneBook.keySet()){
            list.add(s);
        }
        Collections.sort(list, (o1, o2) -> phoneBook.get(o1).size() - phoneBook.get(o2).size());
        list.forEach(n-> System.out.println(n + "=" + phoneBook.get(n).size()));
    }
    public static void addPhone(HashMap<String, ArrayList> phoneBook, String name, String phone){
        phoneBook.putIfAbsent(name, new ArrayList<>());
        phoneBook.get(name).add(phone);
    }
}