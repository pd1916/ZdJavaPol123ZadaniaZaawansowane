package pl.sdacademy.java.advanced.exercises.day2.task24;

public class Task24 {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket(); //dodaję 10ty element
        //basket.addToBasket(); //dodaję 11ty element, rzucam exception

        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket(); //usuwam 10ty element
        try {
            basket.removeFromBasket(); //usuwam 11ty element, rzucam exception
        } catch(BasketEmptyException ex) {
            System.out.println("Komunikat z sekcji catch");
        } finally {
            System.out.println("Komunikat z sekcji finally");
        }
    }
}
