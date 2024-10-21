import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Alphabet {
    // Русский алфавит (33 буквы)
    private static final String ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // "Съешь ещё этих французских булок и галет, да выпей же чаю с молоком, как и я"
        System.out.println("Введите текст: ");
        String input = scanner.nextLine().toLowerCase();

        // Множество для хранения уникальных букв из текста
        Set<Character> lettersInText = new HashSet<>();

        // Проходим по введённому тексту и собираем все буквы
        for (char c : input.toCharArray()) {
            if (ALPHABET.indexOf(c) != -1) { // Если это буква русского алфавита
                lettersInText.add(c);
            }
        }

        // Поиск отсутствующих букв
        Set<Character> missingLetters = new HashSet<>();
        for (char c : ALPHABET.toCharArray()) {
            if (!lettersInText.contains(c)) {
                missingLetters.add(c);
            }
        }

        // Вывод результата
        if (missingLetters.isEmpty()) {
            System.out.println("Текст содержит все буквы русского алфавита.");
        } else {
            System.out.println("Отсутствуют следующие буквы: " + missingLetters);
        }
    }
}