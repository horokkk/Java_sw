package sp1;
import java.util.Scanner;

public class Bank {
    private Scanner scanner = new Scanner(System.in);
    private int amount = 0;
    private int num;
    private int num2;
    private String name;

    public Bank(String name) {
        this.name=name;
    }

    private void print(){
        System.out.println("------------------------------------");
        System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
        System.out.println("------------------------------------");
        System.out.println();
    }

    private int getMenu(){
        System.out.print("선택 > " );
        int menu = scanner.nextInt();
        return menu;
    }

    void run(){
        while(true){
            print();
            int menu = getMenu();
            switch(menu){
                case 1:
                    int num = scanner.nextInt();
                    amount = num;
                    System.out.println("예금액 : " +num);
                    break;

                case 2:
                    int num2 = scanner.nextInt();
                    amount = amount - num2;
                    System.out.println("출금액 : " +num2);
                    break;

                case 3:
                    System.out.println("잔고 : " + amount);
                    break;

                case 4:
                    System.out.println(name + " 은행 종료합니다. ");
                    return;

                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력 바랍니다. ");
                    continue;
            }
        }
    }
}
