public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1001, "Arun", 4500.00),
            new Order(1002, "Sneha", 1200.00),
            new Order(1003, "Rahul", 9800.00),
            new Order(1004, "Divya", 6700.00)
        };

       
        System.out.println("Bubble Sort by Total Price:");
        Order[] bubbleSorted = orders.clone();
        SortUtils.bubbleSort(bubbleSorted);
        SortUtils.displayOrders(bubbleSorted);

        
        System.out.println("Quick Sort by Total Price:");
        Order[] quickSorted = orders.clone();
        SortUtils.quickSort(quickSorted, 0, quickSorted.length - 1);
        SortUtils.displayOrders(quickSorted);
    }
}
