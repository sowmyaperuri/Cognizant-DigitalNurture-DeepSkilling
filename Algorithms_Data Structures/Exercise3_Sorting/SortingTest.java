public class SortingTest {
    public static void main(String[] args) {
        Order[] orders1 = {
            new Order(1, "Sowmya", 2500.0),
            new Order(2, "Ravi", 1200.0),
            new Order(3, "Anu", 4500.0),
            new Order(4, "Kiran", 1800.0)
        };

        Order[] orders2 = {
            new Order(1, "Sowmya", 2500.0),
            new Order(2, "Ravi", 1200.0),
            new Order(3, "Anu", 4500.0),
            new Order(4, "Kiran", 1800.0)
        };

        System.out.println("Original Orders:");
        Sorter.displayOrders(orders1);

        System.out.println("\nOrders after Bubble Sort:");
        Sorter.bubbleSort(orders1);
        Sorter.displayOrders(orders1);

        System.out.println("\nOrders after Quick Sort:");
        Sorter.quickSort(orders2, 0, orders2.length - 1);
        Sorter.displayOrders(orders2);
    }
}