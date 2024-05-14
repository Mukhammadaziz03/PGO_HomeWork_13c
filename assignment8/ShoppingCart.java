import java.util.ArrayList;
public class ShoppingCart {
    private ArrayList<Product> productList  = new ArrayList<>();
    private User user;

    public ShoppingCart() {
        this.productList = new ArrayList<>();
    }

    public ShoppingCart(User user) {
        this.productList = new ArrayList<>();
        this.user = user;
    }

    public ShoppingCart(User user, ArrayList<Product> productList) {
        this.productList = productList;
        this.user = user;
    }

    public void addProduct(Product product) {
        if (product.getNumberOfPieces() > 0) {
            productList.add(product);
            product.setNumberOfPieces(product.getNumberOfPieces() - 1);
        } else {
            System.out.println("Product out of stock.");
        }
    }

    public void removeProduct(Product product) {
        productList.remove(product);
        product.setNumberOfPieces(product.getNumberOfPieces() + 1);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : productList) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void pay() {
        System.out.println("Total price: " + calculateTotalPrice());
    }
}