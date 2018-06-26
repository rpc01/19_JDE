package linkedlistexample;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Producer
 */

public class LinkedListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList states = new LinkedList();
        states.add("Alaska");
        states.add("Arizona");
        states.add("Arkansas");
        states.add("Pennsylvania");
        states.add("California");
        states.add("Colorado");
        states.add("Connecticut");
        
        states.addFirst("Alabama");
        System.out.println(states);
        System.out.println("last state in my list: "+states.getLast());
        
        ListIterator iterator = states.listIterator(states.size());
        while(iterator.hasPrevious()) {
            System.out.println("With reverse order "+iterator.previous());
        }
     
        ListIterator iterator2 = states.listIterator();
        while(iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        
        System.out.println(states.get(2));
  
    }
  
  
}