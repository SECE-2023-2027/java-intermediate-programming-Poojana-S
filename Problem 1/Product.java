public class Product{
    private String productId;
    private String productName;
    private double price;
    private int stockQuantity;
    Product(String productId, String productName, double price, int stockQuantity){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
        this.stockQuantity=stockQuantity;
    }
    public String getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }
    public int getStockQuantity(){
        return stockQuantity;
    }
    public void setProductId(String productId){
        this.productId=productId;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setStockQuantity(int stockQuantity){
        this.stockQuantity=stockQuantity;
    }
    public double applyDiscount(double percentage){
        double disAmt=(percentage/100)*price;
        price=price-disAmt;
        return price;
    }
}