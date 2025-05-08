package polymor;

public class Childclass extends polypara {

    // Overriding the sum method
    @Override
    public void sum(int a, int b) {
        int c = a - b;
        System.out.println("Difference is: " + c);
    }

    public static void main(String[] args) {
        // Create object of parent class
        polypara parent = new polypara();
        parent.sum(10, 5); // Calls parent method (sum)

        // Create object of child class
        Childclass child = new Childclass();
        child.sum(8, 4); // Calls overridden method (difference)
    }
}