import java.util.HashSet;
import java.util.Set;
public class HashSets{
    public static void main(String[] args){
        HashSet <String> fruits = new HashSet<String>();
        fruits.add("Strawberry");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Pineapple");
        fruits.add("Strawberry");
        // System.out.println(fruits);
        // System.out.println(fruits.contains("Strawberry"));
        // fruits.remove("Watermelon");
        // System.out.println(fruits);
        // for(String i : fruits){
        //     System.out.println(i);
        // }
        Set<String> salads = new HashSet<String>();
        salads.add("Apple");
        salads.add("Banana");
        salads.add("Blueberry");
        salads.add("Strawberry");
        salads.add("Orange");
        System.out.println(salads);
        salads.addAll(fruits);
        System.out.println(salads);
        salads.retainAll(fruits);
        System.out.println(salads);
        salads.remove("Apple");
        salads.remove("Banana");
        salads.remove("Blueberry");
        System.out.println(salads);
        System.out.println(fruits.containsAll(salads));
    }
}