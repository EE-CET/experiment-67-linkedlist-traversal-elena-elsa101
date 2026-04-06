import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Read the integer N
        int N = scanner.nextInt();
        
        // TODO: Create a LinkedList of Integers
        LinkedList<Integer> list = new LinkedList<>();
        
        // TODO: Read N integers and add them to the LinkedList
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }
        
        // TODO: Create a ListIterator for the LinkedList
        ListIterator<Integer> iterator = list.listIterator();
        
        // TODO: Traverse the list in the forward direction and print the elements
        System.out.print("Forward: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        
        // TODO: Traverse the list in the backward direction and print the elements
        System.out.print("Backward: ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        
        scanner.close();
    }
}
