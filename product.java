public class product {
    protected int productId;
    protected String name;
    protected float price;
    public product(int productId, String name, float price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        if (productId<0)
            this.productId=Math.abs(productId);
        else
            this.productId = productId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(float price) {
        if (price<0)
            this.price=Math.abs(price);
        else
            this.price = price;
    }
}
