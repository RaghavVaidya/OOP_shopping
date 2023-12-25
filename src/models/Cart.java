package models;

public class Cart {
    int id;
    String shopName;
    int[] itemPrice;

    public Cart(int id, String shopName, int[] itemPrice) {
        this.id = id;
        this.shopName = shopName;
        this.itemPrice = itemPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int[] getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int[] itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void displayCartTotal() {
        int total = 0;
        int[] itemPrices = this.getItemPrice();
        for (int i = 0; i < itemPrices.length; i++) {
            total += itemPrices[i];
        }

        System.out.println("Cart ID: " + this.getId());
        System.out.println("Shop Name: " + this.getShopName());
        System.out.println("Total: " + total);
        System.out.println("------------------------------------");
    }

}
