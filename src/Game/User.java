package Game;

import java.util.Scanner;

public class User {
    String name;
    int score;

    public int showFirst() {
        System.out.println("请出拳：1、石头 2、剪刀 3、布");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("您出的是石头");

        } else if (choice == 2) {
            System.out.println("您出的是剪刀");
        } else if (choice == 3) {
            System.out.println("您出的是布");
        } else {
                System.out.println("输入有误！");
        }
        return choice;
    }
}
