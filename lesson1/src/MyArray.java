import java.util.ArrayList;
import java.util.Collections;

public class MyArray<T> {
    public T[] arr;
    public int size;

    public MyArray(T[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }

    public void swap(int i, int j){ // п. 1
        T elem = this.arr[i];
        this.arr[i] = this.arr[j];
        this.arr[j] = elem;
    }

    public ArrayList<T> toArrayList(){ // п. 2
        ArrayList<T> out = new ArrayList<>();
        Collections.addAll(out, this.arr);
        return out;
    }

    public void printArray(){
        for(int i = 0; i < this.size; i++){
            System.out.print(this.arr[i] + " ");
        }
        System.out.println("");
    }

}
