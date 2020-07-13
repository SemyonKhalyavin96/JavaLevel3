import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] input = {"мама", "папа", "брат", "сестра"};
	    MyArray<String> arr = new MyArray<>(input);
	    arr.printArray();
	    arr.swap(1,2);
	    arr.printArray();
	    ArrayList<String> list = new ArrayList<>();
	    list = arr.toArrayList();
	    System.out.println(list.getClass());
    }
}
