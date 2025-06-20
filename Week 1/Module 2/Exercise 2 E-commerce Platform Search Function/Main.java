public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Mouse", "Electronics"),
            new Product(102, "Keyboard", "Electronics"),
            new Product(103, "Shampoo", "Personal Care"),
            new Product(104, "Notebook", "Stationery")
        };

        //  Linear Search
        System.out.println(" Linear Search Result:");
        Product result1 = SearchUtils.linearSearch(products, "Shampoo");
        if (result1 != null) result1.display();
        else System.out.println("Product not found (Linear)");

        //  Binary Search
        System.out.println("\n Sorting for Binary Search...");
        SearchUtils.sortByName(products);

        System.out.println(" Binary Search Result:");
        Product result2 = SearchUtils.binarySearch(products, "Keyboard");
        if (result2 != null) result2.display();
        else System.out.println("Product not found (Binary)");
    }
}
