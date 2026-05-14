
import java.util.HashSet;
import java.util.Set;


public class QueueClass {
    public static void main(String[] args) {
        // Queue<Integer> qu = new LinkedList<>();
        // qu.offer(10);
        // qu.offer(35);
        // qu.offer(20);
        // qu.offer(15);
        // System.out.println(qu);
        // System.out.println(qu.peek());
        // System.out.println(qu.poll());
        // System.out.println("After polling an element: "+qu);

        // ArrayDequeue
        // Queue<Integer> qu = new ArrayDeque<>();
        // Deque<Integer> qu = new ArrayDeque<>();
        // qu.offer(10);
        // qu.offerFirst(40);
        // qu.offer(35);
        // qu.offer(20);
        // qu.offer(15);
        // qu.offerLast(50);
        // System.out.println(qu);
        // System.out.println(qu.size());
        // System.out.println(qu.peekLast());
        // System.out.println(qu.pollLast());

        // System.out.println("After polling an element: " + qu);

        //queue using stack
        // Deque<Integer> qu = new ArrayDeque<>();
        // qu.push(10);
        // qu.push(40);
        // qu.push(35);
        // qu.push(20);
        // qu.push(15);
        // qu.push(50);
        // System.out.println(qu);
        // System.out.println(qu.size());
        // System.out.println(qu.peek());
        // System.out.println(qu.pop());

        // System.out.println("After polling an element: " + qu);


        //priority queue
        // Queue<Integer> qu = new PriorityQueue<>((a,b)->b-a);
        // qu.offer(40);
        // qu.offer(85);
        // qu.offer(65);
        // qu.offer(12);
        // qu.offer(20);
        // System.out.println(qu);
        // System.out.println(qu.size());
        // System.out.println(qu.peek());
        // System.out.println(qu.poll());

        // System.out.println("After polling an element: " + qu);


        //Set
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        //set2
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        //set2
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set1.contains(4));
        System.out.println(set1.containsAll(set2));
        System.out.println(set1.retainAll(set2));
        System.out.println(set1);

    }
}
