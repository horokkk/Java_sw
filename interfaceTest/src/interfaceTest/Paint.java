package interfaceTest;
import java.util.Scanner;

class Paint {
	Scanner scanner = new Scanner(System.in);
	
	private int getMenu() {
		System.out.println("=======================================");
		System.out.println("        interface Shape 실습 메뉴         ");
		System.out.println("=======================================");
		System.out.println("[1]Shape"); //shape 업캐스팅으로 객체 생성
		System.out.println("[2]Circle");
		System.out.println("[3]Ovaㅣ");
		System.out.println("[6]종료");
		System.out.print(">>>>>>>메뉴 선택 : ");
		int menu = scanner.nextInt();
		return menu;
	}
	
	
	void run() {
		while(true){
			int menu = getMenu();
			switch(menu){
				case 1:
					Shape pizza = new Circle(5);
					pizza.shapeRedraw();
					System.out.println("피자의 면적은 " +  pizza.getArea());
					pizza.draw();
					
					Circle pizza2 = (Circle) pizza; //다운캐스팅
					pizza2.changeColor("Red");
					pizza2.printColor();
					
					break;
				case 2:
					Circle circle = new Circle(4);
					circle.shapeRedraw();
					System.out.println("circle의 면적은 " + circle.getArea());
					circle.changeColor("BLUE");
					circle.printColor();
					break;
				case 3:
					Oval oval = new Oval(3);
					oval.shapeRedraw();
					System.out.println("oval의 면적은 " + oval.getArea());
					oval.changeColor("GREEN");
					oval.printColor();
					break;
				case 6:
					System.out.println("Interface 프로그램 종료합니다.");
				default:
					System.out.println();
			}
		}
	}
}