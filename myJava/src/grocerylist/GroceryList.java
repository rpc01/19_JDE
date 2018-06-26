package grocerylist;

import java.util.ArrayList;


public class GroceryList {
	public static void main(String[] args) {
		ArrayList<String> grocery = new ArrayList<>();
        grocery.add("xocolate");
        grocery.add("milk");
        grocery.add(0, "water");

        ArrayList<String> grocery2 = new ArrayList<>();
        grocery2.add("wine");
        grocery2.add("beer");
        grocery2.add(0, "wodka");
        
        
        System.out.println("This is list1" +grocery);
        System.out.println("This is list2" +grocery2);
		
        grocery.addAll(grocery2);
        System.out.println(grocery);
        
        if(grocery.contains("milk"))
            grocery.remove("milk");
        System.out.println(grocery);
        System.out.println(grocery.get(2));
        
		
	}
}
