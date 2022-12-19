import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Алексеев Алексей", "8-924-657-6883");
        phoneBook.put("Борисов Борис", "8-923-657-6883");
        phoneBook.put("Валина Валя", "8-924-657-6533");
        phoneBook.put("Дмитриев Дима", "8-924-632-6883");
        phoneBook.put("Галкина Галина", "8-924-657-8583");
        phoneBook.put("Елкина Лиза", "8-924-767-6883");
        phoneBook.put("Иванов Иван", "8-916-657-6883");
        phoneBook.put("Никитин Никита", "8-924-677-6883");
        phoneBook.put("Катина Катя", "8-924-657-8883");
        phoneBook.put("Николаев Коля", "8-974-657-6383");
        phoneBook.put("Сергеев Сергей", "8-926-657-6883");
        phoneBook.put("Андреев Андрей", "8-924-689-6883");
        phoneBook.put("Артёмов Артём", "8-924-657-6765");
        phoneBook.put("Толин Анатолий", "8-924-857-6883");
        phoneBook.put("Костин Константин", "8-924-357-6883");
        phoneBook.put("Васильев Василий", "8-924-657-6846");
        phoneBook.put("Юрьев Юрий", "8-924-657-1383");
        phoneBook.put("Яшин Яков", "8-924-698-6883");
        phoneBook.put("Ильин Илья", "8-924-657-6880");
        phoneBook.put("Танина Татьяна", "8-927-657-6883");

        for (Map.Entry<String, String> contact: phoneBook.entrySet()) {
            System.out.println("Контакт " + contact.getKey() + ": " + contact.getValue());
        }
    }
}