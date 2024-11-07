import java.util.Comparator;
public class QuanitityComparison implements Comparator<Product>{
    //Sorting the products by name using Comparator interface
    @Override
    public int compare(Product p1, Product p2){
        return p1.getQuantity()-p2.getQuantity();
    }    
}
