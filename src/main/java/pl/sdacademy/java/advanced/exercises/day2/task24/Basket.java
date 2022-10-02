package pl.sdacademy.java.advanced.exercises.day2.task24;

public class Basket {
    private int currentNumberOfItems;

    public Basket() {
        currentNumberOfItems = 0;
    }

    public void addToBasket() {
        if(currentNumberOfItems == 10) {
            throw new BasketFullException("Too many items in the basket!");
        }
        currentNumberOfItems++;
    }

    public void removeFromBasket() {
        if(currentNumberOfItems == 0) {
            throw new BasketEmptyException("Can't remove item from empty basket");
        }
        currentNumberOfItems--;
    }
}
