package homeworks;
import java.util.regex.*;
import java.util.ArrayList;

public class HW7 {

    // 1. Проверка палиндрома (без учета регистра)
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() -1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // 2. Удаление повторяющихся символов, оставляя первое вхождение
    public static String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (result.indexOf("" + c) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }

    // 3. Первый неповторяющийся символ
    public static Character firstNonRepeatingChar(String s) {
        s = s.toLowerCase();
        for (int i=0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return c;
            }
        }
        return null; // если нет такого символа
    }

    // 4. Замена всех 'a' на '@'
    public static String replaceAtoAt(String s) {
        return s.replace('a', '@').replace('A', '@');
    }

    // 5. Подсчет слов в предложении (разделены пробелами)
    public static int countWords(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        String[] words = s.split("\\s+");
        return words.length;
    }

    // 6. Проверка равенства двух строк без учета регистра
    public static boolean equalsIgnoreCase(String s1, String s2) {
        return s1.equalsIgnoreCase(s2);
    }

    // 7. Проверка формата российского номера телефона
    public static boolean isValidRussianPhone(String s) {
        String regex = "^(\\+7\\s?\\(\\d{3}\\)\\s?\\d{3}-\\d{2}-\\d{2}|8\\d{10})$";
        return s.matches(regex);
    }

    // 8. Найти и вывести все числа (целые и с плавающей точкой) из текста
    public static ArrayList<String> extractNumbers(String s) {
        ArrayList<String> numbers = new ArrayList<>();
        Pattern p = Pattern.compile("-?\\d+\\.?\\d*");
        Matcher m = p.matcher(s);
        while (m.find()) {
            numbers.add(m.group());
        }
        return numbers;
    }

    // 9. Замена нескольких пробелов одним пробелом
    public static String replaceMultipleSpaces(String s) {
        return s.replaceAll("\\s{2,}", " ");
    }

    // 10. Строгая валидация email через regex
    public static boolean isValidEmail(String s) {
        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
        return s.matches(regex);
    }

    // 11. Форматирование строки с товаром и ценой
    public static String formatProductPrice(String name, double price) {
        return String.format("Товар: %s, Цена: %.2f руб.", name, price);
    }

    // 12. Объединение массива строк с разделителем "; "
    public static String joinStrings(String[] arr) {
        return String.join("; ", arr);
    }

    public static void main(String[] args) {
        // Пример вызова методов

        System.out.println("7. Valid Russian phone +7 (999) 123-45-67: " + isValidRussianPhone("+7 (999) 123-45-67"));
        System.out.println("7. Valid Russian phone 89991234567: " + isValidRussianPhone("89991234567"));
        System.out.println("7. Invalid Russian phone 123456: " + isValidRussianPhone("123456"));

        System.out.println("8. Extract numbers: " + extractNumbers("Prices are 12, 15.5, and -7.8 in total."));

        System.out.println("9. Replace multiple spaces: '" + replaceMultipleSpaces("Hello   world   !") + "'");

        System.out.println("10. Valid email test: " + isValidEmail("test.email@example.com"));
        System.out.println("10. Invalid email test: " + isValidEmail("invalid-email@com"));

        System.out.println("11. Product format: " + formatProductPrice("Book", 123.456));

        String[] words = {"apple", "banana", "orange"};
        System.out.println("12. Joined strings: " + joinStrings(words));
    }
}
