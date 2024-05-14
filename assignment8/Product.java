public class Product {
    private String name;
    private double price;
    private String productCode;
    private int numberOfPieces;

    public Product(String name, double price, String productCode) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieces = 0;
    }

    public Product(String name, double price, String productCode, int numberOfPieces) {
        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.numberOfPieces = numberOfPieces;
    }
    public void displayInfo(){
        System.out.println("Product name: ");
        System.out.println(getName());
        System.out.println(getPrice());
        System.out.println(getProductCode());
        System.out.println(getNumberOfPieces());
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumberOfPieces(int numberOfPieces) {
        if (numberOfPieces >= 0) {
            this.numberOfPieces = numberOfPieces;
        } else {
            System.out.println("Number of pieces cannot be less than 0.");
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }
}