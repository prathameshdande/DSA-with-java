import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class ArrayCollection {
    public static void main(String[] args) {

        // The all function is same for both arraylist and linked list as they both
        // implement the List interface
        // ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(10);
        // arr.add(11);
        // arr.add(12);
        // System.out.println(arr);

        // arr.remove(0);
        // System.out.println(arr);
        // arr.set(0, 22);
        // System.out.println(arr);

        // ArrayList<Integer> arr2 = new ArrayList<>();
        // arr2.add(100);
        // arr2.add(200);
        // arr2.add(150);

        // arr.addAll(arr2);
        // System.out.println(arr);
        // arr.removeAll(arr);
        // System.out.println(arr);
        // arr2.clear();
        // System.out.println(arr2.size());

        // arr.add(100);
        // arr.add(200);
        // arr.add(150);
        // arr.add(10);
        // arr.add(11);
        // arr.add(12);

        // System.out.println(arr);

        // //traversing through the arraylist
        // // Iterator<Integer> it = arr.iterator();
        // // while(it.hasNext()){
        // // System.out.println("Elements : "+it.next());
        // // }

        // System.out.println("First element : "+arr.get(0));

        // arr.toArray();
        // System.out.println("After converting to array: "+arr);
        // arr.contains(200);

        // System.out.println("Does the array contain 200? "+arr.contains(200));

        // ArrayList<Integer> collection = new ArrayList<>();

        // collection.ensureCapacity(100); //ensure the capacity of the collection to
        // hold 100 elements
        // collection.add(1);
        // collection.add(45);
        // collection.add(58);
        // collection.add(14);
        // collection.add(87);
        // collection.add(763);
        // collection.add(78);

        // System.out.println(collection);

        // //sorting the collection
        // Collections.sort(collection);
        // System.out.println("After sorting: "+collection);
        // Collections.sort(collection, Collections.reverseOrder());
        // System.out.println("After sorting in reverse order: "+collection);

        // //cloning the collection
        // ArrayList<Integer> cloned = (ArrayList<Integer>) collection.clone(); //In LL
        // cloning is not possible as it does not implement the cleanable interface
        // System.out.println("Cloned collection: "+cloned);
        // System.out.println(cloned.isEmpty());
        // System.out.println(cloned.indexOf(87));

        // LinkedList

        LinkedList<Integer> collection = new LinkedList<>();

        // collection.ensureCapacity(100); //ensure the capacity of the collection to
        // hold 100 elements
        collection.add(1);
        collection.add(45);
        collection.add(58);
        collection.add(14);
        collection.add(87);
        collection.add(763);
        collection.add(78);

        System.out.println(collection);

        // sorting the collection
        Collections.sort(collection);
        System.out.println("After sorting: " + collection);
        Collections.sort(collection, Collections.reverseOrder());
        System.out.println("After sorting in reverse order: " + collection);

        // cloning the collection
        // LinkedList<Integer> cloned = (LinkedList<Integer>) collection.clone(); //In
        // LL cloning is not possible as it does not implement the cleanable interface
        // System.out.println("Cloned collection: "+cloned);
        // System.out.println(cloned.isEmpty());
        // System.out.println(cloned.indexOf(87));

        // System.out.println(collection.lastIndexOf(1));
        // collection.addFirst(14);
        // collection.addLast(236);

        System.out.println(collection);
        Collections.sort(collection);
        System.out.println("After sorting: "+collection);
        // collection.removeFirst();
        // System.out.println(collection);
        // collection.removeLast();
        // System.out.println(collection);

        // System.out.println(collection.peek());
        // System.out.println(collection.poll());
        // System.out.println(collection);
        // collection.offer(150);
        // System.out.println(collection);

        //stack
        Stack<Integer> stk = new Stack<>();
        stk.push(10);
        stk.push(30);
        stk.push(25);
        stk.push(45);
        System.out.println(stk);
        // stk.pop();
        // System.out.println(stk);
        stk.peek();
        System.out.println("Top element: " + stk); 
        stk.search(45);
        System.out.println("Position of 45: " + stk.search(45)); // returns 
        stk.empty();
        System.out.println("Is stack empty? " + stk.empty());  
    }

}
