public class Product {
    String name;
    int price;
    static int numberOfProducts = 0;
    public static final int MAX_PRODUCTS = 5;
    public Product(String name) {
        if (numberOfProducts >= MAX_PRODUCTS) {
            throw new IllegalStateException("Nie można utworzyć więcej produktów.");
        }
        this.name = name;
        numberOfProducts++;
    }
    public static int getNumberOfProducts() {
        return numberOfProducts;
    }
}
