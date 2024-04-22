public class Cart {
    protected int customerId;
    protected int nProducts;
    protected product[] products;
    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        this.products = new product[nProducts];
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }
    public int getnProducts() {
        return nProducts;
    }
    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }
    public product[] getProducts() {
        return products;
    }
    public void setProducts(product[] products) {
        this.products = products;
    }
    public void addProduct(product p, int index) {
        if (index >= 0 && index < nProducts)
            products[index] = p;
    }
    public void removeProduct(int index) {
        if (index >= 0 && index < nProducts)
            products[index] = null;
    }
    public double calculatePrice() {
        double totalPrice = 0;
        for (product p : products) {
            if (p != null)
                totalPrice += p.getPrice();
        }
        return totalPrice;
    }
    public boolean placeOrder(int choice) {
        if (choice == 1)
            return true;
        else
            return false;}}
