import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> elements  = new Vector();

        elements.add(10);
        elements.add(20);
        elements.add(30);
        elements.add(40);
        elements.add(50);

        System.out.println("Original 5 Element Vector "+elements);

        elements.remove(1);

        System.out.println("After removing 1 element from original 5 Element Vector "+elements);

        elements.remove(2);

        System.out.println("After removing 2 elements from original 5 Element Vector "+elements);

    }
}