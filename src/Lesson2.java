import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
/*        //switch(оператор выбора)
        // большой приз 333333
        // средний приз 333334 333335
        // малый приз 333344 333355 333366
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите шестизначный номер билета");
        int userTicketNum = in2.nextInt();
        String prize;
        switch (userTicketNum){
            case 333333://здесь должно быть константное значение
                prize = "Большой приз";
                break;
            case 333334:
            case 333335:
                prize = "Средний приз";
                break;
            case 333344:
            case 333355:
            case 333366:
                prize = "Малый приз";
                break;
                default:
                    prize = "Приза нет";
        }
        System.out.println("Результат " + prize);*/
        //while (условие){тело цикла}
/*        int messageCount = 5;
        while (messageCount>0){
            System.out.println("Сообщение № = " + messageCount);
            messageCount--;
        }
        Scanner in3;
        System.out.println("Введите код. Трехзначное число");
        int code2;

        while (true){
            in3 = new Scanner(System.in);
            code2 = in3.nextInt();
            if (code2 == 123){
                System.out.println("ВЫ вошли как администратор");
                in3.close();
                break;
            } else if (code2 == 345){
                System.out.println("ВЫ вошли как участник");
                in3.close();
                break;
            } else {
                System.out.println("Повторите попытку");
            }
        }*/
        //do while цикл с постусловием
        do {
            System.out.println("Первая итерация");
        }while (false);

    }
}
