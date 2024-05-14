import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        User user1 = new User("max@example.com");
        User user2 = new User("gmail@example.com");

        Category electronics = new Category("Electronics");
        Category clothing = new Category("Clothing");
        Category books = new Category("Books");

        Product product1 = new Product("Laptop", 12.99, "LT001", 12);
        product1.displayInfo();
        Product product2 = new Product("T-shirt", 9.99, "TS001", 23);
        product2.displayInfo();
        Product product3 = new Product("Java Programming", 11.99, "BK001", 19);
        product3.displayInfo();
        electronics.addProduct(product1);
        clothing.addProduct(product2);
        books.addProduct(product3);

        ArrayList<Product> products = new ArrayList<>();
        products.add(product2);
        products.add(product3);

        ShoppingCart cart1 = new ShoppingCart(user1);
        ShoppingCart cart2 = new ShoppingCart(user2,  products);

        cart1.addProduct(product1);
        cart2.addProduct(product1);

        cart1.removeProduct(product1);
        cart1.pay();
        cart2.pay();
    }
}