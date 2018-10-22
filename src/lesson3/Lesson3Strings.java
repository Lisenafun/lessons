package lesson3;

import java.util.Arrays;

public class Lesson3Strings {
    public static void main(String[] args) {
        String str = "String";
        String str2 = new String("String");
        String str3 = String.format("String %02d", 3); //тратит много ресурсов
        System.out.println(str3);
        String str4 = "String String";
        String str5 = "String";
        String str6 = "strinG";

        System.out.println(str == str2); //false
        System.out.println(str == str5);//true это одно и тоже, но тут работает ссылка
        // посимвольное сравнение
        System.out.println(str.equals(str2)); // true
        System.out.println(str.equals(str5)); // true

        System.out.println(str.equalsIgnoreCase(str6));//true
        System.out.println(str.equals(str6)); //false

        System.out.println(str.startsWith("Q")); //можно комбинацию букв
        System.out.println(str.endsWith("g"));//можно комбинацию букв

        String str10 = "string";
        String str11 = new String("string");
        String str12 = "str";
        String str13 = "String string";

        System.out.println(str10.compareTo(str11));//0 - одинаковые
        System.out.println(str11.compareTo(str12));//3 str11>str12
        System.out.println(str11.compareTo(str13));//32 str11>str13 из за регистра
        System.out.println(str11.compareToIgnoreCase(str13));//-7 str11<str13 без учета регистра

        String a = "Astring";
        String b = "Bstring";
        String c = "Строка \n \"строка\"";

        String [] strArr = {c, a, b};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        //взятие подстроки
        System.out.println(a.substring(3));//r[3]ing
        System.out.println(a.substring(3,5));//r[3]in[5]g
        System.out.println(a.contains("str"));//true

        String [] arr = {"qwe","rty","uio"};
        System.out.println();
        String string = "First ";
        String string2 = "Second ";
        string2 += string;
        System.out.println(string2);//SecondFirst
        System.out.println(string);//First не поменялось

        for (int i = 0; i < 10; i++) {
            string += string2;
        }
        System.out.println(string);

        //StringBuffer(для потоков) | StringBuilder(более производительный, нельзя в потоках)
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string); //добавление символов
        for (int i = 0; i < 10; i++) {
            stringBuilder.append(" string ").append(" str ");
        }
        System.out.println(stringBuilder.toString());
    }
}

