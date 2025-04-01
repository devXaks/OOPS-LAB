package Assignment5_2025BMS002;

// Programmed by 2024BMS002
class Product {
    String prodID;
    static int totalprice;
    int price;
    int quantity;

    Product(String prodID, int price, int quantity) {
        this.prodID = prodID;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Product ID: " + this.prodID + " Product Price: " + this.price + " Product Quantity: " + this.quantity + "\n");
    }

    void display(int quantity) {
        System.out.println("Purchased product with Product ID " + this.prodID + " Product Price: " + this.price + " Product Quantity: " + quantity + " Price total " + this.price * quantity);
        this.quantity -= quantity;
    }

    static int purchase(Product pa, int quantitya, Product pb, int quantityb, Product pc, int quantityc, Product pd, int quantityd, Product pe, int quantitye) {
        if (pa.quantity < quantitya) {
            System.out.println("Insufficient quantity for product " + pa.prodID);
            return 0;
        }
        if (pb.quantity < quantityb) {
            System.out.println("Insufficient quantity for product " + pb.prodID);
            return 0;
        }
        if (pc.quantity < quantityc) {
            System.out.println("Insufficient quantity for product " + pc.prodID);
            return 0;
        }
        if (pd.quantity < quantityd) {
            System.out.println("Insufficient quantity for product " + pd.prodID);
            return 0;
        }
        if (pe.quantity < quantitye) {
            System.out.println("Insufficient quantity for product " + pe.prodID);
            return 0;
        }

        pa.display(quantitya);
        pb.display(quantityb);
        pc.display(quantityc);
        pd.display(quantityd);
        pe.display(quantitye);

        totalprice = pa.price * quantitya + pb.price * quantityb + pc.price * quantityc + pd.price * quantityd + pe.price * quantitye;
        return totalprice;
    }
}

public class question3 {
    public static void main(String[] args) {
        Product p1 = new Product("Marie Gold Biscuit", 100, 100);
        Product p2 = new Product("Dairy Milk Silk", 200, 4);
        Product p3 = new Product("Amul Lassi", 20, 200);
        Product p4 = new Product("Ariel Washing Powder", 200, 200);
        Product p5 = new Product("Washing Brush", 50, 100);

        // Display initial product details
        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();

        // Purchase products
        int total = Product.purchase(p1, 1, p2, 2, p3, 3, p4, 3, p5, 10);
        System.out.println("The total price is: " + total);
    }
}