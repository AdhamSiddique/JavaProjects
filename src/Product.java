public class Product {

    private double price;
    private int quantity;
    private String name;

    public Product (String intitalName, double intialPrice, int intialQuantity){
    this.price = intialPrice;
    this.name = intitalName;
    this.quantity = intialQuantity;
    }

    public void printProduct(){
        System.out.println(name + "," + price + "," + quantity);
    }


}
