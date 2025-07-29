package demoprograms.interfaces;

class FoodCourt implements Dmart {
    @Override
    public void buyProduct(String productName, double price) {
        System.out.println("FoodCart: You bought " + productName + " for ₹" + price);
    }

    @Override
    public void viewOffers() {
        System.out.println("FoodCart Offers: Buy 1 Get 1 Free on all snacks!");
    }
}

