package Game;

import java.util.Scanner;

public class Gussinggame {

    User user;

    Computer computer;

   //对战次数
    int count;

    //初始化：
    public void init(){

        System.out.println("请输入您的名字");

        Scanner input = new Scanner(System.in);
        String name = input.next();
        user =new User();
        user.name = name;
        user.score = 0;
        System.out.println("请输入您的对手： 1、张三 2、李四 3、王五");
        int choice = input.nextInt();
        computer=new Computer();
        computer.score = 0;
        switch(choice){
            case 1 :
                computer.name="张三";
                   break;
            case 2 :
                computer.name="李四";
                  break;
            case 3 :
                computer.name="王五";
            default:
                System.out.println("您输入有错");

        }
        System.out.println("您选择了与TA对战："+computer.name);
    }

    public void start(){
        Scanner input=new Scanner(System.in);
        init();
        String isContinue =null;

        do {
            int userFist = user.showFirst();
            int computerFist = computer.showFirst();
            calcReasult(userFist, computerFist);
            System.out.println("是否继续？ y(继续)/其他（结束）");
            //输入字符“y,n”
          isContinue =input.next();

        }while("y".equals(isContinue));
        showReasult(user,computer);

    }
    //计算最终结果
    public void calcReasult(int userFist,int computerFist){
        //1.剪刀 2.石头 3.布
        if((userFist==1&&computerFist==3)||(userFist==2&&computerFist==1)||(userFist==3&&computerFist==2)){
            System.out.println("您输了");
            user.score++;
        }else if((userFist==3&&computerFist==1)||(userFist==1&&computerFist==2)||(userFist==2&&computerFist==3)){
            System.out.println("您赢了");
            computer.score++;
        }else{
            System.out.println("平局");
        }

    }
    public void showReasult(User user,Computer computer){
        System.out.println(user.name+"\t"+user.score);
        System.out.println(computer.name+"\t"+computer.score);
        if(user.score>computer.score){
            System.out.println("您取得最终胜利");
        }else  if(user.score<computer.score){
            System.out.println("抱歉，失败！");
        }else{
            System.out.println("比分相等，平局");
        }


    }
    public static void main(String[] args){
         Gussinggame gussinggame=new Gussinggame();
         gussinggame.start();

    }

}
