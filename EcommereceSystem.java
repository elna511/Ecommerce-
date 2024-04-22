//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in
import java.util.Scanner;
public class EcommereceSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ElectronicProduct e = new ElectronicProduct(1, "Smartphone", 599.9f, "samsung", 1);
        ClothingProduct c = new ClothingProduct(2, "T-shirt", 19.99f, "medium", "cotton");
        BookProduct b = new BookProduct(3, "OOP", 39.99f, "O'Reilly", "X publisher");
        System.out.println("Welcome to the E-commerce system");
        System.out.println("Please enter your ID");
        int id = input.nextInt();
        System.out.println("Please enter your Name");
        String name = input.next();
        System.out.println("Please enter your address");
        String address = input.next();
        Customer customer = new Customer(id, name, address);
        System.out.println("How many products you want to add to your cart? ");
        int num = input.nextInt();
        Cart cart = new Cart(id, num);
        for (int i = 0; i < num; i++) {
            System.out.println("Which product would you like to add? 1-smartphone 2- T-shirt 3-OOP");
            int productNumber = input.nextInt();
            switch (productNumber) {
                case 1:
                    cart.addProduct(e, i);
                    break;
                case 2:
                    cart.addProduct(c, i);
                    break;
                case 3:
                    cart.addProduct(b, i);
                    break;
                default:
                    System.out.println("Invalid product number.");
            }
        }
        System.out.println("Youre total is $" + cart.calculatePrice() + "Do you want to place an order? 1-yes 2-no");
        int choice = input.nextInt();
        if(cart.placeOrder(choice)){
            Order order = new Order(customer.getCustomerId(), 1, cart.getProducts(),cart);
            order.printOrderInfo();}
        else
            System.out.println("Order didn't place");;}}





