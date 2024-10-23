package sw;
import java.util.Scanner;

public class CoffeeVendingMachine {
    private String name;
    private IngredientBox ice = new IngredientBox("[재료1] Ice           ", 5);
    private IngredientBox coffee = new IngredientBox("[재료2] Coffee       ", 20);
    private IngredientBox milk = new IngredientBox("[재료3] Milk          ", 5);
    private Scanner scanner = new Scanner(System.in);

    public CoffeeVendingMachine(String name){
        this.name=name;
    }

    private int getMenu(){
        System.out.println("===========================");
        System.out.println("1. ICE 아메리카노");
        System.out.println("2. 카페라떼");
        System.out.println("3. 아메리카노");
        System.out.println("4. 종료");
        System.out.println("===========================");
        System.out.print("메뉴 입력: ");
        int menu = scanner.nextInt();
        return menu;
    }

    private void print(){
        ice.print();
        coffee.print();
        milk.print();
    }

    public void run(){
        System.out.println("===========================");
        System.out.println("["+name+" 입니다. ]");
        System.out.println("===========================");
        print();
        System.out.println();
        while(true){
            int menu = getMenu();
            switch(menu){
                case 1:
                    if(ice.isEmpty()||coffee.isEmpty()){
                        System.out.println("원료가 부족합니다");
                        break;
                    }
                    ice.consume(); coffee.consume();
                    break;
                case 2:
                    if(milk.isEmpty()||coffee.isEmpty()){
                        System.out.println("원료가 부족합니다");
                        break;
                    }
                    milk.consume(); coffee.consume();
                    break;
                case 3:
                    if(coffee.isEmpty()){
                        System.out.println("원료가 부족합니다");
                        break;
                    }
                    coffee.consume();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("오류! 다시 입력하세요");
                    continue;    
            }
            print();
        }
    }
}
