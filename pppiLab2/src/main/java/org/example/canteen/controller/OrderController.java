package org.example.canteen.controller;

import org.example.canteen.model.Order;
import org.example.canteen.model.OrderItem;
import org.example.canteen.model.Dish;

/**
 * Контролер для роботи з замовленнями.
 */
public class OrderController {

    private Order order;

    /**
     * Створює новий контролер для замовлень.
     */
    public OrderController() {
        this.order = new Order();
    }

    /**
     * Додає нову страву до замовлення.
     *
     * @param dish Страва, яку потрібно додати.
     * @param quantity Кількість страви.
     */
    public void addDishToOrder(Dish dish, int quantity) {
        OrderItem item = new OrderItem(dish, quantity);
        order.addItem(item);
    }

    /**
     * Повертає загальну суму поточного замовлення.
     *
     * @return Загальна сума.
     */
    public double getTotalOrderAmount() {
        return order.getTotalAmount();
    }
}
