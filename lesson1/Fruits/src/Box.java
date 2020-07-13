import java.util.ArrayList;

public class Box<T extends Fruit>{
    private ArrayList<T> box;
    private float boxWeight = 0f;

    public Box(){
        this.box = new ArrayList<T>();
    }

    public void add(T fruit){
        box.add(fruit);
        boxWeight += fruit.getWeight();
    }

    public float getWeight(){
        if(box.isEmpty()) return 0;
        return boxWeight;
    }

    public boolean compare(Box box){
        return boxWeight == box.boxWeight;
    }

    public void move(Box<T> out){
        for(T fruit: box){
            out.add(fruit);
        }
        box.clear();
    }

}
