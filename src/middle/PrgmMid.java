/**
 * 
 */
package middle;

/**
 * @author Administrator
 *
 */
import java.util.LinkedList;
public class PrgmMid {
	//Java Program to Find the Middle Element in a Linked List

	
	  public static void main(String[] args)
	  {
	    // create a linked list using the LinkedList class
	    LinkedList<Integer> ll = new LinkedList<>();
	    // Add elements to LinkedList
	    ll.add(2);
	    ll.addFirst(3);
	    ll.addLast(5);
	    ll.addLast(6);
	    ll.addLast(8);
	    ll.addLast(13);
	    ll.addLast(18);
	    System.out.println("LinkedList: " + ll);
	    // access middle element
	    int middle = ll.get(ll.size()/2);
	    System.out.println("Middle Element: " + middle);
	    }
	}


