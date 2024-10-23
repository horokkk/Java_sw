package sw;

public class IngredientBox extends Box {
    private String name;
    
    public IngredientBox(){
        this.name="에스프레소";
        this.size=10;
    }

    public IngredientBox(String name, int size){
        super(size);
        this.name=name;
    }

    public void print(){
        System.out.println(name + "["+size+"]");
        for(int i=0; i<size; i++){
            System.out.print("#|");
        }
        System.out.println();
    }

    public boolean consume(){
        if(size==0){
            return false;
        }
        size--;
        return true;
    }
}
