package homework04;

import java.util.Scanner;

public class Menu {
    public void mainMenu() {
        System.out.println("-".repeat(25) + "\n" +
                "< Cправочник сотрудников >\n" +
                "-".repeat(25));
        System.out.println("Выберите необходимый пункт меню: \n" +
                "1 - Вывести список сотрудников\n" +
                "2 - Добавить сотрудника\n" +
                "3 - Поиск сотрудника по стажу\n" +
                "4 - Поиск сотрудника по имени\n" +
                "5 - Поиск сотрудника по номеру\n" +
                "6 - Удалить контакт\n" +
                "7 - Записать в файл\n" +
                "q - Выход из программы");
    }

    public void pressEnter(){
        System.out.println("Нажмите Enter для продолжения...");
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
    }
}