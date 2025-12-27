package homeworks;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW7 {

```
public static void main(String[] args) {
    System.out.println("1. Палиндром:");
    System.out.println(isPalindrome("А роза упала на лапу Азора"));
    System.out.println(isPalindrome("Hello"));
    
    System.out.println("\n2. Удаление дубликатов:");
    System.out.println(removeDuplicates("programming"));
    
    System.out.println("\n3. Первый неповторяющийся символ:");
    System.out.println(firstNonRepeatingChar("swiss"));
    System.out.println(firstNonRepeatingChar("aabbcc"));
    
    System.out.println("\n4. Замена 'a' на '@':");
    System.out.println(replaceAWithAt("banana"));
    
    System.out.println("\n5. Подсчет слов:");
    System.out.println(countWords("Это   пример    текста с пробелами"));
    
    System.out.println("\n6. Сравнение строк без учета регистра:");
    System.out.println(equalsIgnoreCase("Hello", "HELLO"));
    
    System.out.println("\n7. Проверка формата телефона:");
    System.out.println(isValidRussianPhone("+7 (999) 123-45-67"));
    System.out.println(isValidRussianPhone("89991234567"));
    System.out.println(isValidRussianPhone("123456"));
    
    System.out.println("\n8. Извлечение чисел:");
    findNumbers("Цена 150.5 руб, скидка 20%, итого 120.4");
    
    System.out.println("\n9. Замена множественных пробелов:");
    System.out.println(replaceMultipleSpaces("Это    текст   с     пробелами"));
    
    System.out.println("\n10. Валидация email:");
    System.out.println(isValidEmail("user@example.com"));
    System.out.println(isValidEmail("invalid.email@"));
    
    System.out.println("\n11. Форматирование товара:");
    System.out.println(formatProduct("Ноутбук", 45999.999));
    
    System.out.println("\n12. Объединение массива строк:");
    String[] words = {"Java", "Python", "JavaScript", "C++"};
    System.out.println(joinStrings(words));
}

// 1
public static boolean isPalindrome(String str) {
    String cleaned = str.replaceAll("\\s+", "").toLowerCase();
    int left = 0;
    int right = cleaned.length() - 1;
    while (left < right) {
        if (cleaned.charAt(left) != cleaned.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

// 2
public static String removeDuplicates(String str) {
    LinkedHashSet<Character> seen = new LinkedHashSet<>();
    for (int i = 0; i < str.length(); i++) {
        seen.add(str.charAt(i));
    }
    StringBuilder result = new StringBuilder();
    for (Character ch : seen) {
        result.append(ch);
    }
    return result.toString();
}

// 3
public static Character firstNonRepeatingChar(String str) {
    for (int i = 0; i < str.length(); i++) {
        char current = str.charAt(i);
        boolean isUnique = true;
        for (int j = 0; j < str.length(); j++) {
            if (i != j && current == str.charAt(j)) {
                isUnique = false;
                break;
            }
        }
        if (isUnique) {
            return current;
        }
    }
    return null;
}

// 4
public static String replaceAWithAt(String str) {
    return str.replace('a', '@');
}

// 5
public static int countWords(String sentence) {
    String trimmed = sentence.trim();
    if (trimmed.isEmpty()) {
        return 0;
    }
    String[] words = trimmed.split("\\s+");
    return words.length;
}

// 6
public static boolean equalsIgnoreCase(String str1, String str2) {
    if (str1 == null || str2 == null) {
        return str1 == str2;
    }
    return str1.toLowerCase().equals(str2.toLowerCase());
}

// 7
public static boolean isValidRussianPhone(String phone) {
    String pattern1 = "\\+7 \\(\\d{3}\\) \\d{3}-\\d{2}-\\d{2}";
    String pattern2 = "8\\d{10}";
    return phone.matches(pattern1) || phone.matches(pattern2);
}

// 8
public static void findNumbers(String text) {
    Pattern pattern = Pattern.compile("\\d+\\.?\\d*");
    Matcher matcher = pattern.matcher(text);
    System.out.print("Найденные числа: ");
    while (matcher.find()) {
        System.out.print(matcher.group() + " ");
    }
    System.out.println();
}

// 9
public static String replaceMultipleSpaces(String str) {
    return str.replaceAll("\\s{2,}", " ");
}

// 10
public static boolean isValidEmail(String email) {
    String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    return email.matches(emailPattern);
}

// 11
public static String formatProduct(String name, double price) {
    return String.format("Товар: %s, Цена: %.2f руб.", name, price);
}

// 12
public static String joinStrings(String[] strings) {
    if (strings == null || strings.length == 0) {
        return "";
    }
    StringBuilder result = new StringBuilder(strings[0]);
    for (int i = 1; i < strings.length; i++) {
        result.append("; ").append(strings[i]);
    }
    return result.toString();
}
```

}
