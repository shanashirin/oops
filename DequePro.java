import java.util.Deque;
import java.util.ArrayDeque;

public class DequePro{
    public static void main(String[] args){
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("One");
        deque.addFirst("Two");
        deque.addFirst("Zero");
        deque.addFirst("Three");
        System.out.println("Deque Elements:"+deque);
        String removefront=deque.removeFirst();
        String removerear=deque.removeLast();
        System.out.println("Remove from front:"+removefront);
        System.out.println("Remove from rear:"+removerear);
        System.out.println("Deque after removal:"+deque);
        System.out.println("Peek first:"+deque.peekFirst());
        System.out.println("Peek last:"+deque.peekLast());
    }
}
