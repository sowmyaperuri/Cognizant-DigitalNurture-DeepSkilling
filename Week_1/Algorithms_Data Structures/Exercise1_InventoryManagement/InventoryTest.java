
public class InventoryTest{
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Product p1 = new Product(101, "Laptop", 10, 55000.0);
        Product p2 = new Product(102, "Mouse", 50, 500.0);
        Product p3 = new Product(103, "Keyboard", 30, 1200.0);
        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);
        manager.displayProducts();
        System.out.println("Updating product with ID 102...");
        manager.updateProduct(102, "Wireless Mouse", 45, 600.0);
        manager.displayProducts();
        System.out.println("Deleting product with ID 101...");
        manager.deleteProduct(101);
        manager.displayProducts();
    }
}
