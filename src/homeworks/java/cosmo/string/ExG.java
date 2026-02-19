package homeworks.java.cosmo.string;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * Дана строка: ”Где мои деньги?”.
 * Необходимо собрать предложение в обратном порядке: “Деньги мои где?”.
 * Где мои деньги? -> Деньги мои где?
 * <p>
 * Подсказка: используйте методы .split(), .trim(), .replace() и .replaceFirst() класса String
 */
public class   ExG {
    public static void main(String[] args) {
        String input = "Где мои деньги?";
        String[] arrayWords = input.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = arrayWords.length-1; i >= 0; i--){
            stringBuilder.append(arrayWords[i]).append(" ");
        }

        String result = stringBuilder.toString()
                .trim()
                .replace("?", "")
                .toLowerCase()
                .replaceFirst("д", "Д")
                +"?";

        System.out.println(result);




    }
}