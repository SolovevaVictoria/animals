package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Bars = new ArrayList<>();
        Bars.add("run");
        Cat cat1 = new Cat("Барсик", new Date(123, 11,15), Bars);
        Dog dog1 = new Dog("Рекс");


        reestr r1 = new reestr("Реестр животных");
        r1.addPet(cat1);
        r1.addPet(dog1);
        r1.printAll();
        while (true){
            try {
                System.out.println("Введите номер команды:");
                System.out.println("0 - закончить");
                System.out.println("1 - добавить животное");
                System.out.println("2 - вывести на экран всех животных из реестра");
                System.out.println("3 - добавить навык животному");
                System.out.println("4 - посмотреть список команд животного");
                int command = scan.nextInt();
                switch (command) {
                    case 0:
                        System.out.println("Завершение работы");
                        break;
                    case 1:
                        System.out.println("добавить вьючное животное - 1; добавить домашнее животное - 2;");
                        int c1 = scan.nextInt();
                        System.out.println("Введите имя:");
                        String name = sc.nextLine();
                        if (c1 == 1){r1.addPackAnimals(new PackAnimals(name));}
                        else if (c1 ==2){r1.addPet(new Pets(name));}
                        break;
                    case 2:
                        r1.printAll();
                        break;
                    case 3:
                        System.out.println("Введите имя: ");
                        String n = sc.nextLine();
                        r1.addSkill(n);
                        break;
                    case 4:
                        System.out.println("Введите имя: ");
                        String n1 = sc.nextLine();
                        r1.prSkill(n1);
                        break;
                }
                if (command == 0){break;}
            }
            catch (InputMismatchException e) {
                    System.out.println("Ошибка");
                    scan.nextLine();
                }
            }
    }
}
