import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;


/**
 *
 * @author Producer
 */
public class iteratorexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection collection = Arrays.asList("red", "orange", "yellow", "green",
        "blue", "indigo", "violet",12);

               
        System.out.println(+collection.size());
        Iterator iterator = collection.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        
    }

}