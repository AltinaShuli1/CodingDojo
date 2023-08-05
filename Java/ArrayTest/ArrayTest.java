package ARRAYTEST;
import java.util.ArrayList;
public class ArrayTest {
    public static void main(String[] args) {
    ArrayList<Integer> newArray = new ArrayList<Integer>();
    newArray.add(10);
    newArray.add(7);

    System.out.println(newArray);
    Integer num = newArray.get(1);
    System.out.println(num);
    newArray.set(0, 9);
    System.out.println(newArray);
}
}
