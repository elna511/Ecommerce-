public class ClothingProduct extends product {
    protected  String size;
    protected  String fabric;

    public ClothingProduct(int productId, String name, float price,String size,String fabric) {
        super(productId, name, price);
        this.size=size;
        this.fabric=fabric;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getFabric() {
        return fabric;
    }
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
}
