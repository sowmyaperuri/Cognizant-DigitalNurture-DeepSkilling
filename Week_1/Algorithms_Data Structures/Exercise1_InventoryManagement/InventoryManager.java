
import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<Integer, Product> inventory;
    public InventoryManager(){
        inventory = new HashMap<>();
    }
    public void addProduct(Product product){
        inventory.put(product.getProductId(), product);
        System.out.println("Product added successfully.");
    }
    public void updateProduct(int productId, String newName, int newQuantity, double newPrice){
        Product product = inventory.get(productId);
        if(product != null){
            product.setProductName(newName);
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }
    public void deleteProduct(int productId){
        if(inventory.containsKey(productId)){
            inventory.remove(productId);
            System.out.println("Product deleted successfully.");
        }else{
            System.out.println("Product not found.");
        }
    }
    public void displayProducts(){
        if(inventory.isEmpty()){
            System.out.println("No products in inventory.");
        } else {
            for(Product product : inventory.values()){
                System.out.println(product);
            }
        }
    }
}
