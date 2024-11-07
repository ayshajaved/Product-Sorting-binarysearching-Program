import java.util.Arrays;
import java.util.Scanner;

public class Shop {
public static void displayProducts(Product[] products){
    System.out.printf("%-15s %-15s %-10s %-15s %-10s\n", "ID" ,"Product", "Price", "Category", "Quantity");
    System.out.printf("%-15s %-15s %-10s %-15s %-10s\n", "-----","-------", "-----", "--------", "--------");
    for(Product product: products){
        System.out.println(product);
    }
}
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            Product products[] = new Product[10];
            //adding products to the array
            products[0] = new Product(9,"Laptop",5000,"Electronics",45);
            products[1] = new Product(12,"Mobile",1000,"Electronics",5);
            products[2] = new Product(67,"Tv",7000,"Electronics",65);
            products[3] = new Product(3,"pen",800,"Stationary",5);
            products[4] = new Product(23,"LaptopDell",90000,"Electronics",3);
            
            //Adding remaining objects by Arrays.fill() method
            Arrays.fill(products, 5, products.length, products[0]);

            while(true){
                System.out.println("""
                        ============================
                            WELCOME TO THE SHOP
                        ============================
                        Enter your choice:
                        1: Display all products
                        2: Sort according to ID
                        3: Sort According to Name
                        4: Sort According to Price
                        5: Sort According to Quantity
                        6: Binary Searching of Products
                        7: Exit
                        """);
                int choice = scanner.nextInt();
                scanner.nextLine();
                        switch(choice){
                            case 1:
                            displayProducts(products);
                            break;
                            case 2:
                            Arrays.sort(products);
                            displayProducts(products);
                            break;
                            case 3:
                            Arrays.sort(products,new NameComparison());
                            displayProducts(products);
                            break;
                            case 4:
                            Arrays.sort(products, new PriceComparison());
                            displayProducts(products);
                            break;
                            case 5:
                            Arrays.sort(products, new QuanitityComparison());
                            displayProducts(products);
                            break;
                            case 6:
                            System.out.println("Binary Searching in Products... ");
                            System.out.println("Searching Product LaptopDell");
                            int index =Arrays.binarySearch(products, products[4]);
                            if(index>=0){
                                System.out.println("Product found at index: "+index);
                            }
                            else{
                                System.out.println("Product not found...");
                            }
                            break;
                            case 7:
                            System.exit(0);
                            default:
                            break;
                    }
            }
    }
    catch(IllegalArgumentException e){  
        System.out.println(e.getMessage());
    }
    catch(NullPointerException e){
        System.out.println("Null can't be processed...");
    }
    catch(Exception e){
        System.out.println("Something went wrong...");  
} 
}
}