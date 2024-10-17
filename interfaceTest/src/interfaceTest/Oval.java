package interfaceTest;

class Oval implements Shape, Color{
	private int radius;
	private String color;
	

	
	public Oval(int radius2) {
		this.radius=radius2;
		this.color = "BLUE";
	}

	public void draw() {
		System.out.println("oval: draw()  짧은 반지름이" +  radius + "인 타원");
	}
	
	public double getArea() {
		System.out.println("oval: getArea()를 구할 수 없습니다!");
		return 0;
	}
	
	public void printColor() {
		System.out.println("oval color = " + color);
	}
	
	public void changeColor(String color) {
		System.out.println("oval color 변경 = " + color);
	}
}