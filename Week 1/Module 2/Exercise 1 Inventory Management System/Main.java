public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        
        Product p1 = new Product(101, "Car", 50, 399.00);
        Product p2 = new Product(102, "Bike", 20, 999.00);
        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.displayInventory();

   
        manager.updateProduct(101, 60, 379.00);
        manager.displayInventory();

       
        manager.deleteProduct(102);
        manager.displayInventory();
    }
}
