package org.example.canteen.model;

/**
 * Клас, що представляє страву у системі їдальні.
 */
public class Dish {

    private String name;
    private double price;
    private int calories;

    /**
     * Створює нову страву.
     *
     * @param name Назва страви.
     * @param price Ціна страви.
     * @param calories Калорії в страві.
     */
    public Dish(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    /**
     * Повертає назву страви.
     *
     * @return Назва страви.
     */
    public String getName() {
        return name;
    }

    /**
     * Повертає ціну страви.
     *
     * @return Ціна страви.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Повертає кількість калорій у страві.
     *
     * @return Калорії страви.
     */
    public int getCalories() {
        return calories;
    }
}
