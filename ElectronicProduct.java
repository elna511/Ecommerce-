public class ElectronicProduct extends product{
    protected String brand;
    protected int warrantyPeriod;
    public ElectronicProduct(int productId, String name, float price,String brand,int warrantyPeriod ) {
        super(productId, name, price);
        this.brand=brand;
        this.warrantyPeriod=warrantyPeriod;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    public void setWarrantyPeriod(int warrantyPeriod) {
        if (warrantyPeriod<0)
            this.warrantyPeriod = Math.abs(warrantyPeriod);
        else
            this.warrantyPeriod = warrantyPeriod;
    }
}
