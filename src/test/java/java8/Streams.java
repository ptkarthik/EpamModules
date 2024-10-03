package java8;

import java.util.List;

public class Streams {
	public class Product {
	    private String name;
	    private double price;
	    private String category;
	    private String grade;

	    // Parameterized constructor
	    public Product(String name, double price, String category, String grade) {
	        this.name = name;
	        this.price = price;
	        this.category = category;
	        this.grade = grade;
	    }

	    // Getter methods
	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public String getCategory() {
	        return category;
	    }

	    public String getGrade() {
	        return grade;
	    }

	    @Override
	    public String toString() {
	        return "Product{name='" + name + "', price=" + price + ", category='" + category + "', grade='" + grade + "'}";
	    }
	}

	// Create a list of Product objects
	        List<Product> products = new ArrayList<>();
	        products.add(new Product("Smartwatch", 299.99, "Electronics", "Standard"));
	        products.add(new Product("Laptop", 1500.00, "Electronics", "Premium"));
	        products.add(new Product("Desk", 1200.00, "Furniture", "Standard"));
	        products.add(new Product("Headphones", 89.99, "Electronics", "Standard"));
	        products.add(new Product("Chair", 85.00, "Furniture", "Standard"));

	        // Use Streams to filter products with price > 1000
	        List<Product> expensiveProducts = products.stream()
	                .filter(product -> product.getPrice() > 1000)
	                .collect(Collectors.toList());

	        // Print the filtered products
	        System.out.println("Products with price > 1000:");
	        expensiveProducts.forEach(System.out::println);
	======================================================================================================================================
	// Create a list of Product objects
	        List<Product> products = new ArrayList<>();
	        products.add(new Product("Smartwatch", 299.99, "Electronics", "Standard"));
	        products.add(new Product("Laptop", 1500.00, "Electronics", "Premium"));
	        products.add(new Product("Desk", 1200.00, "Furniture", "Standard"));
	        products.add(new Product("Headphones", 89.99, "Electronics", "Standard"));
	        products.add(new Product("Chair", 85.00, "Furniture", "Standard"));

	        // Use Streams to filter products by category "Electronics"
	        List<Product> electronicsProducts = products.stream()
	                .filter(product -> "Electronics".equals(product.getCategory()))
	                .collect(Collectors.toList());

	        // Print the filtered products
	        System.out.println("Products in Electronics category:");
	        electronicsProducts.forEach(System.out::println);
	=====================================================================================================================================
	// Create a list of Product objects
	        List<Product> products = new ArrayList<>();
	        products.add(new Product("Smartwatch", 299.99, "Electronics", "Standard"));
	        products.add(new Product("Laptop", 1500.00, "Electronics", "Premium"));
	        products.add(new Product("Desk", 1200.00, "Furniture", "Standard"));
	        products.add(new Product("Headphones", 89.99, "Electronics", "Standard"));
	        products.add(new Product("Chair", 85.00, "Furniture", "Standard"));

	        // Use Streams to filter products with price > 1000 and category "Electronics"
	        List<Product> filteredProducts = products.stream()
	                .filter(product -> product.getPrice() > 1000 && "Electronics".equals(product.getCategory()))
	                .collect(Collectors.toList());

	        // Convert the names of the filtered products to uppercase
	        List<Product> updatedProducts = filteredProducts.stream()
	                .map(product -> new Product(
	                        product.getName().toUpperCase(),
	                        product.getPrice(),
	                        product.getCategory(),
	                        product.getGrade()
	                ))
	                .collect(Collectors.toList());

	        // Print the updated products
	        System.out.println("Products with price > 1000 and category 'Electronics' (names in uppercase):");
	        updatedProducts.forEach(System.out::println);
	==========================================================================================================================================
	// Create a list of Product objects
	        List<Product> products = new ArrayList<>();
	        products.add(new Product("Smartwatch", 299.99, "Electronics", "Standard"));
	        products.add(new Product("Laptop", 1500.00, "Electronics", "Premium"));
	        products.add(new Product("Desk", 1200.00, "Furniture", "Standard"));
	        products.add(new Product("Headphones", 89.99, "Electronics", "Standard"));
	        products.add(new Product("Chair", 85.00, "Furniture", "Standard"));

	        // Use Streams to filter and count products in the "Electronics" category
	        long electronicsCount = products.stream()
	                .filter(product -> "Electronics".equals(product.getCategory()))
	                .count();

	        // Print the count of electronic products
	        System.out.println("Count of electronic products: " + electronicsCount);
	=======================================================================================================================================
}
