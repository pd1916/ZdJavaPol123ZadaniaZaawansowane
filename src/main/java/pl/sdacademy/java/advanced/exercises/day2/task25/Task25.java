package pl.sdacademy.java.advanced.exercises.day2.task25;

public class Task25 {
    public static void main(String[] args){
        Basket basket = new Basket();
        try {
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
            basket.addToBasket();
        } catch(BasketFullExceptionAsChecked ex) {
            System.out.println(ex);
        }

        try {
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
            basket.removeFromBasket();
        } catch (BasketEmptyExceptionAsChecked ex) {
            System.out.println(ex);
        }
    }
}
