package pl.sdacademy.java.advanced.exercises.day2.task25;

public class Basket {
    private int currentNumberOfItems;

    public Basket() {
        currentNumberOfItems = 0;
    }

    public void addToBasket() throws BasketFullExceptionAsChecked {
        if(currentNumberOfItems == 10) {
            throw new BasketFullExceptionAsChecked("Too many items in the basket!");
        }
        currentNumberOfItems++;
    }

    public void removeFromBasket() throws BasketEmptyExceptionAsChecked {
        if(currentNumberOfItems == 0) {
            throw new BasketEmptyExceptionAsChecked("Can't remove item from empty basket");
        }
        currentNumberOfItems--;
    }
}
