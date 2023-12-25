import models.Cart;
public class Main {
    public static void main(String[] args) {
        int[] prices1 = {50, 30, 25, 40};
        int[] prices2 = {20, 15, 35};
        int[] prices3 = {10, 20, 15, 30, 25};

        Cart cart1 = new Cart(1, "Shop A", prices1);
        Cart cart2 = new Cart(2, "Shop B", prices2);
        Cart cart3 = new Cart(3, "Shop C", prices3);


        cart1.displayCartTotal();
        cart2.displayCartTotal();
        cart3.displayCartTotal();
    }
}