package interfaceTest;

class Circle implements Shape, Color {
	private int radius;
	private String color;

	public Circle(int radius) {
		this.radius=radius;
		this.color = "BLUE";
	}
	
	public void draw() {
		System.out.println("Circle: draw() 메소드 콜");
	}
	
	public double getArea() {
		System.out.print("Circle: getArea()  ");
		return PI*radius*radius;
	}
	
	public void printColor() {
		System.out.println("Circle color = " + color);
	}
	
	public void changeColor(String color) {
		System.out.println("Circle color 변경 = " + color);
	}
}
