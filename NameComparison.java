import java.util.Comparator;
public class NameComparison implements Comparator<Product>{
    //Sorting the products by name using Comparator interface
    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
