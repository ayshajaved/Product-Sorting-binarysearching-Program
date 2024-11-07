public class Product implements Comparable<Product>{
    private int Id;
    private String name;
    private int price;
    private String category;
    private int quantity;
    public Product(int Id, String name, int price, String category, int quantity){
        if(Id == 0|| name == null||name.trim().isEmpty()|| price == 0|| category == null || quantity == 0 ){
            throw new IllegalArgumentException("Invalid input");
        }
        this.Id = Id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return String.format("%-15d %-15s %-10d %-15s %-10d\n", getId(),getName(),getPrice(),getCategory(),getQuantity());
    }
    @Override
    public int compareTo(Product p){
        return this.getId()-p.getId();
    }
}