package java8.predicates;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintProducts {
    public static void main(String[] args) {
        // Create Product instances
        Product lollipop = new Product("LolloPop", 400, "Chocolates", "A");
        Product cakes = new Product("Cake", 900, "Cakes", "A");
        Product table = new Product("Table", 2000, "Furniture", "A");
        Product appliances = new Product("Mixie", 3000, "Chocolates", "A");

        // Create a list of products
        List<Product> allProducts = new ArrayList<>();
        allProducts.add(lollipop);
        allProducts.add(cakes);
        allProducts.add(table);
        allProducts.add(appliances);

        // Call method to filter and print products with price greater than 1000
        getPricesGreaterThanThousands(allProducts);
    }

    private static void getPricesGreaterThanThousands(List<Product> allProducts) {
        // Filter products with price greater than 1000 and collect into a list
        List<Product> expensiveProducts = allProducts.stream()
                .filter(product ->
                    product.getPrice() > 1000
                ) // Correct lambda expression
                .collect(Collectors.toList());

        // Print the filtered products
        System.out.println("Products with price greater than 1000:");
        expensiveProducts.forEach(System.out::println);
    }
}
