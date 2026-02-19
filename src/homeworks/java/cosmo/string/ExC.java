package homeworks.java.cosmo.string;

/**
 * Напишите программу,
 * которая на вход получает строку “Мама мыла Милу мылом!” и выводит количество слов в ней.
 * “Мама мыла Милу мылом!” -> 4
 * <p>
 * Подсказка: используйте метод .split() класса String
 */
public class ExC {
    public static void main(String[] args) {
        String input = "Мама мыла Милу мылом!";

        int result = 0;
        String[] words = input.split(" ");
        for (int i = 0; i<words.length; i++){
            result++;
        }

        System.out.println(result);
    }
}