package lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        //регулярные выражения
    String string = "Строка1 для поиска и замены СИМВОЛОВ! ё";
        String pattern = "иск";
        System.out.println(string.replaceAll(pattern, "*!"));
        pattern = "^Стр";// ^ - начало строки, $ - конец строки,
//        "^Стр$" - строка должна быть равна Стр
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[иск]";//перечень символов []
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[^иск]";// все, кроме указанных символов
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\d";// поиск цифрового символа
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\D";//поиск не цифрового символа
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\w";//буквенно-цифровой символ или _
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\W";//не буквенно-цифровой символ или _
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\s";//любой пробельный символ
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\S";//не пробельный символ
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[а-я,ё]";//все буквы алфавита + ё
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[А-Я,Ё]";//все буквы алфавита + ё
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[А-Я0-9]";//любая буква или цифра
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[а-я][0-9]";//буква и сразу за ней цифра
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = ".{2,3}";//. - любой символ, повторяющийся от 2 до 3 раз
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = ".(иИ|B1)";//. - либо одно, либо другое, но заменит все, что найдет
        System.out.println(string.replaceAll(pattern, "*"));
//        Pattern & Matcher(методы)
        string = "String B1 to search and replace CHARS";
//        string = "str";
//      {} - повторение от до указанного символа
        Pattern pattern1 = Pattern.compile(".{6,}");
//        ?= проверка на соответствие
//        () - отделяет определенный шаблон
//        * - повторение
        pattern1 = Pattern.compile("(?=.*\\d)(?=.*\\[a-z])(?=.*\\[A-Z]).{8,}");
        // объединяет строку и шаблон, доступны методы стали
        Matcher matcher = pattern1.matcher(string);
        System.out.println(matcher.find()); // true | false //ищет кусок
        System.out.println(matcher.matches());// true | false //ищет полное соответствие


    }
}
