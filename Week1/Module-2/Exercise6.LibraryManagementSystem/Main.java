public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(201, "The Alchemist", "Paulo Coelho"),
            new Book(202, "Rich Dad Poor Dad", "Robert Kiyosaki"),
            new Book(203, "Atomic Habits", "James Clear"),
            new Book(204, "Ikigai", "Francesc Miralles")
        };

        
        System.out.println("Linear Search (Title: Atomic Habits)");
        Book found1 = SearchUtils.linearSearch(books, "Atomic Habits");
        if (found1 != null) found1.display();
        else System.out.println("Not Found");

        
        SearchUtils.sortByTitle(books);

        
        System.out.println("\nBinary Search (Title: Ikigai)");
        Book found2 = SearchUtils.binarySearch(books, "Ikigai");
        if (found2 != null) found2.display();
        else System.out.println("Not Found");
    }
}
