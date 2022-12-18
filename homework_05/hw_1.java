// Хранение и обработка данных ч2: множество коллекций Map
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
package homework_05;

import java.util.HashMap;
import java.util.List;

public class hw_1 {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Георгиевич");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Алексеев", List.of("+7(111)111-11-11", "+7(222)222-22-22"));
        phoneBook.put("Андреев", List.of("+7(222)222-33-33", "+7(444)444-44-44"));
        phoneBook.put("Антонов", List.of("+7(555)555-55-55", "+7(666)666-66-66"));
        phoneBook.put("Борисов", List.of("+7(987)727-76-87", "+7(765)879-98-65"));
        phoneBook.put("Владов", List.of("+7(568)869-86-66", "+7(987)862-11-87"));
        phoneBook.put("Георгиевич", List.of("+7(999)999-99-99", "+7(928)888-99-99"));

    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }

}
