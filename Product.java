//Product comparison-create a product class with 1.name 2.price 3.quantity
//create 4 product objects
//write a method to calculate total=price*quantity
//find the product having the highest total values

class ProductDetails {
    String name;
    int price;
    int quantity;
    ProductDetails(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    int calculateTotal() {
        return price * quantity;
    }  
    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + calculateTotal());
        System.out.println();
    }
}
public class Product {
    public static void main(String[] args) {
        ProductDetails p1 = new ProductDetails("Laptop", 1200, 2);
        ProductDetails p2 = new ProductDetails("Smartphone", 800, 4);
        ProductDetails p3 = new ProductDetails("Headphones", 150, 10);
        ProductDetails p4 = new ProductDetails("Monitor", 300, 5);
        ProductDetails[] products = {p1, p2, p3, p4};
        for (ProductDetails p : products) {
            p.display();
        }
        ProductDetails highestProduct = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].calculateTotal() > highestProduct.calculateTotal()) {
                highestProduct = products[i];
            }
        }
        System.out.println("The product with the highest total value is "
                + highestProduct.name
                + " with a total value of "
                + highestProduct.calculateTotal());
    }
}
