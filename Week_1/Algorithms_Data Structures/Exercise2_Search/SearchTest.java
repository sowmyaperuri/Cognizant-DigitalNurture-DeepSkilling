public class SearchTest {
    public static void main(String[] args) {
        SearchProduct[] products = {
            new SearchProduct(201, "Laptop", "Electronics"),
            new SearchProduct(202, "Mouse", "Accessories"),
            new SearchProduct(203, "Keyboard", "Accessories"),
            new SearchProduct(204, "Phone", "Electronics"),
            new SearchProduct(205, "Tablet", "Electronics")
        };

        // Linear Search
        System.out.println("Linear Search Result:");
        SearchProduct result1 = SearchEngine.linearSearch(products, "Keyboard");
        if (result1 != null) {
            System.out.println(result1);
        } else {
            System.out.println("Product not found.");
        }

        // Sort array before binary search
        SearchEngine.sortProductsByName(products);

        // Binary Search
        System.out.println("\nBinary Search Result:");
        SearchProduct result2 = SearchEngine.binarySearch(products, "Keyboard");
        if (result2 != null) {
            System.out.println(result2);
        } else {
            System.out.println("Product not found.");
        }
    }
}
