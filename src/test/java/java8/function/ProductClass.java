package java8.function;

public class ProductClass {
    public void setName(String name) {
        this.name = "**"+name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private String name;
    private double price;
    private String category;
    private String grade;

    public ProductClass(String name, double price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }

    // Getters
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
    public void setGrade(String grade) {
        this.grade= grade;
    }
    public String toString() {
        return "ProductClass [name=" + name + ", price=" + price + ", category=" + category+ ", grade=" + grade + "]";
    }
}
