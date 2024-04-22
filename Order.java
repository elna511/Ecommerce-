public class Order {
    protected int customerId;
    protected int orderId;
    protected product[]products;
    protected double totalPrice;

    public Order(int customerId, int orderId, product[] products,Cart c) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = c.calculatePrice();
    }
    public void printOrderInfo(){
        System.out.println("Here is your order's summary :");
        System.out.println("Order ID:"+orderId);
        System.out.println("Customer ID:"+customerId);
        System.out.println("Products:");
        for (product p : products) {
            if (p != null) {
                System.out.println( p.getName() + " - Price: $" + p.getPrice());
            }
        }
        System.out.println("Totl price :$"+totalPrice);
    }
}
