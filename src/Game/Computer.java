package Game;

public class Computer {
    String name;
    int score;
    //
    public int showFirst(){
        int choice=(int)(Math.random()*3)+1;
        if (choice == 1) {
            System.out.println(name+"出的是石头");

        } else if (choice == 2) {
            System.out.println(name+"出的是剪刀");
        } else if (choice == 3) {
            System.out.println(name+"出的是布");
        } else {
            System.out.println("输入有误！");
        }
            return choice;
    }
}
