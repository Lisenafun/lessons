package lesson6;

import lesson6.battleunit.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight(100, 20);
        Spearman spearman = new Spearman(70,40);

        Doctor doctor = new Doctor(50,10);
        doctor.attack(knight);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название персонажа");
        String userChoice = scanner.nextLine();
        BattleUnitFactory unitFactory = new BattleUnitFactory();
        BattleUnit unit = unitFactory.create(userChoice);
        Fight fight = new Fight(unit,spearman);
        fight.fight();
        System.out.println(fight.fightResult());

/*        Парадигмы ООП:
        1.Абстракция - достугается с помощью интерфейсов и абстрактных классов.
        2.Инкапсуляция  - сокрытие деталей реализации класса с помощью модификаторов доступа
        3.Полиморфизм - это возможность класса выступать в программе в роли любого из своих предков,
        несмотря на то, что в нем может быть изменена реализация любого из методов.
        Также создание методов с одинаковым названием, но разными аргументами.
        4.Наследование -  это отношение между классами,
        при котором один класс расширяет функциональность другого. Осуществляется с помощью extends
        */

    }
}
