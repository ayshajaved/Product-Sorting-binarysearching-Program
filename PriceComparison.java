import java.util.Comparator;
public class PriceComparison implements Comparator<Product>{
    //Sorting the products by price using Comparator interface
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getPrice()-p2.getPrice();
    }
    
}
