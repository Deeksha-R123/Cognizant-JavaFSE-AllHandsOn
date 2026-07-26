package dsaexercise1;

public class SearchTest {

    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int compare = products[mid].productName.compareToIgnoreCase(name);

            if (compare == 0)
                return products[mid];

            if (compare < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Tablet", "Electronics")
        };

        Product result = linearSearch(products, "Mobile");

        if (result != null)
            System.out.println("Found: " + result.productName);

        Product result2 = binarySearch(products, "Mobile");

        if (result2 != null)
            System.out.println("Found using Binary Search: " + result2.productName);
    }
}
