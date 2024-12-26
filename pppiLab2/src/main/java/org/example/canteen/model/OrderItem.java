package org.example.canteen.model;

/**
 * Клас, що представляє позицію замовлення (страву у певній кількості).
 *
 * @see Dish
 */
public class OrderItem {

    private Dish dish;
    private int quantity;

    /**
     * Створює нову позицію замовлення.
     *
     * @param dish Страва, яка буде додана до замовлення.
     * @param quantity Кількість страв.
     */
    public OrderItem(Dish dish, int quantity) {
        this.dish = dish;
        this.quantity = quantity;
    }

    /**
     * Повертає страву з замовлення.
     *
     * @return Страва.
     */
    public Dish getDish() {
        return dish;
    }

    /**
     * Повертає кількість страв у замовленні.
     *
     * @return Кількість страв.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Повертає загальну вартість для цієї позиції.
     *
     * @return Загальна вартість.
     */
    public double getTotalPrice() {
        return dish.getPrice() * quantity;
    }
}
