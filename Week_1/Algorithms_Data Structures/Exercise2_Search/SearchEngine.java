
import java.util.Arrays;
import java.util.Comparator;

public class SearchEngine {

    // Linear Search
    public static SearchProduct linearSearch(SearchProduct[] products, String targetName) {
        for (SearchProduct product : products) {
            if (product.getProductName().equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static SearchProduct binarySearch(SearchProduct[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = products[mid].getProductName().compareToIgnoreCase(targetName);

            if (compare == 0) {
                return products[mid];
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Sort products by name before binary search
    public static void sortProductsByName(SearchProduct[] products) {
        Arrays.sort(products, Comparator.comparing(SearchProduct::getProductName, String.CASE_INSENSITIVE_ORDER));
    }
}
