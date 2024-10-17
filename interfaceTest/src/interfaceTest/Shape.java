package interfaceTest;

interface Shape {
    public static final double PI = 3.14;
        
        public abstract void draw();
        public abstract double getArea();
        
        public default void shapeRedraw() {
            System.out.println("--interface Shape shapeRedraw(): 다시 그립니다.");
            System.out.print("--interface Shape draw() 콜 : ");
            
            draw();
        }
    }
    